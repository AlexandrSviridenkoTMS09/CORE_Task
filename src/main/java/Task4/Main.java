package Task4;

import org.w3c.dom.Text;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите текст: ");
        Scanner console = new Scanner(System.in);
        String text = console.nextLine();

        TextProcessorHelper2 textProcessorHelper2 = new TextProcessorHelper2();
        textProcessorHelper2.Task1(text);
        textProcessorHelper2.Task2(text);
        textProcessorHelper2.Task3(text);
        textProcessorHelper2.Task4(text);
        textProcessorHelper2.Task5(text);
        textProcessorHelper2.Task6(text);
        textProcessorHelper2.Task7(text);
        textProcessorHelper2.Task8(text);
        textProcessorHelper2.Task9();
        textProcessorHelper2.Task10();
    }
}
