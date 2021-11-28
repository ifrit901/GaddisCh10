package ch10java6thedition;

/**
 * This is code listing 10.31. It demonstrates a class 
 * using the Displayable interface.
 * 
 * @author craig
 */
public class InterfaceDemo {
	public static void main(String [] args) {
		// Create an instance of the Person class
		Person p = new Person("Antonio");

		// Call the object's display method
		p.display();
	}	
}
