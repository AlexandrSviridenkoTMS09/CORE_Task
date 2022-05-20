package Task3;

import java.util.Scanner;

public class Printer {
    public static void main(String[] args) {
        System.out.println("Введите текст: ");
        Scanner console = new Scanner(System.in);
        String text = console.nextLine();

        System.out.println(TextProcessorHelper.addWordEnd(text));
        System.out.println(TextProcessorHelper.addBeforeFirstWord(text));
        System.out.println(TextProcessorHelper.deleteCharacter(text));
        System.out.println(TextProcessorHelper.changeWord(text));
        System.out.println(TextProcessorHelper.backToFront(text));
        System.out.println(TextProcessorHelper.removeSpaces(text));
        System.out.println(TextProcessorHelper.choiceOfEverySecondLetter(text));
        System.out.println(TextProcessorHelper.removeLowercaseCharacters(text));
        System.out.println(TextProcessorHelper.findWordsOrSpaceAndPrintThem());
        TextProcessorHelper.equals();
    }
}
