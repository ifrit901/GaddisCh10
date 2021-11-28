package ch10java6thedition;


/**
 * This is check point 10.16-10.17.
 * 
 * @author craig
 */
public class CheckPoint10_16 {
	/**
	 * 10.16 Look at the following class definition:
	 * 	
	 *	public class ClassD extends ClassB {
	 * 
	 * 		(Member declarations)
	 * 	
	 * 	}
	 * 
	 *         Because ClassD inherits from ClassB, is it true that ClassD does
	 *         not inherit from the object class? Why or why not?
	 * 
	 * answer: No, it does inherit from the object class indirectly because it
	 * 	inherits from ClassB which inherits from object.
	 * 
	 * 10.17 When you create a class, it automatically has a toString and a 
	 *          equals method. Why?
	 * 
	 * answer: Because it inherits from the Object class of which those methods
	 * 	are members.
	 */	
}
