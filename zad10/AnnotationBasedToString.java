import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;


public class AnnotationBasedToString implements ToStringGenerator {

    @Override
    public String toString(Object object) {

        if (object == null) {
            throw new IllegalArgumentException();
        }

        Class<?> c = object.getClass();
        List<Field> fields = new ArrayList<>();

        for (Field f : c.getFields()) {
            if ((f.isAnnotationPresent(ToString.class))) {
                fields.add(f);
            }
        }

        fields.sort((a, b) ->
        {
            ToString a_Annotation = a.getAnnotation(ToString.class);
            ToString b_Annotation = b.getAnnotation(ToString.class);


            int priorityComparison = Integer.compare(b_Annotation.priority(), a_Annotation.priority());
            if (priorityComparison != 0) {
                return priorityComparison;
            }



            if (a_Annotation.order() == Order.ASCENDING && b_Annotation.order() == Order.DESCENDING) {
                return -1;
            }
            if (a_Annotation.order() == Order.DESCENDING && b_Annotation.order() == Order.ASCENDING) {
                return 1;
            }


            return a.toString().compareTo(b.toString());
        });

        String name = c.getSimpleName() + " ";
        StringBuilder str2 = new StringBuilder();

        for (Field f : fields) {
            int value;
            try {
                value = (int) f.get(object);
            } catch (IllegalAccessException e) {
                throw new RuntimeException();
            }
            str2.append(f.getName()).append(":").append(value).append(" ");

        }

        return (name + str2).trim();
    }
}

