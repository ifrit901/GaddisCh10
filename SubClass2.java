package ch10java6thedition;

/**
 * This is SubClass2, it calls the super keyword 
 * on the SuperClass2 class.
 * 
 * @author craig
 */
public class SubClass2 extends SuperClass2 {
	/**
	 * Constructor
	 */	
	public SubClass2() {
		super(10);
		System.out.println("This is the SubClass2 constructor.");
	}
}
