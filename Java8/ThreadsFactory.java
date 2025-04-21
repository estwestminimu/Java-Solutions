/**
 * Interfejs fabryki wÄtkĂłw. KaĹźda z metod dostarcza tylko
 * jednego wÄtku. KaĹźdÄ z metod wolno wywoĹaÄ tylko jeden raz.
 */
public interface ThreadsFactory {
    /**
     * Metoda zwraca obiekt-wÄtek w stanie NEW (nieuruchomiony). WÄtek przeznaczony
     * wyĹÄcznie do odczytu danych rozpoczynajÄc od pozycji 0.
     *
     * @param run kod do wykonania w wÄtku
     * @return wÄtek, ktĂłry przekazany kod wykona
     */
    Thread leftReadOnlyThread(Runnable run);

    /**
     * Metoda zwraca obiekt-wÄtek w stanie NEW (nieuruchomiony). WÄtek przeznaczony
     * wyĹÄcznie do odczytu danych rozpoczynajÄc od maksymalnej pozycji w tablicy.
     *
     * @param run kod do wykonania w wÄtku
     * @return wÄtek, ktĂłry przekazany kod wykona
     */
    Thread rightReadOnlyThread(Runnable run);

    /**
     * WÄtek, ktĂłry ma prawa do zapisu.
     *
     * @param run kod do realizacji w wÄtku
     * @return wÄtek, w ktĂłrym kod zostanie wykonany
     */
    Thread writeOnlyThread(Runnable run);
}