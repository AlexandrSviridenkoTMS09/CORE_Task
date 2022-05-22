package Task3;

import java.util.Scanner;

public class TextProcessorHelper {

    public static String addWordEnd(String text) {
        String otherText = "Fine!";
        text = text.concat(otherText);
        return text;
    }

    public static String addBeforeFirstWord(String text) {
        String new_text = (new StringBuilder(text)).insert(6, " dear").toString();
        return new_text;
    }

    public static String deleteCharacter(String text) {
        String newText = text.replace("!", "");
        return newText;
    }

    public static String changeWord(String text) {
        String newText = text.replace("user", "programmer");
        return newText;
    }

    public static StringBuilder backToFront(String text) {
        StringBuilder sb = new StringBuilder();
        String[] words = text.split(" ");
        for (String word : words) {
            char[] text_char = word.toCharArray();
            for (int i = text_char.length - 1; i >= 0; i--) {
                sb.append(text_char[i]);
            }
            sb.append(" ");
        }
        return sb;
    }

    public static String removeSpaces(String text) {
        String[] words = text.split(" ");
        String final_text = "";
        for (String word : words) {
            final_text += word;
        }
        return final_text;
    }

    public static String removeLowercaseCharacters(String text) {
        String new_text = text;
        String final_text1;
        new_text = new_text.toUpperCase();
        char[] text_char = text.toCharArray();
        char[] new_text_char = new_text.toCharArray();
        int counter = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text_char[i] == ' ') {
                i++;
            }
            if (text_char[i] == new_text_char[i]) {
                counter++;
            }
        }

        char[] final_text = new char[counter];
        int j = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text_char[i] == ' ') {
                i++;
            }
            if (text_char[i] == new_text_char[i]) {
                final_text[j] = text_char[i];
                j++;
            }
        }

        final_text1 = new String(final_text);
        return final_text1;
    }

    public static String choiceOfEverySecondLetter(String text) {

        StringBuilder newText = new StringBuilder();
        char[] text_char = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            if (i % 2 == 1) {
                newText.append(text_char[i]);
            }
        }
        String final_text = newText.toString();
        final_text = final_text.toUpperCase();
        return final_text;
    }

    public static String findWordsOrSpaceAndPrintThem() {
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
        String finalText = "";
        for (String word : words
        ) {
            finalText = finalText + word + "\n";

        }
        return finalText;
    }

    public static void equals() {
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





