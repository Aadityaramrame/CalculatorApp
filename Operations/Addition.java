// Addition.java
// Declaring the package where this class belongs
package Operations;

// Importing Scanner class for taking user input
import java.util.Scanner;

// Creating a public class named Addition
public class Addition {
    public static void perform(Scanner sc) {
        // Prompting user to enter the two numbers
        System.out.print("Enter first number: ");
        double a = sc.nextDouble(); 
        System.out.print("Enter second number: ");
        double b = sc.nextDouble(); 

        // Performing the addition operation
        double result = a + b;

        // Displaying the result to the user
        System.out.println("Result = " + result);
    }
}
