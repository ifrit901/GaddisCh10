package ch10java6thedition;
import java.util.Scanner;
/**
 * Programming challenge #5, the CourseGrades class.
 * 
 * @author craig
 * 6/15/21
 * 6:18pm
 * At home with Maria
 */
public class CourseGrades implements Analyzable{
	
	GradedActivity [] grades = new GradedActivity [4];

	/**
	 * The setLab method accepts a lab GradedActivity
	 * object and sets it to the first element in the 
	 * grades array.
	 * @param lab The lab grade
	 */
	public void setLab(GradedActivity lab) {
		grades[0] = lab;	
	}


	/**
	 * The setPassFailExam method accepts a PassFailExam
	 * object and sets it to the second element in the 
	 * grades array.
	 * @param passFail The pass/fail grade 
	 */
	public void setPassFailExam(PassFailExam passFail) {
		grades[1] = passFail;
	} 

	/**
	 * The setEssay method accepts an Essay object and
	 * sets it to the third element in the grades array.
	 * @param essay The essay grade
	 */
	public void setEssay(Essay essay) {
		grades[2] = essay;
	}

	/**
	 * The setFinalExam method accepts a FinalExam
	 * object and sets it to the fourth element in the
	 * grades array.
	 * @param finalExam 
	 */
	public void setFinalExam(FinalExam finalExam) {
		grades[3] = finalExam;
	}

	public String toString() {
		return "Lab Score: " + grades[0].getScore() + ", Grade: " + grades[0].getGrade() +
		      "\nPass/Fail exam Score: " + grades[1].getScore() + ", Grade: " + grades[1].getGrade() +
		      "\nEssay Score: " + grades[2].getScore() + ", Grade: " + grades[2].getGrade() +
		      "\nFinal Exam Score: " + grades[3].getScore() + ", Grade: " + grades[3].getGrade();
	}

	@Override
	public double getAverage() {
		double average;
		double total = 0;
		for(GradedActivity grade : grades) {
			total += grade.getScore();
		}
		average = total / grades.length;
		return average;

	}
	/**
	 * The getHighest method returns the GradedActivity
	 * object with the highest score.
	 * @return The object with the highest score
	 */
	@Override
	public GradedActivity getHighest() {
		double highest = grades[0].getScore();
		GradedActivity grade = grades[0];
		for(int i = 0; i < grades.length; i++) {
			if(grades[i].getScore() > highest) {
				highest = grades[i].getScore();
				grade = grades[i];
			}
		}

		return grade;
	}

	@Override
	public GradedActivity getLowest() {
		double lowest = grades[0].getScore();
		GradedActivity grade = grades[0];
		for(int i = 0; i < grades.length; i++) {
			if(grades[i].getScore() < lowest) {
				lowest = grades[i].getScore();
				grade = grades[i];
			}
		}

		return grade;
	}

}
