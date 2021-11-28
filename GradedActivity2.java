package ch10java6thedition;

/**
 * A class that holds a grade for a graded activity. 
 * 
 * @author craig
 */
public class GradedActivity2 {
	protected double score;	// Numeric score

	/**
	 * The setScore method sets the score field.
	 * @param s The value to be stored in the score field.
	 */
	public void setScore(double s) {
		score = s;
	}

	/**
	 * The getScore method returns the score.
	 * @return The value in 'score'.
	 */
	public double getScore() {
		return score;
	}

	/**
	 * The getGrade method return a letter grade
	 * determined from the score field.
	 * @return The letter grade.
	 */
	public char getLetterGrade() {
		char letterGrade;

		if(score >= 90) 
			letterGrade = 'A';
		else if(score < 90 && score >= 80)
			letterGrade = 'B';
		else if(score < 80 && score >= 70) 
			letterGrade = 'C';
		else if(score < 70 && score >= 60)
			letterGrade = 'D';
		else
			letterGrade = 'F';

		return letterGrade;
	}
}
