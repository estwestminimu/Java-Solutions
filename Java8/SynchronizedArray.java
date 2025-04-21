import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SynchronizedArray implements Array {
    private final int[] data;
    private final boolean[] readFlags; // Flagi odczytu
    private final ReentrantReadWriteLock[] locks;

    public SynchronizedArray(int[] initialValues) {
        this.data = initialValues.clone(); // Kopiujemy tablicę wejściową
        this.readFlags = new boolean[initialValues.length]; // Wszystkie początkowo nieodczytane
        this.locks = new ReentrantReadWriteLock[initialValues.length];
        for (int i = 0; i < initialValues.length; i++) {
            locks[i] = new ReentrantReadWriteLock();
        }
    }

    @Override
    public int size() {
        return data.length;
    }

    @Override
    public int get(int position) {
        if (position < 0 || position >= data.length) {
            throw new IndexOutOfBoundsException("Position out of bounds: " + position);
        }
        locks[position].writeLock().lock(); // Zmieniamy na writeLock, aby oznaczyć odczyt
        try {
            if (readFlags[position]) {
                throw new IllegalStateException("Position already read: " + position);
            }
            readFlags[position] = true; // Oznaczamy jako odczytane
            return data[position];
        } finally {
            locks[position].writeLock().unlock();
        }
    }

    @Override
    public void set0(int position) {
        if (position < 0 || position >= data.length) {
            throw new IndexOutOfBoundsException("Position out of bounds: " + position);
        }
        locks[position].writeLock().lock();
        try {
            data[position] = 0; // Ustawiamy 0
        } finally {
            locks[position].writeLock().unlock();
        }
    }
}
