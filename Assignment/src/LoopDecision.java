import java.util.Scanner;

public class LoopDecision {
	//1.3 loop control and decision making
    public static void main(String[] args) {
        // Decision Making
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer for decision making: ");
        int userNumber = scanner.nextInt();

        // If-else statement
        if (userNumber > 0) {
            System.out.println("The entered number is positive.");
        } else if (userNumber < 0) {
            System.out.println("The entered number is negative.");
        } else {
            System.out.println("The entered number is zero.");
        }

        // Switch statement
        System.out.print("Enter a day number (1-7) to get the day of the week: ");
        int dayNumber = scanner.nextInt();

        String day;
        switch (dayNumber) {
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
                break;
            default:
                day = "Invalid day";
        }

        System.out.println("Day of the week: " + day);

        // Loops
     
        int max = 3;
        // For loop
        System.out.println("Using for loop:");
        for (int i = 0; i < max; i++) {
            System.out.println("Hello");
        }

        // While loop
        System.out.println("Using while loop:");
        int counter = 0;
        while (counter < max) {
            System.out.println("Hello");
            counter++;
        }

        // Do-while loop
        System.out.println("Using do-while loop:");
        int doWhileCounter = 0;
        do {
            System.out.println("Hello");
            doWhileCounter++;
        } while (doWhileCounter < max);
    }
}
