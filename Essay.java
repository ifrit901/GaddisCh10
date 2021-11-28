package ch10java6thedition;

/**
 * Programming challenge #4, the Essay class.
 * 
 * @author craig
 * 6/15/21
 * 9:08am
 * At work with Colin
 */
public class Essay extends GradedActivity{
	
	private int grammar, spelling, length, content;
	private double score;

	public Essay() {

	}

	public int getGrammar() {
		return this.grammar;
	}
	public int getSpelling() {
		return this.spelling;
	}
	public int getLength() {
		return this.length;
	}
	public int getContent() {
		return this.content;
	}
	public double getScore() {
		return this.score;
	}
	public void setGrammar(int grammar) {
		this.grammar = grammar;
	}
	public void setSpelling(int spelling) {
		this.spelling = spelling;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void setContent(int content) {
		this.content = content;
	}
	public void setScore(int grammar, int spelling, int length, int content) {
		this.score = grammar + spelling + length + content;
		super.setScore(score);
	}
}
