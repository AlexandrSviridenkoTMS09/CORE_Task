package Task4;

import java.util.Arrays;
import java.util.Scanner;

public class TextProcessorHelper2 {

    static void Task1(String text) {
        String otherText = "Fine!";
        text = text.concat(otherText);
        System.out.println(text);
    }

    static void Task2(String text) {
        String new_text = (new StringBuilder(text)).insert(6, " dear").toString();
        System.out.println(new_text);
    }

    static void Task3(String text) {
        System.out.println(text.replace("!", ""));
    }

    static void Task4(String text) {
        System.out.println(text.replace("user", "programmer"));
    }

    static void Task5(String text) {
        StringBuilder sb = new StringBuilder();
        String[] words = text.split(" ");
        for (String word : words) {
            char[] text_char = word.toCharArray();
            for (int i = text_char.length - 1; i >= 0; i--) {
                sb.append(text_char[i]);
            }
            sb.append(" ");
        }
        System.out.println(sb);
    }

    static void Task6(String text) {
        String[] words = text.split(" ");
        String final_text = "";
        for (String word : words) {
            final_text += word;
        }
        System.out.println(final_text);
    }

    static void Task7(String text) {
        String new_text = text;
        new_text = new_text.toUpperCase();
        char[] text_char = text.toCharArray();
        char[] new_text_char = new_text.toCharArray();

        for (int i = 0; i < text.length(); i++) {
            if (text_char[i] == ' ') {
                i++;
            }
            if (text_char[i] == new_text_char[i]) {
                System.out.print(text_char[i]);
            }
        }
    }

    static void Task8(String text) {

        StringBuilder newText = new StringBuilder();
        char[] text_char = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            if (i % 2 == 1) {
                newText.append(text_char[i]);
            }
        }
        String final_text = newText.toString();
        final_text = final_text.toUpperCase();
        System.out.println(final_text);
    }

    static void Task9() {
        System.out.println("Введите размер массива: ");
        Scanner console = new Scanner(System.in);
        int size = console.nextInt();
        console.nextLine();
        String[] final_text = new String[size];
        System.out.println("Введите текст массива: ");
        String result = "";
        for (int i = 0; i < size; i++) {
            String text1 = console.nextLine();
            result = result.concat("&" + (text1.equals(" ") || text1.equals("") ? "String is empty" : text1));
        }
        String[] words = result.split("&");
        for (int i = 1; i <= size; i++) {
            System.out.println(words[i]);
        }
    }


    static void Task10() {
        String str1 = "Java";
        String str2 = "JAVA";
        String str3 = "C#";
        String str4 = "Java";
        System.out.println("Первый вывод:");
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));
        System.out.println(str2.equals(str3));
        System.out.println(str2.equals(str4));
        System.out.println(str3.equals(str4));
        System.out.println("Второй вывод:");
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println("Третий вывод:");
        System.out.println(str1 == str4);
        str1 = "JavaJava";
        System.out.println(str1.substring(4) == str4);
        System.out.println(str1 == null);
        str1 = null;
        System.out.println(str1 == null);
    }
}





