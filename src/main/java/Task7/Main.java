package Task7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        methodCountAverageGrade(inputInfo());
    }

    public static int inputInfo() {
        int size;
        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Input amount of students (the value should be natural): ");
            size = Integer.parseInt(in.nextLine());
        } while (size < 1);
        return size;
    }

    public static void methodCountAverageGrade(int size) {
        double gpa;
        Methods methods = new Methods();
        School[] students = new School[size];

        for (int i = 0; i < size; i++) {
            students[i] = methods.InputStudent();
        }

        gpa = methods.countAverageGrade(students);
        System.out.printf("%.2f\n", gpa);

        for (int i = 0; i < size; i++) {

            if (methods.badStudent(students[i], gpa)) {
                methods.display(students[i]);
            }
        }
    }
}
