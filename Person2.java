package ch10java6thedition;

/**
 * This is code listing 10-36, the Person class,
 * which implements the Displayable interface
 * but does not override the default display 
 * method.
 * 
 * @author craig
 */
public class Person2 implements Displayable {
	
	private String name;

	// Constructor
	public Person2(String n) {
		name = n;
	}

}
