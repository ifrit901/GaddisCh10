package ch10java6thedition;

/**
 * This is code listing 10-8. It demonstrates the 
 * super keyword.
 * 
 * @author craig
 */
public class SuperClass2 {
	/**
	 * Constructor #1
	 */	
	public SuperClass2() {
		System.out.println("This is the SuperClass2 constructor.");
	}

	/**
	 * Constructor #2
	 */
	public SuperClass2(int arg) {
		System.out.println("The following argument was passed "
			+ "to the SuperClass constructor: " + arg);
	}
}
