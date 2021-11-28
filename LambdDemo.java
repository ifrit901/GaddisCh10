package ch10java6thedition;
import java.util.Scanner;
/**
 * Code Listing 10-45 demonstrates a 
 * simple lambda expression.
 * 
 * @author craig
 */
public class LambdDemo {
	public static void main(String[]args) {
		int num;

		// Create a scanner object
		Scanner scanner = new Scanner(System.in);

		// Create an object that implements IntCalculator
		IntCalculator square = x -> x * x;

		// Get a number from the user
		System.out.println("Enter a number: ");

		num = scanner.nextInt();

		// Display the square of the number
		System.out.println("The square of the number " + num 
			+ " is " + square.calculate(num));
	}	
}
