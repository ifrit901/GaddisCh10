package ch10java6thedition;

/**
 * This is code listing 10-34, which demonstrates the 
 * FinalExam3 class implementing the Relatable
 * interface. 
 * 
 * @author craig
 */
public class RelatableExams {
	public static void main(String [] args) {
		// Exam #1 had 100 questions and the student 
		// missed 20 of them.
		FinalExam3 exam1 = new FinalExam3(100, 20);

		// Exam #2 had 100 questions and the student
		// missed 30 of them.
		FinalExam3 exam2 = new FinalExam3(100, 30);

		// Display the exam scores
		System.out.println("Exam 1: " + exam1.getScore());
		System.out.println("Exam 2: " + exam2.getScore());

		// Compare the exams
		if (exam1.equals(exam2)) {
			System.out.println("The exams are equal.");
		}

		if (exam1.isGreater(exam2)) {
			System.out.println("The Exam 1 is greater.");
		}

		if (exam1.isLess(exam2)) {
			System.out.println("The Exam 1 is the least.");
		}
	
		
	}	
}
