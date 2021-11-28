package ch10java6thedition;

/**
 * This program demonstrates the toString and equals
 * methods that are inherited from the Object class.
 * 
 * @author craig
 */
public class ObjectMethods {
	public static void main(String[]args) {
		// Create two objects
		PassFailExam exam1 = new PassFailExam(0, 0, 0);
		PassFailExam exam2 = new PassFailExam(0, 0, 0);

		// Send the objects to println, which can call 
		// the toString method
		System.out.println(exam1.toString());
		System.out.println(exam2.toString());

		// Test the equals method
		if(exam1.equals(exam2))
			System.out.println("They are the same.");
		else
			System.out.println("They are not the same.");
	}	
}
