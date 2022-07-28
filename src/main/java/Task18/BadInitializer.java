package Task18;

import java.lang.reflect.Field;

public class BadInitializer extends Initializer {

    public static <T> void initialize(T target, String fieldName, Object value) throws NoSuchFieldException {
        Class<?> targetClass = target.getClass();

        Field field = targetClass.getDeclaredField(fieldName);
        field.setAccessible(true);

        try {
            field.set(target, value);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
