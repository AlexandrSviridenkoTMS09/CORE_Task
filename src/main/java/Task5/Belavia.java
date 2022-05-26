package Task5;

import java.util.Scanner;

public class Belavia {
    String city;
    String type;
    int numberAircraft;

    public Belavia(String city, int number_aircraft, String type) {
        this.city = city;
        this.numberAircraft = number_aircraft;
        this.type = type;
    }

    public Belavia() {
    }

    public String getCity() {
        return city;
    }

    public int getNumberAircraft() {
        return numberAircraft;
    }

    public String getType() {
        return type;
    }

    public static void main(String[] args) {
        findFly();
    }

    public static void findFly() {
        Scanner scanner = new Scanner(System.in);
        Belavia[] flightList = inputInfo(scanner);
        int count = 0;
        System.out.println("Введите необходимый тип перевозки:  ");
        String flightType = scanner.next();
        for (Belavia b : flightList
        ) {
            if (b.getType().equalsIgnoreCase(flightType)) {
                System.out.println(b.city + " " + b.numberAircraft);
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

    public static Belavia[] inputInfo(Scanner scanner) {
        System.out.println("ВВедите размерность массива: ");
        Belavia[] userFlyList = new Belavia[scanner.nextInt()];
        int count = 0;
        while (count < userFlyList.length) {
            System.out.println("Введите город прибытия: ");
            String inputCity = scanner.next();
            System.out.println("Введите номер рейса: ");
            int inputNumber = scanner.nextInt();
            System.out.println("Введите тип перевозки: ");
            String inputType = scanner.next();
            userFlyList[count] = new Belavia(inputCity, inputNumber, inputType);
            count++;
        }
        return userFlyList;
    }
}
