import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class FastParallelCalculations implements ParallelCalculations {

    @Override
    public List<List<Double>> map(Function function, int size, int threads) {
        double[][] intermediateResult = new double[size][size];

        ExecutorService executor = Executors.newFixedThreadPool(threads);
        AtomicInteger taskIndex = new AtomicInteger(0);
        int totalTasks = size * size;

        Runnable worker = () -> {
            int task;
            while ((task = taskIndex.getAndIncrement()) < totalTasks) {
                int row = task / size;
                int col = task % size;
                double value = function.get(row, col);
                intermediateResult[row][col] = value;
            }
        };

        for (int i = 0; i < threads; i++) {
            executor.submit(worker);
        }

        executor.shutdown();
        try {
            if (!executor.awaitTermination(30, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
            Thread.currentThread().interrupt();
        }

        List<List<Double>> result = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            List<Double> row = new ArrayList<>(size);
            for (int j = 0; j < size; j++) {
                row.add(intermediateResult[i][j]);
            }
            result.add(row);
        }

        return result;
    }
}
