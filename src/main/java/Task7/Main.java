package Task7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        metodCountAverageGrade(InputInfo());
    }

    public static int InputInfo() {
        int size;
        Scanner in = new Scanner(System.in);
        Metods metods = new Metods();

        do {
            System.out.print("Input amount of students (the value should be natural): ");
            size = Integer.parseInt(in.nextLine());
        } while (size < 1);
        return size;
    }

    public static void metodCountAverageGrade(int size) {
        double gpa;
        Metods metods = new Metods();
        School[] students = new School[size];

        for (int i = 0; i < size; i++) {
            students[i] = metods.InputStudent();
        }

        gpa = metods.countAverageGrade(students);
        System.out.printf("%.2f\n", gpa);

        for (int i = 0; i < size; i++) {

            if (metods.badStudent(students[i], gpa)) {
                metods.display(students[i]);
            }
        }
    }
}
