package ch10java6thedition;
import java.util.Scanner;
/**
 * This is code listing 10-12, Cube Demo.
 * 
 * @author craig
 */
public class CubeDemo {
	public static void main(String[]args) {
		/**
		 * This program demonstrates passing arguments to 
		 * a superclass constructor.
		 */
		double length; 	// The cube's length
		double width;	// The cube's width
		double height;	// The cube's height

		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Get the cube's dimensions
		System.out.println("Enter the following dimensions for a cube:");
		System.out.println("Length: ");

		length = input.nextDouble();

		System.out.println("Width: ");

		width  = input.nextDouble();

		System.out.println("Height: ");

		height = input.nextDouble();

		// Create a cube object and pass the dimensions to the constructor
		Cube cube = new Cube(length, width, height); 

		// Display the cube's properties
		System.out.println("Here are the cube's properties.");

		System.out.println("Length: " + cube.getLength());
		System.out.println("Width: " + cube.getWidth());
		System.out.println("Height: " + cube.getHeight());
		System.out.println("Base area: " + cube.getSurfaceArea());
		System.out.println("Volume: " + cube.getVolume());

	}	
}
