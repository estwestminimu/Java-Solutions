import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Adnotacja pola przeznaczonego do prezentacji przez metodę typu {@code toString()}.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ToString {
    /**
     * Priorytet pola. Im wyższy priorytet tym pole powinno być umieszczone wcześniej w ciągu znaków.
     *
     * @return priorytet pola
     */
    int priority() default 10;

    /**
     * Kolejność sortowania pól o identycznym priorytecie.
     *
     * @return porządek sortowania
     */
    Order order() default Order.ASCENDING;
}
