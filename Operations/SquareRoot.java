//SquareRoot.java

// Declaring the package where this class belongs
package Operations;

// Importing Scanner class to read user input
import java.util.Scanner;

// Creating a public class named SquareRoot
public class SquareRoot {
    public static void perform(Scanner sc) {
        // Asking the user to enter the number
        System.out.print("Enter number: ");
        double a = sc.nextDouble();

        // Throwing ArithmeticException
        if (a < 0) {
            throw new ArithmeticException("Cannot compute square root of negative number!");
        }

        // Performing square root
        double result = Math.sqrt(a);

        // Displaying the final result
        System.out.println("Square Root = " + result);
    }
}
