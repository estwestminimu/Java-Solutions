import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Tablica wejściowa
        int[] initialArray = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};

        // Inicjalizacja tablicy z danymi wejściowymi
        SynchronizedArray array = new SynchronizedArray(initialArray);

        // Inicjalizacja fabryki wątków
        SimpleThreadsFactory threadsFactory = new SimpleThreadsFactory();

        // Inicjalizacja i konfiguracja ParallelFinder
        ParallelFinder finder = new ParallelFinder();
        finder.setThreadsFactory(threadsFactory);
        finder.setArray(array);

        // Liczba do wyszukania
        int valueToFind = 5;

        // Uruchomienie wyszukiwania
        System.out.println("Rozpoczęcie wyszukiwania liczby " + valueToFind);
        List<Integer> foundPositions = finder.start(valueToFind);

        // Wynik
        System.out.println("Znalezione pozycje: " + foundPositions);
        System.out.println("Tablica po operacjach:");
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }
    }
}
