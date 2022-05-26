package Task7;

public class School {
    private static int counter = 0;
    private static final int school_number = 1;

    private final String surname;
    private final String name;
    private double gpa;

    public School(String surname, String name, double gpa) {
        this.surname = surname;
        this.name = name;
        this.gpa = gpa;

        counter++;

        System.out.println("\nDefault constructor execution - " + counter + "\n");
    }

    public static int getCounter() {
        return counter;
    }

    public static int getSchool_number() {
        return school_number;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String toString() {
        return surname + " " + name + " " + gpa;
    }

}
