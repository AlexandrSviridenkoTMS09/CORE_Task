package Task9;

import Task9.animals.Animal;
import Task9.animals.Dragonfly;
import Task9.animals.Horse;
import Task9.animals.Kangaroo;

public class Main {
    public static void main(String[] args) {
        voice();
        move();
        isHungry();
    }

    public static Animal[] initAnimal() {
        Animal[] herd = new Animal[7];

        herd[0] = new Horse("Horse", 4, false);
        herd[1] = new Horse("Horse 2", 4, false);
        herd[2] = new Kangaroo("Kangaroo", 4, true);
        herd[3] = new Kangaroo("Kangaroo 2", 4, true);
        herd[4] = new Dragonfly("Dragonfly", 6, true);
        herd[5] = new Dragonfly("Dragonfly 2", 6, true);
        herd[6] = new Animal("Unknown type", 10, true) {
        };
        return herd;
    }

    public static Animal addHorse() {
        Horse horse = new Horse("Horse 3", 4, false);
        return horse;
    }

    public static Animal addKangaroo() {
        Kangaroo kangaroo = new Kangaroo("Kangaroo 3", 4, true);
        return kangaroo;
    }

    public static Animal addDragonfly() {
        Dragonfly dragonfly = new Dragonfly("Dragonfly 3", 6, true);
        return dragonfly;
    }

    public static void voice() {
        for (Animal animal : initAnimal()) {
            animal.voice();
        }
        System.out.println();
        addHorse().voice();
        addKangaroo().voice();
        addDragonfly().voice();
        System.out.println();
    }

    public static void move() {
        for (Animal animal : initAnimal()) {
            animal.move();
        }
        System.out.println();
        addHorse().move();
        addKangaroo().move();
        addDragonfly().move();
        System.out.println();
    }

    public static void isHungry() {
        for (Animal animal : initAnimal()) {
            animal.isHungry();
        }
        System.out.println();
        addHorse().isHungry();
        addKangaroo().isHungry();
        addDragonfly().isHungry();
        System.out.println();
    }
}
