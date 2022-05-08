package Task5;

import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        System.out.println("Input number of manse");
        Scanner console = new Scanner(System.in);
        int number_manse = console.nextInt();
        Monse monse = Monse.values()[number_manse - 1];
        if (number_manse > 0 && number_manse < 13) {
            System.out.println(monse + " " + monse.getHWFS());
        } else {
            System.out.println(number_manse);
        }
    }
}

enum Monse {
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

    Monse(String HWFS) {
        this.HWFS = HWFS;
    }

    public String getHWFS() {
        return this.HWFS;
    }
}

