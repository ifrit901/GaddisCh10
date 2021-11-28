package ch10java6thedition;
import java.util.Scanner;
/**
 * This is code listing 10-14, which demonstrates 
 * overriding superclass methods.
 * 
 * @author craig
 */
public class CurvedActivityDemo {
	public static void main(String[]args) {
		double score;	// The raw score
		double curvePercent; // The curve percentage

		// Create a Scanner object 
		Scanner input = new Scanner(System.in);

		// Get the unadjusted exam score
		System.out.println("Enter the unadjusted exam score:");

		score = input.nextDouble();

		// Get the curve percentage
		System.out.println("Enter the curve percentage:");

		curvePercent = input.nextDouble();

		// Create a CurvedActivity object
		CurvedActivity curvedExam = new CurvedActivity(curvePercent);

		// Set the exam score
		curvedExam.setScore(score);

		// Display the raw score
		System.out.println("The raw exam score is " + curvedExam.getRawScore());

		// Display the exam grade
		System.out.println("The curved score is " + curvedExam.getScore());

		// Display the exam grade
		System.out.println("The exam grade is " + curvedExam.getGrade());

	}		
}
