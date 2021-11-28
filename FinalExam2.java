package ch10java6thedition;

/**
 * This is code listing 10.19. It determines the grade for 
 * a final exam. The numeric score is rounded up to the 
 * next whole number if it's fractional part is greater 
 * than .5 
 * 
 * @author craig
 * 
 */
public class FinalExam2 extends GradedActivity2{
	private int numQuestions;	// The number of questions.
	private double pointsEach;	// Points for each question 
	private int numMissed;	// Number of questions missed

	/**
	 * The constructor sets the number of questions on the exam
	 * and the number of questions missed. 
	 * @param questions The number of questions on the test.
	 * @param missed The number of questions that were missed.
	 */
	public FinalExam2(int questions, int missed) {
		double numericScore; 	// To hold a numeric score

		// Set the numQuestions and the numMissed fields.
		numQuestions = questions;
		numMissed = missed;

		// Calculate the points for each question and the numeric
		// score for this exam.
		pointsEach = 100.0 / questions;
		numericScore = 100.0 - (pointsEach * missed);

		// Call the inherited setScore method to set the numeric score
		setScore(numericScore);

		// Adjust the score
		adjustScore();
	}	
	/**
	 * The getPointsEach method returns the number of 
	 * points each question is worth.
	 * @return The value in the pointsEach field.
	 */
	public double getPointsEach() {
		return pointsEach;
	}

	/**
	 * The getNumMissed method returns the number of 
	 * questions missed. 
	 * @return The value in the numMissed field.
	 */
	public int getNumMissed() {
		return numMissed;
	}

	/**
	 * The adjustScore method adjusts a numeric score.
	 * If score is within .5 points of the next whole number,
	 * it rounds the score up.	
	 */
	private void adjustScore() {
		double fraction;

		// Get the fractional part of the score
		fraction = score - (int)score;

		// If the fractional part of the score is .5 or greater,
		// round score up to the next whole number.
		if(fraction >= .5) 
			score = score + (1 - fraction);
	}
}
