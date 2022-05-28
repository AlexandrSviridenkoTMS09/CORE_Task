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




