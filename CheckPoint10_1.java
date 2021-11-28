package ch10java6thedition;

/**
 * This is check point 10.1 through 10.3.
 * 
 * @author craig
 */
public class CheckPoint10_1 {
	public static void main(String[]args) {
		/**
		 * 10.1 Here is the first line of a class declaration. What is 
		 * the name of the superclass? What is the name of the subclass?
		 * 
		 * 	public class Truck extends Vehicle
		 * 
		 * answer: Vehicle is the name of the superclass and Truck 
		 * 	is the name of the subclass.
		 * 
		 * 10.2 Look at the following class declarations and answer the 
		 * questions that follow them:
		 * 	
		 * 	public class Shape {
		 * 		private double area;
		 * 		public void setArea(double a) {
		 * 			area = a;
		 * 		}
		 *	 	public double getArea() {
		 * 			return area;
		 * 		}
		 * 	}
		 *	public class Circle extends Shape {
		 * 		private double radius;
		 * 		public void setRadius(double r) {
		 * 			radius = r;
		 * 			setArea(Math.PI * r * r);
		 * 		}
		 * 		public double getRadius() {
		 *			return radius; 
		 *		} 
		 * 
		 * a. Which is the superclass? Which is the subclass?
		 * b. Draw a UML diagram showing the relationship between the classes.
		 * c. When a Circle object is created, what are its public members?
		 * d. What members of the Shape class are not accessible to the 
		 *     Circle class's methods?
		 * e. Assume a program has the following declarations:
		 * 
		 * 	Shape s = new Shape();
		 * 	Circle c = new Circle();
		 * 
		 *     Indicate whether the following statements are legal or illegal:
		 * 
		 * 	s.setRadius();
		 * 	c.setRadius();
		 * 	System.out.println(s.getArea());	
		 * 	System.out.println(c.getArea());
		 * 
		 * answers: a. Shape is the superclass and Circle is the subclass.
		 * 	  b. 	-------------------------------------------
		 * 		|	Shape		|
		 * 		-------------------------------------------
		 * 		| - area			|
		 * 		-------------------------------------------
		 * 		| + setArea(a: double) : void	|
		 * 		| + getArea() : double 	|
		 * 		-------------------------------------------
		 * 			      . 
		 *			     / \ 
		 *			    /__\ 
		 *			      | 
		 * 			      |
		 * 			      |
		 *		------------------------------------------- 
		 * 		|	Circle		|
		 * 		-------------------------------------------
		 * 		| - radius			|
		 * 		-------------------------------------------
		 * 		| + setRadius(r: double) : void   |
		 * 		| + getRadius() : double	|
		 * 		-------------------------------------------
		 * 
		 *	c. A Circle object's public members are the setRadius 
		 * 	    and getRadius methods.
		 * 	d. The area field is not accessible to the Circle class's methods.
		 * 	e. s.setRadius(10.0); is the only statement that is illegal because
		 * 	    inheritance does not work backwards, the Shape class does 
		 * 	    not inherit the Circle class's fields and methods.
		 * 
		 * 10.3 Class B extends class A. (Class A is the superclass, class B is the subclass)
		 *         Describe the order in which the class's constructors execute when a 
		 *         class B object is created. 
		 * 
		 * answer: When a class B object is created, a class A constructor is executed
		 * 	just beforehand.
		 */
	}	
}
