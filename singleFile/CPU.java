import java.util.List;

/**
 * Interfejs prostego CPU.
 */
public interface CPU {
    /**
     * Ustawia dostÄp do pamiÄci RAM.
     *
     * @param ram referencja do obiektu zgodnego z Memory.
     */
    void setRAM(Memory ram);

    /**
     * Zleca wykonanie programu zapisanego na liĹcie. Jedna linika kodu to jedna
     * instrukcja asemblera do wykonania.
     *
     * @param code kod do wykonania
     */
    void execute(List<String> code);
}