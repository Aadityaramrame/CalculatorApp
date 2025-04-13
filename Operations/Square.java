//Square.java
// Declaring the package where this class belongs
package Operations;

// Importing Scanner class to read user input
import java.util.Scanner;

// Creating a public class named Square
public class Square {
    public static void perform(Scanner sc) {
        // Asking the user to enter the number
        System.out.print("Enter number: ");
        double a = sc.nextDouble();
        
        // Squaring the number
        double result = a * a;

        // Displaying the final result
        System.out.println("Square = " + result);
    }
}
