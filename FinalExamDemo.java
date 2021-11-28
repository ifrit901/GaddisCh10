package ch10java6thedition;
import javax.swing.JOptionPane;
/**
 * This is code listing 10 - 4, FinalExamDemo.
 * It demonstrates the FinalExam class which extends
 * the GradedActivity class.
 * 
 * @author craig
 */
public class FinalExamDemo {
	public static void main(String[]args) {

		String input;	// To hold input
		int numQuestions;	// Number of questions
		int missed;	// Number of questions missed
	
		// Get the number of questions on the exam
		input = JOptionPane.showInputDialog("How many questions were on the exam?");

		numQuestions = Integer.parseInt(input);

		// Get the number of questions the student missed
		input = JOptionPane.showInputDialog("How many questions were missed?");

		missed = Integer.parseInt(input);

		// Create a FinalExam object
		FinalExam fe = new FinalExam(numQuestions, missed);

		// Display the test results
		JOptionPane.showMessageDialog(null, "Each question was worth " +
			fe.getPointsEach() + "\nThe exam score is " + fe.getScore() +
			"\nThe final exam grade for this student "
			+ "is " + fe.getGrade());

		System.exit(0);
	}
}
