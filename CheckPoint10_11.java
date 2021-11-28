package ch10java6thedition;

/**
 * This is check point 10.11-10.15.
 * 
 * @author craig
 */
public class CheckPoint10_11 {
	/**
	 * 10.11 What code may access a class member declared as protected?
	 *  
	 * answer: Any code within the same package or a subclass
	 * may access protected members.
	 * 
	 * 10.12 What is the difference between private and protected members?
	 * 
	 * answer: Protected members can be accessed by methods within the same package 
	 * as the member or by methods of a subclass of the class in which the member is declared.
	 * 
	 * 10.13 Why should you avoid making class members protected when possible?
	 * 
	 * answer: Making class members protected leaves them vulnerable to data corruption.
	 * It is much better practice to make the members private and then give access to 
	 * them through public methods.
	 * 
	 * 10.14 What is the difference between private access and package access?
	 * 
	 * answer: Private access is only allowed for methods within a class. Package access
	 * is allowed for all methods within a package.
	 * 
	 * 10.15 Why is it easy to give a class member package access by accident?
	 * 
	 * answer: It is easy to forget to assign an access specifier. If this happens, a class
	 * member is given package access by default.
	 */	
}
