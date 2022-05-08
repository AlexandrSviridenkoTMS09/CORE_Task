package Task9;

import java.util.LinkedList;

public class outOfMemoryError {
    public static void main(String[] args) {
        String str = "Peter";
        LinkedList<String> linkedList = new LinkedList<String>();
        while(true){
            str=str+"Welcome to Hell";
            linkedList.add(str);
        }
    }
}
