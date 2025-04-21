import java.util.Set;


public interface Przepis {


    default String naCo() {
        return "Przepis na potrawe";
    }


    Set<Skladnik> sklad();
}