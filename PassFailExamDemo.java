package ch10java6thedition;
import java.util.Scanner;
/**
 * This is code listing 10-23. It demonstrates the 
 * PassFailExam class.
 * 
 * @author craig
 */
public class PassFailExamDemo {
	public static void main(String[]args) {
		int questions;	// The number of questions on the exam
		int missed;	// The numberof questions missed
		double minPassing;	// The minimum passing score

		Scanner input = new Scanner(System.in);

		// Get the number of questions on the exam
		System.out.println("How many questions are on the exam?");
		questions = input.nextInt();

		// Get the number of questions missed
		System.out.println("How many questions did the student miss?");
		missed = input.nextInt();

		// Get the minimum passing score
		System.out.println("What is the minimum passing score?");
		minPassing = input.nextDouble();

		// Create a PassFailExam object
		PassFailExam exam = new PassFailExam(questions, missed, minPassing);
		
		// Display the points for each question
		System.out.println("Each question is worth " + exam.getPointsEach());

		// Display the exam score
		System.out.println("The exam score is " + exam.getScore());
		
		// Display the exam grade
		System.out.println("The letter grade for the exam is " + exam.getGrade());
	}	
}
