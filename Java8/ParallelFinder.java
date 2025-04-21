import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ParallelFinder implements Finder {
    private ThreadsFactory threadsFactory;
    private Array array;
    private final BlockingQueue<Integer> writeQueue = new LinkedBlockingQueue<>();
    private final List<Integer> foundPositions = Collections.synchronizedList(new ArrayList<>());

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
        int size = array.size();
        Thread leftThread = threadsFactory.leftReadOnlyThread(() -> processRange(0, size / 2, value));
        Thread rightThread = threadsFactory.rightReadOnlyThread(() -> processRange(size - 1, size / 2 - 1, value));
        Thread writerThread = threadsFactory.writeOnlyThread(this::writeZeros);

        leftThread.start();
        rightThread.start();
        writerThread.start();

        try {
            leftThread.join();
            rightThread.join();
            // Dodanie specjalnej wartości do kolejki, aby sygnalizować koniec pracy
            writeQueue.put(-1);
            writerThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Threads were interrupted", e);
        }

        return new ArrayList<>(foundPositions);
    }

    private void processRange(int start, int end, int value) {
        int step = start < end ? 1 : -1;

        for (int i = start; i != end + step; i += step) {
            try {
                int element = array.get(i); // Odczytujemy element
                if (element == value) {
                    foundPositions.add(i);  // Dodajemy indeks do wyników
                    writeQueue.put(i);      // Przekazujemy indeks do zapisania
                }
            } catch (IllegalStateException e) {
                // Ignorujemy, bo oznacza to, że pozycja została już odczytana
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    private void writeZeros() {
        try {
            while (true) {
                int index = writeQueue.take();
                if (index == -1) break; // Koniec pracy
                array.set0(index);     // Ustawiamy 0 w tablicy
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
