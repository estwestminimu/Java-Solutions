public class SimpleArray implements Array {
    private final int[] data;

    public SimpleArray(int[] data) {
        this.data = data;
    }

    @Override
    public synchronized int size() {
        return data.length;
    }

    @Override
    public synchronized int get(int position) {
        if (position < 0 || position >= data.length) {
            throw new IndexOutOfBoundsException("Invalid index: " + position);
        }
        return data[position];
    }

    @Override
    public synchronized void set0(int position) {
        if (position < 0 || position >= data.length) {
            throw new IndexOutOfBoundsException("Invalid index: " + position);
        }
        data[position] = 0;
    }
}
