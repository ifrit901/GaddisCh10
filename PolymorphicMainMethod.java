package ch10java6thedition;

/**
 * This is to demonstrate passing a class as an argument
 * to a main method instead of String[]args.
 * 
 * @author craig
 */
public class PolymorphicMainMethod {
	public static void main(GradedActivity g) {
		System.out.println("Score: " + g.getScore() + ", Grade: " + g.getGrade());
	}	
}
