package ch10java6thedition;
import java.util.Scanner;
/**
 * Code Listing 10-43. This program demonstrates 
 * an anonymous inner class.
 * 
 * @author craig
 */
public class AnonymousClassDemo {
	public static void main(String[]args) {
		int num;

		// Create a scanner object to read keyboard input.
		Scanner scanner = new Scanner(System.in);

		// Create an object that implements IntCalculator
		IntCalculator square = new IntCalculator() {
			public int calculate(int number) {
				return number * number;
			}
		};

		// Get a number from the user
		System.out.println("Enter an integer number: ");
		num = scanner.nextInt();

		// Display the square of the number 
		System.out.println("The square of the number is " + square.calculate(num));
	}		
}
