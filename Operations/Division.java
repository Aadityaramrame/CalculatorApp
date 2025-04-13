//Division.java
// Declaring the package where this class belongs
package Operations;

// Importing Scanner class to read user input
import java.util.Scanner;

// Creating a public class named Division
public class Division {
    public static void perform(Scanner sc) {
        // Asking the user to enter the numbers
        System.out.print("Enter numerator: ");
        double a = sc.nextDouble();
        System.out.print("Enter denominator: ");
        double b = sc.nextDouble();

        // Throwing ArithmeticException
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }

        // Performing division
        double result = a / b;

        // Displaying the final result
        System.out.println("Result = " + result);
    }
}
