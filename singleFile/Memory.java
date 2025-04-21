/**
 * Interfejs dostÄpu do pamiÄci RAM.
 */
public interface Memory {
    /**
     * Pisanie danej value pod adres address.
     *
     * @param address adres komĂłrki pamiÄci. Od 0 do size() - 1 wĹÄcznie.
     * @param value   wartoĹÄ do pisania. Od 0 do 255 wĹÄcznie.
     */
    void set(int address, short value);

    /**
     * Odczyt danej spod adresu address.
     *
     * @param address adres komĂłrki pamiÄci do odczytku. Od 0 do size() - 1 wĹÄcznie
     * @return zawartoĹÄ komĂłrki pamiÄci o adresie address. Od 0 do 255 wĹÄcznie.
     */
    short get(int address);

    /**
     * Rozmiar pamiÄci.
     *
     * @return liczba bajtĂłw w pamiÄci.
     */
    short size();
}