/**
 * Interfejs generatora opisu obiektu.
 */
public interface ToStringGenerator {
    /**
     * Generuje opis obiektu na podstawie pól oznaczonych adnotacją @ToString.
     *
     * @param object obiekt, którego opis należy wygenerować
     * @return ciąg znaków z opisem obiektu
     */
    String toString(Object object);
}
