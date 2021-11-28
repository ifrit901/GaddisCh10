package ch10java6thedition;

/**
 * This is code listing 10-28 which demonstrates 
 * the CompSciStudent class.
 * 
 * @author craig
 */
public class CompSciStudentDemo {
	public static void main (String [] args) {
		// Create a CompSciStudent object
		CompSciStudent csStudent = 
			new CompSciStudent("Jennifer Haynes", "167W98337", 2015);

		// Store the values for math, compSci, and gen ed hours 
		csStudent.setMathHours(12);
		csStudent.setCsHours(20);
		csStudent.setGenEdHours(40);

		// Display the student's data
		System.out.println(csStudent);

		// Display the remaining hours 
		System.out.println("Hours remaining: " + csStudent.getRemainingHours());
	}	
}
