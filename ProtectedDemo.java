package ch10java6thedition;
import javax.swing.JOptionPane;
/**
 * This is code listing 10.20. It demonstrates the FinalExam2 class 
 * which extends the GradedActivity2 class.
 * 
 * @author craig
 */
public class ProtectedDemo {
	public static void main(String[]args) {
		String input;	// To hold user input
		int questions;	// The number of questions
		int missed;	// The number of questions missed

		// Get the number of questions on the exam
		input = JOptionPane.showInputDialog(null, "How many questions are "
			+ "on the exam?");
		questions = Integer.parseInt(input);

		// Get the number of questions the student missed
		input = JOptionPane.showInputDialog(null, "How many problems did "
			+ "the student get wrong?");
		missed = Integer.parseInt(input);

		// Create a FinalExam object
		FinalExam2 exam = new FinalExam2(questions, missed);

		// Display the results
		JOptionPane.showMessageDialog(null, "Each question was worth " +
			exam.getPointsEach() + " points.\nThe student missed " +
			exam.getNumMissed() + " questions.\nThe exam score is " +
			exam.getScore() + ".\nThe letter grade is " + exam.getLetterGrade());
 	}	
}
