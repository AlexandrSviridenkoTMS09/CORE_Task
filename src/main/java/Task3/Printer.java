package Task3;

import java.util.Scanner;

public class Printer {
    public static void main(String[] args) {
        System.out.println("Введите текст: ");
        Scanner console = new Scanner(System.in);
        String text = console.nextLine();

        TextProcessorHelper2 textProcessorHelper2 = new TextProcessorHelper2();
        System.out.println(textProcessorHelper2.addWordEnd(text));
        System.out.println(textProcessorHelper2.addBeforeFirstWord(text));
        System.out.println(textProcessorHelper2.deleteCharacter(text));
        System.out.println(textProcessorHelper2.changeWord(text));
        System.out.println(textProcessorHelper2.backToFront(text));
        System.out.println(textProcessorHelper2.removeSpaces(text));
        System.out.println(textProcessorHelper2.choiceOfEverySecondLetter(text));
        System.out.println(textProcessorHelper2.removeLowercaseCharacters(text));
        System.out.println(textProcessorHelper2.findWordsOrSpaceAndPrintThem());
        textProcessorHelper2.equals();
    }
}
