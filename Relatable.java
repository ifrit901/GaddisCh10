package ch10java6thedition;

/**
 * This is code listing 10-32. 
 * 
 * @author craig
 */
public interface Relatable {
	boolean equals(GradedActivity g);
	boolean isGreater(GradedActivity g);
	boolean isLess(GradedActivity g);
}
