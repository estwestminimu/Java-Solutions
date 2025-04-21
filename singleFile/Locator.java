/**
 * Interfejs lokalizatora
 */
public interface Locator {
    /**
     * WyjÄtek zgĹaszanny, gdy podana kolumna jest duĹźa
     */
    class ColumnToHighException extends Exception {
        private static final long serialVersionUID = 1338640189615772849L;
    };

    /**
     * WyjÄtek zgĹaszany, gdy podana kolumna jest za maĹa
     */
    class ColumnToLowException extends Exception {
        private static final long serialVersionUID = -1149972781727632717L;
    }

    /**
     * WyjÄtek zgĹaszany, gdy podany wiersz jest za duĹźy
     */
    class RowToHighException extends Exception {
        private static final long serialVersionUID = -7339887856127998936L;
    }

    /**
     * WyjÄtek zgĹaszany, gdy podany wiersz jest za maĹy
     */
    class RowToLowException extends Exception {
        private static final long serialVersionUID = -1932358281879377610L;
    }

    /**
     * Informacja o maksymalnym, poprawnym indeksie wiersza.
     *
     * @return maksymalna wartoĹÄ jakÄ moĹźna przypisaÄ do wiersza
     */
    int maxRow();

    /**
     * Informacja o minimalnym, poprawnym indeksie wiersza
     *
     * @return najmniejsza wartoĹÄ jakÄ moĹźna przypisaÄ do wiersza
     */
    int minRow();

    /**
     * Informacja o maksymalnym, poprawnym indeksie kolumny.
     *
     * @return maksymalna wartoĹÄ jakÄ moĹźna przypisaÄ do kolumny
     */
    int maxCol();

    /**
     * Informacja o minimalnym, poprawnym indeksie kolumny
     *
     * @return najmniejsza wartoĹÄ jakÄ moĹźna przypisaÄ do kolumny
     */
    int minCol();

    /**
     * Test, czy to podana pozycja jest tÄ poszukiwanÄ. W przypadku pudĹa zgĹaszany
     * jest wyjÄtek informujÄcy o powodzie poraĹźki. Z uwagi na to, Ĺźe moĹźna
     * jednoczeĹnie zgĹosiÄ tylko jeden wyjÄtek, w przypadku jednoczesnego bĹÄdnego
     * podania zĹej kolumny i zĹego wiersza zgĹaszany jest jeden z dwĂłch moĹźliwych
     * wyjÄtkĂłw. WybĂłr zgĹaszanego wyjÄtku odbywa siÄ losowo. Znalezienie
     * poszukiwanego miejsca moĹźna rozpoznaÄ, bo wtedy metoda nie zgĹosi Ĺźadnego
     * wyjÄtku.
     *
     *
     * @param position pozycja
     * @throws ColumnToHighException kolumna za duĹźa
     * @throws ColumnToLowException  kolumna za maĹa
     * @throws RowToHighException    wiersz za duĹźy
     * @throws RowToLowException     wiersz za maĹy
     */
    void here(Position2D position)
            throws ColumnToHighException, ColumnToLowException, RowToHighException, RowToLowException;
}