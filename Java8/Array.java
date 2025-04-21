/**
 * Interfejs dostÄpu do jednowymiarowej tablicy
 */
public interface Array {
    /**
     * Rozmiar tablicy. Dozwolone indeksy od zero do size()-1.
     *
     * @return rozmiar tablicy
     */
    public int size();

    /**
     * ZawartoĹÄ tablicy na pozycji position.
     *
     * @param position poĹoĹźenie w tablicy
     * @return zapisana w tablicy wartoĹÄ
     */
    public int get(int position);

    /**
     * Ustawia 0 na wskazanej pozycji tablicy.
     *
     * @param position pozycja w tablicy, w ktĂłrej zapisane zostanie 0.
     */
    public void set0(int position);
}