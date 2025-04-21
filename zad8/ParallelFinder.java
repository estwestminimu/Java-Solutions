import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
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

        
        final AtomicInteger a_index = new AtomicInteger(0);
        final AtomicInteger b_index = new AtomicInteger(array.size() - 1);

        final AtomicInteger end = new AtomicInteger(0);

        BlockingQueue<Integer> queueWrite = new LinkedBlockingQueue<>();

        List<Integer> result = Collections.synchronizedList(new ArrayList<>());

        Thread leftReader = threadsFactory.leftReadOnlyThread(() -> {
            while (a_index.get() < b_index.get()) {
                final int index_A = a_index.getAndIncrement();
                if (array.get(index_A) == value) {
                    try {
                        queueWrite.put(index_A);
                            result.add(index_A);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            try {
                queueWrite.put(-1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });


        Thread rightReader = threadsFactory.rightReadOnlyThread(() -> {
            while (a_index.get() <= b_index.get()) {
                final int index_B = b_index.getAndDecrement();
                if (array.get(index_B) == value) {
                    try {
                        queueWrite.put(index_B);
                            result.add(index_B);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            try {
                queueWrite.put(-1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread writer = threadsFactory.writeOnlyThread(() -> {
            while (true) {
                try {
                    final int index  = queueWrite.take();
                    if(index != -1)
                    {
                    array.set0(index);
                    }
                    else
                    {

                        if(end.addAndGet(1) == 2)
                        {
                            break;
                        }
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
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


        return result;
    }
}
