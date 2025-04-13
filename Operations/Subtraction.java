// Subtraction.java
// Declaring the package where this class belongs
package Operations;

// Importing Scanner class to read user input
import java.util.Scanner;

// Creating a public class named Subtraction 
public class Subtraction {
    public static void perform(Scanner sc) {
        // Asking the user to enter the numbers
        System.out.print("Enter first number: ");
        double a = sc.nextDouble(); 
        System.out.print("Enter second number: ");
        double b = sc.nextDouble(); 

        // Performing subtraction
        double result = a - b;

        // Displaying the final result
        System.out.println("Result = " + result);
    }
}
