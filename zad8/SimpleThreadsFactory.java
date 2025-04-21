public class SimpleThreadsFactory implements ThreadsFactory {
    private boolean leftThreadUsed = false;
    private boolean rightThreadUsed = false;
    private boolean writeThreadUsed = false;

    @Override
    public synchronized Thread leftReadOnlyThread(Runnable run) {
        if (leftThreadUsed) {
            throw new IllegalStateException("Left read-only thread has already been created");
        }
        leftThreadUsed = true;
        return new Thread(run);
    }

    @Override
    public synchronized Thread rightReadOnlyThread(Runnable run) {
        if (rightThreadUsed) {
            throw new IllegalStateException("Right read-only thread has already been created");
        }
        rightThreadUsed = true;
        return new Thread(run);
    }

    @Override
    public synchronized Thread writeOnlyThread(Runnable run) {
        if (writeThreadUsed) {
            throw new IllegalStateException("Write-only thread has already been created");
        }
        writeThreadUsed = true;
        return new Thread(run);
    }
}
