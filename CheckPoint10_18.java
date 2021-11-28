package ch10java6thedition;

/**
 * This is check point 10.18
 * 
 * 
 * @author craig
 */
public class CheckPoint10_18 {
	public static void main (String[]args){ 
		/**
		 * 10.18 Recall the Rectangle and Cube classes discussed 
		 * earlier, as shown in the following UML diagrams:
		 * 
		 * 	----------------------------------------------------
		 * 	|	Rectangle	                |
		 * 	----------------------------------------------------
		 * 	| - length: double 		        	|
		 * 	| - width: double 		        	|
		 * 	----------------------------------------------------
		 * 	| + Rectangle(len: double, w: double)  |
		 * 	| + setLength(len: double) : void	|
		 * 	| + setWigth(w: double)  : void             |
		 * 	| + getLength() : double 	        	|
		 * 	| + getWigth() : double 	      	|
		 * 	| + getArea() : double 	        	|
		 * 	----------------------------------------------------
		 * 		        .
		 * 		       / \
		 * 		      /__\
		 * 		        |
		 * 		        |
		 *   	                        |
		 * 	----------------------------------------------------------
		 * 	|	   Cube			|
		 * 	---------------------------------------------------------
		 * 	| - height 				|
		 * 	---------------------------------------------------------
		 * 	| + Cube(len: double, w: double, h: double)|
		 * 	| + getHeight() : double 		|
		 * 	| + getSurfaceArea() : double 		|
		 * 	| + getVolume(): double 		|
		 * 	---------------------------------------------------------
		 * 
		 * a. Is the following statement legal or illegal? If illegal, why?
		 * 
		 */
			Rectangle1 r = new Cube(10, 12, 5);
		/*
		 * 
		 * answer: It is legal. Cube is a subclass of Rectangle, so a 
		 * 	Rectangle object can reference one of its subclasses.
		 * 
		 * b. If you determined that the statement in part 'a' is legal, are 
		 * the following statements legal or illegal? 
		 * 
		 *

		  	System.out.println(r.getLength()); 	// Legal 
			System.out.println(r.getWidth());	// Legal
			System.out.println(r.getHeight());	// Illegal
			System.out.println(r.getSurfaceArea());	// Illegal

		*
		 * c. Is the following statement legal or illegal? If it is illegal, why?
		 *     
		 *

		 	Cube c = new Rectangle1(10, 12);
		 	
		*
		 * 	This statement is illegal. A subclass cannot instantiate
		 * 	an object of a parent class. 	
		 */
	}
}
