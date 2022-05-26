package Task8;

public class StackOverflowError {
    public static void main(String[] args) {
        StackOverflowError stackOverflowError = new StackOverflowError();
        int number = 0;
        int a = stackOverflowError.calculateFactorial(number);
    }
    public int calculateFactorial ( int number){
        return number * calculateFactorial(number - 1);
    }
}
