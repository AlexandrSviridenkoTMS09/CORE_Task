package Task12;

import java.io.Console;
import java.util.*;

public class Helper {

    public static String input(){
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        return input;
    }

    public static boolean checkInput(String input){
    int bracketIndex;
    char[] inputChars = input.toCharArray();

    Deque<Character> stack = new ArrayDeque<>();
    List<Character> openBrackets = Arrays.asList('[','{','<','(');
    List<Character> closeBrackets = Arrays.asList(']','}','>',')');

        for (char aChar : inputChars) {
        if (openBrackets.contains(aChar)) {
            stack.add(aChar);
        } else if (closeBrackets.contains(aChar)) {

            bracketIndex = closeBrackets.indexOf(aChar);

            if (openBrackets.get(bracketIndex) != stack.pollLast()) {
                return false;
            }
        }
    }
    return stack.isEmpty();
    }
}

