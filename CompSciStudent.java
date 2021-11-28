package ch10java6thedition;

/**
 * This is code listing 10-27. It is a class that holds data for a computer
 * science student.
 *
 * @author craig
 */
public class CompSciStudent extends Student {

	// Required hours

	private final int MATH_HOURS = 20; 	// Math hours
	private final int CS_HOURS = 40;	// Computer Science hours
	private final int GEN_ED_HOURS = 60;	// General Education hours

	// Hours taken
	private int mathHours;	// Math hours taken
	private int csHours;		// Comp sci hours taken
	private int genEdHours;	// General Education hours

	/**
	 * The constructor sets the student's name, ID number and the year
	 * admitted.
	 *
	 * @param n The student's name.
	 * @param id The student's ID number.
	 * @param year The year the student was admitted.
	 */
	public CompSciStudent(String n, String id, int year) {
		
		super(n, id, year);

	}

	/**
	 * The setMathHours method sets the number of 
	 * math hours taken.
	 * @param math The math hours taken.
	 */
	public void setMathHours(int math) {
		mathHours = math;
	}

	/**
	 * The setCsHours method sets the number of 
	 * computer science hours taken.
	 * @param cs The computer science hours taken.
	 */
	public void setCsHours(int cs) {
		csHours = cs;
	}

	/**
	 * The setGenEdHours method sets the number of 
	 * general education hours taken.
	 * @param genEd The general education hours taken.
	 */
	public void setGenEdHours(int genEd) {
		genEdHours = genEd;		
	}

	/**
	 * The getRemainingHours method returns the number of 
	 * hours remaining to be taken. 
	 * @return The hours remaining for the student.
	 */
	@Override
	public int getRemainingHours() {
		int reqHours,	// The total reqired hours
		     remainingHours;	// The remaining compSci hours

		// Calculate the required hours
		reqHours = MATH_HOURS + CS_HOURS + GEN_ED_HOURS;

		// Calculate the remaining hours
		remainingHours = reqHours - (mathHours + csHours + genEdHours);

		return remainingHours;
	}

	/**
	 * The toString method returns a string containing 
	 * the student's data.
	 * @return a reference to a String.
	 */
	@Override
	public String toString() {
		String str;

		str = 	super.toString() + 
			"\nMajor: Computer Science" + 
			"\nMath hours taken: " + mathHours +
			"\nComputer Science hours taken: " + csHours +
			"\nGeneral Ed hours taken: " + genEdHours;

		return str;

	}
}
