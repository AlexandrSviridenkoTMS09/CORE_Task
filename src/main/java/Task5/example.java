package Task5;

import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        System.out.println("Input number of manse ");
        Scanner console = new Scanner(System.in);
        int number_monat = console.nextInt();
        Monat monat = Monat.values()[number_monat - 1];
        if (number_monat > 0 && number_monat < 13) {
            System.out.println(monat + " " + monat.getHWFS());
        } else {
            System.out.println(number_monat);
        }
    }
}

enum Monat {
    September("herbst"),
    October("herbst"),
    November("herbst"),
    December("winter"),
    Januar("winter"),
    Februar("winter"),
    March("fruling"),
    April("fruling"),
    May("fruling"),
    June("sommer"),
    July("sommer"),
    August("sommer");

    private final String HWFS;

    Monat(String HWFS) {
        this.HWFS = HWFS;
    }

    public String getHWFS() {
        return this.HWFS;
    }
}

