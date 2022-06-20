package Task13;

import java.io.Console;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String survivor;
        int amountWarrior = inputAmountWarrior();

        List<String> list = initList(new MyArrayList<>(), amountWarrior);

        survivor = killWarriors(list, 2);
        System.out.println(survivor);

        List<String> linkedList = initList(new MyLinkedList<>(), amountWarrior);

        survivor = killWarriors(linkedList, 2);
        System.out.println(survivor);
    }

    public static int inputAmountWarrior() {
        Scanner console = new Scanner(System.in);
        System.out.println("Input amount of people: ");
        int inputWarrior = console.nextInt();
        checkInput(inputWarrior);
        return inputWarrior;
    }

    private static void checkInput(int input) {
        if (input <= 0) {
            throw new IllegalArgumentException("input: " + input);
        }
    }

    public static List<String> initList(List<String> list, int amountPeople) {
        for (int i = 1; i <= amountPeople; i++) {
            list.add(Integer.toString(i));
        }

        return list;
    }

    public static String killWarriors(List<String> list, int coef) {
        int nextToKill = coef - 1;

        while (list.size() != 1) {
            list.remove(nextToKill);
            nextToKill = calculateNext(nextToKill, list.size(), coef - 1);
        }
        return list.get(0);
    }

    public static int calculateNext(int previous, int size, int difference) {
        int next = previous + difference;

        while (next >= size) {
            next -= size;
        }

        return next;
    }
}

