import java.util.Scanner;
//1.6 exception handling
public class ExceptionHandling {

    // Method using throws keyword
    public static void throwsException() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int userInput = scanner.nextInt();

        if (userInput < 0) {
            throw new Exception("Negative numbers are not allowed.");
        }

        System.out.println("You entered: " + userInput);
    }

    // Method using throw keyword
    public static void throwException() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter another number: ");

        int userInput = scanner.nextInt();

        if (userInput < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed.");
        }

        System.out.println("You entered: " + userInput);
    }

    public static void main(String[] args) {
        try {
            throwsException();
        } catch (Exception e) {
            System.out.println("Caught exception using throws: " + e.getMessage());
        }

        try {
            throwException();
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception using throw: " + e.getMessage());
        }
    }
}
