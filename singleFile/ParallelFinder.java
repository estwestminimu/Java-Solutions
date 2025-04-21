import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class ParallelFinder implements Finder {

    private ThreadsFactory threadsFactory;
    private Array array;



    @Override
    public void setThreadsFactory(ThreadsFactory factory) {
        this.threadsFactory = factory;
    }

    @Override
    public void setArray(Array array) {
        this.array = array;
    }

    @Override
    public List<Integer> start(int value) {

        //aby wiedziec gdzie indeks sie konczy aby na siebie nie zaszły
        //[...a...b...]
         final AtomicInteger a_index = new AtomicInteger(0);
         final AtomicInteger b_index = new AtomicInteger(array.size()-1);


         final AtomicBoolean a_index_end = new AtomicBoolean(false);
        final AtomicBoolean b_index_end = new AtomicBoolean(false);

         //kolejka do zapisywanua
        BlockingQueue<Integer> queueWrite = new LinkedBlockingQueue<>();

        List<Integer> result = new ArrayList<>();
        CopyOnWriteArrayList<Integer> TEST1 = new CopyOnWriteArrayList<>();

        Thread leftReader = threadsFactory.leftReadOnlyThread(() -> {

           /*
            //Aby sprawdzicz czy watek sie nie blokuje
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            */

            while (a_index.get() < b_index.get())
            {
                int indexA = a_index.getAndIncrement();
            if(indexA== value)
            {
                try {
                    queueWrite.put(indexA);

                    //jest to zwykla lista wiec najbezpieczniej zrobic przez
                    synchronized (result) {
                        result.add(indexA);
                    }

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }


                a_index_end.set(true);
                //TEST
                System.out.println("L"+a_index.get());
                TEST1.add(a_index.get());

            }
        });


        Thread rightReader = threadsFactory.rightReadOnlyThread(() -> {
            while (a_index.get() < b_index.get())
            {
                int indexB = b_index.getAndDecrement();

                    try {
                        queueWrite.put(indexB);

                        //jest to zwykla lista wiec najbezpieczniej zrobic przez
                        synchronized (result) {
                            result.add(indexB);
                        }

                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }


                b_index_end.set(true);
                //TEST
                System.out.println("P"+b_index.get());
                TEST1.add(b_index.get());

            }
        });


        Thread writer = threadsFactory.writeOnlyThread(() -> {
            try {
            while(!a_index_end.get() || !b_index_end.get() || !queueWrite.isEmpty())
            {
                Integer index = queueWrite.poll();

                if (index !=null)
                {
                    array.set0(index);
                }
                else
                {
                    Thread.sleep(5);
                }

            }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }


        });



        leftReader.start();
        rightReader.start();
        writer.start();

        try {
            leftReader.join();
            rightReader.join();
            writer.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }


        // ==================
        //TEST 1
        Set<Integer> uniqueElements = new HashSet<>(TEST1);
        int uniqueCount = uniqueElements.size();
        System.out.println("Zawartość listy: " + TEST1);
        if (uniqueCount != 10) {
            throw new AssertionError("Test failed: Liczba unikalnych elementów wynosi " + uniqueCount + ", oczekiwano 10.");
        }
       // ==================



        return result;
    }
}
