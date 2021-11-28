package ch10java6thedition;

/**
 * This is code listing 10.30. It implements the 
 * Displayable interface.
 * 
 * @author craig
 */
public class Person implements Displayable{
		
	private String name;

	// Constructor
	public Person(String n) {
		name = n;
	}

	// Display method
	@Override
	public void display() {
		System.out.println("My name is " + name);
	}
}
