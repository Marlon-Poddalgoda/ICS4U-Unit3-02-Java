import java.util.Scanner;
/**
 * This program calculates the factorial of an inputted number using recursion.
 *
 * @author  Marlon Poddalgoda
 * @version 1.0
 * @since 2021-05-07
 */

public final class Factorial {
    private Factorial() {

        // Throw an exception if this ever *is* called
        throw new AssertionError("Instantiating utility class.");
    }

    /**
    * This method calculates a factorial of a number using recursion.
    * @param userNum This value is the user inputted number.
    * @return userNum This value returns the factorial.
    */
    public static int factorialFunc(final int userNum) {
        // uses recursion to find the factorial of a number

        // if statement
        if (userNum == 1) {
            return userNum;
        } else if (userNum == 0) {
            return 1;
        } else {
            // calculates factorial
            // solves by multiplying number by factorial of itself minus 1
            return (userNum * factorialFunc(userNum - 1));
        }
    }


    /**
    * This method takes in user input and passes to the function.
    * @param args
    */
    public static void main(final String[] args) {

        // Create new Scanner-type variable
        Scanner userInput = new Scanner(System.in);

        // variables
        int intInput;
        int factorialInt;

        // program information
        System.out.println("This program calculates the factorial of a number"
            + " using recursion.");
        System.out.println();

        // Asks user to enter a integer
        System.out.print("Enter a positive integer: ");

        while (true) {
            // check if input is an integer
            while (!userInput.hasNextInt()) {
                System.out.println("That's not a number!");
                System.out.print("Enter a positive integer: ");
                userInput.next(); // moves scanner until correct value
            }
            intInput = userInput.nextInt();

            if (intInput >= 0) {
                // call factorial function
                factorialInt = factorialFunc(intInput);

            } else {
                // error catch
                System.out.println("Please enter a positive number.");
                System.out.print("Enter a positive integer: ");
                continue;

            }
            break;
        }

        // print output to console
        System.out.println("");
        System.out.println("The factorial of " + intInput + " is "
                            + factorialInt);

        System.out.println("");
        System.out.println("Done.");
    }
}
