import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class PrzepisImpl implements Przepis {
    private final String nazwaPotrawy;
    private final Set<Skladnik> skladniki;

    public PrzepisImpl(String nazwaPotrawy, Set<Skladnik> skladniki) {
        this.nazwaPotrawy = nazwaPotrawy;
        // Tworzymy kopię zbioru, aby zapobiec niepożądanym modyfikacjom
        this.skladniki = new HashSet<>(skladniki);
    }

    @Override
    public String naCo() {
        return nazwaPotrawy;
    }

    @Override
    public Set<Skladnik> sklad() {
        // Zwracamy niemodyfikowalną kopię składników
        return Collections.unmodifiableSet(skladniki);
    }

    // Metoda pomocnicza do prezentacji przepisu
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Przepis na: ").append(nazwaPotrawy).append("\n");
        for (Skladnik skladnik : skladniki) {
            builder.append(" - ").append(skladnik).append("\n");
        }
        return builder.toString();
    }
}
