package Task5;

import java.util.Scanner;

public class Days_of_the_week {
    public static void main(String args[]) throws Exception {   /*как реализовать через enum и будет ли это короче?*/
        System.out.println("Введите порядковый номер дня недели: ");
        Scanner console = new Scanner(System.in);
        int number_day = console.nextInt();

        String[] day = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String[] short_day = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        String not_weekend = " is not a weekend";
        String weekend = "is a weekend";
        String weekend_or_not = "";
        if (number_day > 7 && number_day < 1) {
            System.out.println(number_day);
        } else {
            if (number_day == 6 || number_day == 7) {
                weekend_or_not = weekend;
                System.out.println(day[number_day - 1] + " " + short_day[number_day - 1] + weekend_or_not);
            } else {
                weekend_or_not = not_weekend;
                System.out.println(day[number_day - 1] + " " + short_day[number_day - 1] + weekend_or_not);
            }
        }
    }
}
