package ch10java6thedition;

/**
 * This is code listing 10 - 1, the GradedActivity class.
 * 
 * The UML diagram for the class:
 * 		--------------------------------------------------
 * 		|	GradedActivity	       |
 * 		--------------------------------------------------
 * 		| - score: double		       |
 * 		--------------------------------------------------
 * 		| + setScore(s: double) : void	       |
 * 		| + getScore() : double	       |
 * 		| + getGrade() : char 	       |
 * 		--------------------------------------------------
 * @author craig
 */
public class GradedActivity {
	private double score;

	// No explict constructor

	public void setScore(double s) {
		score = s;
	}

	public double getScore() {
		return score;
	}

	public char getGrade() {
		char grade;

		if(score <= 100 && score >= 90) 
			grade = 'A';
		else if(score < 90 && score >= 80) 
			grade = 'B';
		else if(score < 80 && score >= 70) 
			grade = 'C';
		else if(score < 70 && score >= 60) 
			grade = 'D';
		else	
			grade = 'F';

		return grade;
	}
}
