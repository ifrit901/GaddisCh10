package ch10java6thedition;
import java.util.Scanner;
/**
 * Programming challenge #4 demonstrates the Essay class.
 * 
 * @author craig
 * 6/15/21
 * 12:41pm
 * At work with Colin
 */
public class EssayDemo {
	public static void main(String[]args) {
		int grammar, spelling, length, content;

		Essay essay = new Essay();

		Scanner input = new Scanner(System.in);

		System.out.println("What is the grammar grade?");
		grammar = Integer.valueOf(input.nextLine());
		essay.setGrammar(grammar);

		System.out.println("What is the spelling grade?");
		spelling = Integer.valueOf(input.nextLine());
		essay.setSpelling(spelling);

		System.out.println("What is the length grade?");
		length = Integer.valueOf(input.nextLine());
		essay.setLength(length);

		System.out.println("What is the content grade?");
		content = Integer.valueOf(input.nextLine());
		essay.setContent(content);

		essay.setScore(grammar, spelling, length, content);

		System.out.println("The grade for the essay is " + essay.getGrade());
		
	}	
}
