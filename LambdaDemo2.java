package ch10java6thedition;
import java.util.Scanner;
/**
 * Code Listing 10-46 demonstrates a lambda
 * expression that uses a final local varaible.
 * 
 * @author craig
 */
public class LambdaDemo2 {
	public static void main(String[]args) {
		final int factor = 10;
		int num;

		// Create a Scanner object for keyboard input
		Scanner scanner = new Scanner(System.in);

		// Create an object that implements IntCalculator
		IntCalculator multiplier = x -> x * factor;

		// Get a number from the user
		System.out.println("Enter a number: ");
		num = scanner.nextInt();

		// Display the number multiplied by 10 
		System.out.println("Multiplied by 10, that number is " 
			+ multiplier.calculate(num));
	}	
}
