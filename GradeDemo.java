package ch10java6thedition;
import javax.swing.JOptionPane;
/**
 * This tests the GradedActivity class.
 * 
 * @author craig
 */
public class GradeDemo {
	public static void main(String[]args) {
		String input;
		double testScore;

		// Create a GradedActivity object
		GradedActivity ga = new GradedActivity();

		// Get a test score
		input = JOptionPane.showInputDialog(null, "Enter a test score: ");
		testScore = Double.parseDouble(input);

		// Set the score
		ga.setScore(testScore);

		JOptionPane.showMessageDialog(null, "The grade you entered is " 
			+ ga.getScore() + ", that score gives you a " + ga.getGrade());

		System.exit(0);
	}	
}
