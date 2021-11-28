package ch10java6thedition;

/**
 * This is code listing 10-21. This class holds a numeric score and 
 * determines whether it is passing or failing.
 * 
 * @author craig
 */
public class PassFailActivity extends GradedActivity{
	private double minPassingScore;	// Minimum passing score

	/**
	 * The constructor sets the minimum passing score.
	 * @param mps The minium passing score.
	 */
	public PassFailActivity(double mps) {
		minPassingScore = mps;
	}

	/**
	 * The getGrade method returns a letter grade determined from the
	 * score field. This method overrides the superclass method.
	 * @return The letter grade.
	 */
	@Override 
	public char getGrade() {
		char letterGrade;

		if(super.getScore() > minPassingScore)
			letterGrade = 'P';
		else
			letterGrade = 'F';

		return letterGrade;
	}
}
