package ch10java6thedition;

/**
 * This is code listing 10-22. It is a more specialized class 
 * for determining a passing grade.
 * 
 * @author craig
 */
public class PassFailExam extends PassFailActivity{
	private int numQuestions;	// The number of questions
	private double pointsEach;	// The point value of a question
	private int numMissed;	// The number of questions missed

	/**
	 * The constructor sets the number of questions, the number of 
	 * missed questions, and the minimum passing score.
	 * @param questions The number of questions on the test.
	 * @param missed The number of questions missed.
	 * @param minPassing The minimum passing score.
	 */	
	public PassFailExam(int questions, int missed, double minPassing) {
		// Call the superclass constructor
		super(minPassing);

		// Declare a local variable for the numeric score
		double numericScore;

		// Set the numQuestions and numMissed fields
		numQuestions = questions;
		numMissed = missed;

		// Calculate the points for each question and 
		// the numeric score for this exam
		pointsEach = 100.0 / questions;
		numericScore = 100.0 - (pointsEach * missed);

		// Call the superclass's setScore method to set the score
		setScore(numericScore);
	}

	/**
	 * The getPointsEach method returns the point value
	 * of each question.
	 * @return The value in pointsEach.
	 */
	public double getPointsEach() {
		return pointsEach;
	}

	/**
	 * The getNumMissed method returns the value in numMissed.
	 * @return The number of questions missed.
	 */
	public int getNumMissed() {
		return numMissed;
	}
}
