package Task4;

import java.util.Scanner;

import static Task4.Weekday.print;

public class EnumDays {
    public static void main(String[] args) {
        print(introductoryInformation());

    }

    public static int introductoryInformation() {
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input the number of the day: ");
        choice = scanner.nextInt();
        return choice;
    }
}

enum Weekday {
    MONDAY(false, "MON"),
    TUESDAY(false, "TUE"),
    WEDNESDAY(false, "WED"),
    THURSDAY(false, "THU"),
    FRIDAY(false, "FRI"),
    SATURDAY(true, "SAT"),
    SUNDAY(true, "SUN");

    private final boolean weekend;
    private final String abbreviation;

    Weekday(boolean weekend, String abbreviation) {
        this.weekend = weekend;
        this.abbreviation = abbreviation;
    }


    public String getAbbreviation() {
        return this.abbreviation;
    }

    public boolean isWeekend() {
        return this.weekend;
    }

    public static void print(int num) {
        Weekday day;

        if (num > 7 || num < 1) {
            System.out.println("Wrong choice");
            return;
        }

        day = Weekday.values()[num - 1];
        System.out.println(day.getInfo());
    }

    public String getInfo() {
        return name() +
                " (" + abbreviation + ") " +
                (weekend ? "is a weekend" : "is not a weekend");
    }
}


