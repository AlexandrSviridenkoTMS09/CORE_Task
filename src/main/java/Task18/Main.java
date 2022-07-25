package Task18;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException {
        Apple apple = ObjectFactory.create(Apple.class);

        Initializer.initialize(apple, "color", "black");
        Initializer.initialize(apple, "weight", 150);

        System.out.println("Initializer: " + apple);

        BadInitializer.initialize(apple, "color", "red");
        BadInitializer.initialize(apple, "weight", 200);

        System.out.println("BadInitializer: " + apple);
    }
}
