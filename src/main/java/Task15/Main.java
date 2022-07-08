package Task15;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
import java.util.logging.Filter;

public class Main {
    public static void main(String[] args) {

        printCat(converter());

        isEvenNumber();

        greetings();

        printRandomName();

        valueConverterAndPrint();

        squareValue();

    }

    private static <T> void test(T elem, Predicate<T> predicate) {
        predicate.test(elem);
    }

    private static void testPredicate(String[] strings, Predicate<String> predicate) {
        for (int i = 0; i < strings.length; i++) {
            test(strings[i], predicate);
        }
    }

    private static void squareValue() {
        UnaryOperator<Integer> squareValue = x -> x * x;
        System.out.println(squareValue.apply(9));
    }

    private static void greetings() {
        Consumer<String> greetings = x -> System.out.println("Hello " + x + " !!!");
        greetings.accept("Elena");
    }

    private static void isEvenNumber() {
        Predicate<Integer> isEvenNumber = x -> x % 2 == 0;
        System.out.println(isEvenNumber.test(4));
        System.out.println(isEvenNumber.test(3));
    }

    private static Cat converter() {
        Converter<Dog, Cat> converter = x -> new Cat(x.name, x.weight, x.age);
        Cat cat = converter.convert(initDog());
        return cat;
    }

    private static void valueConverterAndPrint() {
        Function<String, Integer> valueConverter = x -> Integer.valueOf(x);
        System.out.println(valueConverter.apply("678"));
    }

    private static List initName() {
        List<String> nameList = new ArrayList<>();
        nameList.add("Elena");
        nameList.add("John");
        nameList.add("Jim");
        nameList.add("Alex");
        nameList.add("Sara");
        return nameList;
    }

    private static String randomChoice(List nameList) {
        Supplier<String> randomName = () -> {
            int value = (int) (Math.random() * nameList.size());
            return (String) nameList.get(value);
        };

        return randomName.get();
    }

    private static void printRandomName() {
        System.out.println(randomChoice(initName()));
    }

    private static Dog initDog() {
        Dog dog = new Dog("Bobbie", 5, 3);
        return dog;
    }

    private static void printCat(Cat cat) {
        System.out.println("Cat has parameters: name - " + cat.name + ", age - " + cat.age + ", weight - " + cat.weight);
    }
}