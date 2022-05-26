package Task7;

import java.util.Scanner;

public class Metods {

    public Metods() {
    }

    public School InputStudent() {
        String surname;
        String name;
        double gpa;
        Scanner console = new Scanner(System.in);
        System.out.println("Input surname students: ");
        surname = console.nextLine();
        System.out.println("Input name students: ");
        name = console.nextLine();

        do {
            System.out.print("Input students GPA: ");
            gpa = Double.parseDouble(console.nextLine());
        } while (gpa < 1.0d || gpa > 10.0d);


        return new School(surname, name, gpa);
    }


    public boolean badStudent(School student, double gpa) {
        return student.getGpa() < gpa;
    }

    public void display(School student) {
        System.out.println(student.toString());
    }

    public double countAverageGrade(School... students) {
        double gpa = 0;

        for (int i = 0; i < students.length; i++) {
            gpa += students[i].getGpa() / students.length;
        }
        return gpa;
    }
}
