package ch10java6thedition;

/**
 * This is code listing 10-26. It demonstrates an abstract class
 * that holds general data about a student. Classes representing
 * specific types of students should inherit from this class. 
 * 
 * @author craig
 */
public abstract class Student {
	
	private String name; 		// Name of the student
	private String idNumber;	// Student ID
	private int yearAdmitted;	// Year admitted

	/**
	 * The constructor sets the student's name, ID number
	 * and the year they were admitted.
	 * @param n The name of the student.
	 * @param id The student's ID number.
	 * @param year The year the student was admitted.
	 */
	public Student(String n, String id, int year) {
		name = n;
		idNumber = id;
		yearAdmitted = year;
	}

	/**
	 * The toString method returns a String containing the student's
	 * data. 
	 * @return A reference to a String.
	 */
	public String toString() {
		String str = "Name: " + name + "\nID: " 
			+ idNumber + "\nYear Admitted: " 
			+ yearAdmitted;
		return str;
	}

	/**
	 * The getRemainingHours method is abstract. 
	 * It must be overridden in a subclass. 
	 * @return The hours remaining for the student.
	 */
	public abstract int getRemainingHours(); 
}
