package Task4;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TextProcessorHelper {
    String text;

    public static void main(String[] args) {

        System.out.println("Введите текст: ");
        Scanner console = new Scanner(System.in);
        String text = console.nextLine();

        char[] text_char = text.toCharArray();
        for (int j = 0; j < text.length(); j++) {
            if (text_char[j] == '!') {
                text_char[j] = ' ';
            }

            if (text_char[j] == '.' && text_char[j - 1] == '?') {
                text_char[j] = ' ';
            }
        }
        String text_string = new String(text_char);

        String[] words = text_string.split(" ");
        String[] words1 = Arrays.copyOf(words, words.length);
        int a = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words1.length; j++) {

                if (words[i].equals(words1[j])) {
                    a++;
                }
                if (a >= 2) {
                    words1[j] = "";
                    a = 0;
                }
            }
            a = 0;
        }
        for (int j = 0; j < words1.length; j++) {
            if (words1[j].equals("user")) {
                words1[j] = "user!";
            }
            System.out.print(" " + words1[j]);
        }
    }
}




