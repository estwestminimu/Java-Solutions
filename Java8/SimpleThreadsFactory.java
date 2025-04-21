public class SimpleThreadsFactory implements ThreadsFactory {
    private boolean leftThreadCreated = false;
    private boolean rightThreadCreated = false;
    private boolean writerThreadCreated = false;

    @Override
    public Thread leftReadOnlyThread(Runnable run) {
        if (leftThreadCreated) {
            throw new IllegalStateException("Left read-only thread already created");
        }
        leftThreadCreated = true;
        return new Thread(run);
    }

    @Override
    public Thread rightReadOnlyThread(Runnable run) {
        if (rightThreadCreated) {
            throw new IllegalStateException("Right read-only thread already created");
        }
        rightThreadCreated = true;
        return new Thread(run);
    }

    @Override
    public Thread writeOnlyThread(Runnable run) {
        if (writerThreadCreated) {
            throw new IllegalStateException("Write-only thread already created");
        }
        writerThreadCreated = true;
        return new Thread(run);
    }
}
