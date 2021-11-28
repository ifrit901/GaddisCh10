package ch10java6thedition;

/**
 * This is the Final Exam class. It inherits from the 
 * GradedActivity class.
 * 
 *		---------------------------------------------------
 * 		| 	FinalExam		         |
 * 		---------------------------------------------------
 * 		| - numQuestions: int		         |
 * 		| - pointsEach: double 	         |
 * 		| - numMissed: int 		         |
 * 		---------------------------------------------------
 * 		| + FinalExam(questions: int,              |
 *		| 	         missed:  int)	         |
 *		| + getPointsEach() : double	         |
 * 		| + getNumMissed() : int 	         |
 * 		---------------------------------------------------
 * 
 * @author craig
 * 4-15-21
 * 8:00am
 * on B2012 with Colin R.
 */
public class FinalExam extends GradedActivity {
	private int numQuestions;	
	private double pointsEach;
	private int numMissed;

	/**
	 * The constructor sets the number of questions 
	 * on the exam and the number of questions missed.
	 * @param questions The number of questions
	 * @param missed The number of questions missed
	 */
	public FinalExam(int questions, int missed) {
		// Variable to hold a numeric score
		double numericScore;

		// Set the numQuestions and numMissed fields
		numQuestions = questions;
		numMissed = missed;

		// Calculate the points for each question 
		// and the numeric score for this exam
		pointsEach = 100.0 / numQuestions;
		numericScore = 100.0 - (numMissed * pointsEach);

		// Call the inherited setScore method 
		setScore(numericScore);
	}

	/**
	 * The getPointsEach method returns the number 
	 * of points each question is worth.
	 * @return The value in the pointsEach field.
	 */
	public double getPointsEach() {
		return pointsEach;
	}

	/**
	 * The getNumMissed method returns the number
	 * of questions missed.
	 * @return The value in the numMissed field.
	 */
	public int getNumMissed() {
		return numMissed;
	}
}
