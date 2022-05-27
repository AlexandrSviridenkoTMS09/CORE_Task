package Task11;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person[] persons = initPersons();
        print(persons);

        Arrays.sort(persons, (o1, o2) -> {
            return Integer.compare(o1.getAge(), o2.getAge());
        });
        print(persons);

        Arrays.sort(persons);
        print(persons);
    }

    public static Person[] initPersons() {
        Person[] persons = new Person[4];
        persons[0] = new Person("Sasha", 25);
        persons[1] = new Person("Max", 20);
        persons[2] = new Person("Alex", 15);
        persons[3] = new Person("Ivan", 30);

        return persons;
    }

    public static void print(Person[] persons) {
        System.out.println();
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}

