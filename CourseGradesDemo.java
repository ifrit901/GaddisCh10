package ch10java6thedition;
import java.util.Scanner;
/**
 * This program demonstrates the CourseGrades
 * class.
 * 
 * @author craig
 * 6/17/21
 * 12:37pm
 * At home. Maria just went back home for a bit.
 */
public class CourseGradesDemo {
	public static void main(String[]args) {
		// Variables for input
		int labGrade, essayGrade, passFailGrade, finalExamGrade, 
		     numQuestions, numMissed, minimumPassingGrade = 70;

		// Create an object of the Scanner class
		Scanner input = new Scanner(System.in);

		// Get input for the lab score
		System.out.println("What is the lab grade?");
		labGrade = Integer.valueOf(input.nextLine());

		// Create Graded activity object and assign score for the lab
		GradedActivity lab = new GradedActivity();	
		lab.setScore(labGrade);

		// Get input for the pass/fail exam
		System.out.println("How many questions were on the P/F exam?");
		numQuestions = Integer.valueOf(input.nextLine());

		System.out.println("How many questions did the student miss?");
		numMissed = Integer.valueOf(input.nextLine());

		// Create a PassFailExam object and initialize the score
		PassFailExam passFail = new PassFailExam
		(numQuestions, numMissed, minimumPassingGrade);

		// Variables for Essay object
		int grammar, spelling, length, content;

		// Input for Essay
		System.out.println("These grades are for the essay.\n"
			+ "What was the grammar score?");
		grammar = Integer.valueOf(input.nextLine());

		System.out.println("What was the spelling score?");
		spelling = Integer.valueOf(input.nextLine());

		System.out.println("What was the length score?");
		length = Integer.valueOf(input.nextLine());

		System.out.println("What was the content score?");
		content = Integer.valueOf(input.nextLine());

		// Create and initialize an Essay object
		Essay essay = new Essay();
		essay.setScore(grammar, spelling, length, content);

		// Variables for final exam 
		int questions, missed;

		// Create and initialize a final exam object
		System.out.println("Lastly, how many questions were on the "
			+ "final exam?");
		questions = Integer.valueOf(input.nextLine());

		System.out.println("How many questions did the student miss?");
		missed = Integer.valueOf(input.nextLine());

		FinalExam finalExam = new FinalExam(questions, missed);

		// Create a CourseGrades object, fill its array with these 
		// objects and display their data
		CourseGrades courseGrades = new CourseGrades();
		courseGrades.setLab(lab);
		courseGrades.setEssay(essay);
		courseGrades.setPassFailExam(passFail);
		courseGrades.setFinalExam(finalExam);

		System.out.println("All grades activity\n"
			+ courseGrades.toString());
		



	}	
}
