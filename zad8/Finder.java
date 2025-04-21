import java.util.List;

/**
 * Interfejs poszukiwacza
 */
public interface Finder {
    /**
     * Ustawia dostÄp do fabryki wÄtkĂłw
     *
     * @param factory fabryka wÄtkĂłw
     */
    void setThreadsFactory(ThreadsFactory factory);

    /**
     * Ustawia dostÄp do tablicy, ktĂłrÄ naleĹźy przeszukaÄ
     *
     * @param array tablica do przeszukania
     */
    void setArray(Array array);

    /**
     * Uruchamia poszukiwania w tablicy wartoĹci value.
     *
     * @param value wartoĹÄ poszukiwana w tablicy
     * @return lista poĹoĹźeĹ, w ktĂłrych znaleziono value
     */
    List<Integer> start(int value);
}