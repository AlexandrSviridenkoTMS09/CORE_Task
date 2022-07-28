package Task18;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ObjectFactory {
    public static <T> T create(Class<T> clas) {
        T object = null;

        try {
            Constructor<T> constructor = clas.getConstructor();
            object = constructor.newInstance();

        } catch (NoSuchMethodException |
                InvocationTargetException |
                InstantiationException |
                IllegalAccessException e) {
            e.printStackTrace();
        }

        return object;
    }
}
