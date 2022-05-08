package Task6;

import java.util.Scanner;

import static Task6.Belavia.findFlyt;

public class Belavia {
    String city;
    int number_aircraft;
    String type;

    public Belavia(String city, int number_aircraft, String type) {
        this.city = city;
        this.number_aircraft = number_aircraft;
        this.type = type;
    }

    public Belavia() {

    }

    public String getCity() {
        return city;
    }

    public int getNumber_aircraft() {
        return number_aircraft;
    }

    public String getType() {
        return type;
    }

    public static void main(String[] args) {
        findFlyt();
    }

    public static void findFlyt() {
        Scanner scanner = new Scanner(System.in);
        Belavia[] flightList = input_info(scanner);
        int count = 0;
        System.out.println("Введите необходимый тип перевозки:  ");
        String flightType = scanner.next();
        for (Belavia b : flightList
        ) {
            if (b.getType().equalsIgnoreCase(flightType)) {
                System.out.println(b.city + " " + b.number_aircraft);
                count++;
            } else {
                if (count == 0) {
                    System.out.println("No flights detected");
                    count++;
                }
            }
        }
        scanner.close();
    }

    public static Belavia[] input_info(Scanner scanner) {
        System.out.println("ВВедите размерность массива: ");
        Belavia[] userflieList = new Belavia[scanner.nextInt()];
        int count = 0;
        while (count < userflieList.length) {
            System.out.println("Введите город прибытия: ");
            String input_city = scanner.next();
            System.out.println("Введите номер рейса: ");
            int input_number = scanner.nextInt();
            System.out.println("Введите тип перевозки: ");
            String input_type = scanner.next();
            userflieList[count] = new Belavia(input_city, input_number, input_type);
            count++;
        }
        return userflieList;


    }
}
