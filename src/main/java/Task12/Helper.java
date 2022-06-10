package Task12;

import java.io.Console;
import java.util.*;

public class Helper {

    public static String input(){
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        return input;
    }

    public static List<Character> openBracketsInitialization(){
        List<Character> openBrackets = Arrays.asList('[','{','<','(');
        return openBrackets;
    }

    public static List<Character> closeBracketsInitialization(){
        List<Character> closeBrackets = Arrays.asList(']','}','>',')');
        return closeBrackets;
    }

    public static boolean checkInput(String input){
    int bracketIndex;
    char[] inputChars = input.toCharArray();

    Deque<Character> stack = new ArrayDeque<>();

        for (char aChar : inputChars) {
        if (openBracketsInitialization().contains(aChar)) {
            stack.add(aChar);
        } else if (closeBracketsInitialization().contains(aChar)) {

            bracketIndex = closeBracketsInitialization().indexOf(aChar);

            if (openBracketsInitialization().get(bracketIndex) != stack.pollLast()) {
                return false;
            }
        }
    }
    return stack.isEmpty();
    }
}

