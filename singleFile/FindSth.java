/**
 * Bardzo uniwersalny interfejs poszukiwania czegokolwiek
 */
public interface FindSth {
    /**
     * Zlecenie prĂłby znalezienia czegoĹ.
     *
     * @param locator interfejs umoĹźliwiajÄcy poszukiwania
     * @return poĹoĹźenie, w ktĂłrym znaleziono coĹ
     */
    Position2D tryToFind(Locator locator);
}