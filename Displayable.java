package ch10java6thedition;

/**
 * This is code listing 10-29. It describes an example 
 * of an interface.
 * 
 * @author craig
 */
public interface Displayable {

	default void display() {
		System.out.println("This is the default display method.");
		
	}	
}
