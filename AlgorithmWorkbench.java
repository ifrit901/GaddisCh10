package ch10java6thedition;

/**
 *
 * @author craig
 */
public class AlgorithmWorkbench {
	public static void main(String[]args) {
		/**
		 * 1. Write the first line for the definition of a Poodle class. 
		 * The class should extend the Dog class.
		 * 
		 * public class Poodle extends Dog {
		 * 
		 * 2. Look at the following code, which is the first line of a class definition.
		 * 
		 * public class Tiger extends Felis
		 * 
		 * In what order will the class constructors execute?
		 * 
		 * answer: The default or defined constructor for the Felis class will
		 * execute first.
		 * 
		 * 3. Write the declaration for class B. The class's members should be as 
		 * follows:
		 * - m, an integer. This variable should not be available to code outside
		 *   the class or to any class that extends B.
		 * 
		 * - n, an integer. This variable should be accessible only to classes that 
		 *   extend class B or are in the same package as B.
		 * 
		 * - setM, getM, setN, getN. These are the mutator and accessor methods 
		 *   for the member variables m and n. These methods should be accessible 
		 *   to code outside the class. 
		 * 
		 * - calc. This is an abstract method. 
		 * 
		 * Next, write the declaration for class D, which extends class B. The 
		 * class's members should be as follows:
		 * 
		 * - q, a double. This variable should not be accessible to code outside the class.
		 * - r, a double. This variable should be accessible to any class that extends D
		 *   or is in the same package. 
		 * - setQ, getQ, setR, getR. The getters and setters for the r and q variables.
		 *   these should be accessible to code outside the class. 
		 * - calc, a public method that overrides the superclass's abstract method. 
		 *   This method should return the value of q times r.
		 * 
		 * 4. Write a statement that calls a superclass constructor and passes the 
		 * arguments x, y, and z.
		 * 
		 * super(x, y, z);
		 * 
		 * 5. A superclass has the following method:
		 * 
		 * public void setValue(int v) {
		 * 	value = v;
		 * }
		 * 
		 * Write a statement that may appear in a subclass that calls this method, 
		 * passing 10 as argument.
		 * 
		 * super.setValue(10);
		 * 
		 * 6. A superclass has the following abstract method:
		 * 
		 * public abstract int getValue();
		 * 
		 * Write an example of a getValue() that can appear in a subclass.
		 * 
		 * public int getValue() {
		 * 	return value;
		 * }
		 * 
		 * 7. Write the first line of the definition for a Stereo class. The class should
		 * extend the SoundSystem class. The class should extend the SoundSystem
		 * class, and it should implement the CDPlayable, TunerPlayable and 
		 * CassettePlayable interfaces. 
		 * 
		 * public class Stereo extends SoundSystem implements CDPlayable, 
		 * TunerPlayable, CassettePlayable { 
		 * 
		 * 8. Write an interface named Nameable that specifies the following methods:
		 * - public void setName(String n)
		 * - public String getName;
		 * 
		 * 9. Look at the following interface:
		 * 
		 * 	public interface Computable {
		 * 		double compute(double x); 
		 * 	}
		 * 
		 * Write a statement that uses a Lambda expression to create an object 
		 * that implements the Computable interface. The object's name should
		 * be 'half'. The 'half' object's compute method should return the value
		 * of the 'x' parameter divided by two.
		 * 
		 *	 
		 */
		// Problem #9
		int num = 4;
		Computable half = x -> x / 2;
		System.out.println(half.compute(num));
		/**
		 * Short Answer
		 * 
		 * 1. What is an "is - a" relationship?
		 * 
		 * answer: An "is - a" relationship exists between two objects when 
		 * one of them is a specialized subset of the other.
		 * 
		 * 2. A program uses two classes: Animal and Dog. Which class is the 
		 * superclass and which is the subclass?
		 * 
		 * answer: Animal is the superclass and Dog is the subclass.
		 * 
		 * 3. What is the superclass and what is the subclass in the following?
		 * 
		 * 	public class Pet extends Dog
		 * 
		 * answer: Dog is the superclass and Pet is the subclass.
		 * 
		 * 4. What is the difference between a protected class member and 
		 * a private class member?
		 * 
		 * answer: A private class member is only accessible by its class. 
		 * A protected class member is accessible to methods of the same
		 * class, methods of a subclass, and methods of classes in the same
		 * package as the protected member. Protected members are 
		 * not quite public and not quite private.
		 * 
		 * 5. Can a subclass ever directly access private members of its 
		 * superclass?
		 * 
		 * answer: No. 
		 * 
		 * 6. Which constructor is called first, the superclass or the subclass?
		 * 
		 * answer: The superclass.
		 * 
		 * 7. What is the difference between overloading a superclass method 
		 * and overriding a superclass method?
		 * 
		 * answer: Overloading a superclass method creates a method with
		 * the same name as a superclass method but has different signatures.
		 * Overriding a superclass method creates a method with the same 
		 * name and signature.
		 * 
		 * 8. Reference variables can be polymorphic. What does this mean?
		 * 
		 * answer: It means reference variables of a superclass can reference 
		 * objects of a subclass.
		 * 
		 * 9. When does dynamic binding take place?
		 * 
		 * answer: Dynamic binding takes place at runtime and is determined
		 * by the type of object making the method call.
		 * 
		 * 10. What is an abstract method?
		 * 
		 * answer: An abstract method appears in a superclass and expects to
		 * be overridden in a subclass. 
		 * 
		 * 11. What is an abstract class?
		 * 
		 * answer: An abstract class is a class that has one or more abstract 
		 * methods and cannot be instantiated. It is used as a template for
		 * classes to extend.
		 * 
		 * 12. What are the differences between and abstract class and 
		 * an interface?
		 * 
		 * answer: An interface is meant to specify behavior for a class. Both
		 * interfaces and abstract classes cannot be instantiated. An abstract
		 * class can have variables but an interfaces variables must be final 
		 * or effectively final. An abstract class can serve as a superclass and
		 * can be extended once. An interface can be implemented and 
		 * a class is not limited to how many interfaces it can implement.
		 * 
		 * 13. When you instantiate an anonymous inner class, the class must 
		 * do one of two things. What are they?
		 * 
		 * answer: The anonymous inner class must implement an interface or:
		 * extend another class or superclass. An anonymous inner class object
		 * is created at the time of instantiation using lambda expressions.
		 * An anonymous inner class must override the methods of the interface
		 * or the base class it is extending. If an anonymous inner class extends the
		 * super class then the super class no argument constructor is called 
		 * when instantiating the object of the inner class. 
		 * 
		 * 14. What is a functional interface?
		 * 
		 * answer: A functional interface is an interface that has one abstract method.
		 * It is an example of an anonymous inner class that implements an interface 
		 * with only one method. It can be instantiated by using a lambda expression. 
		 * A lambda expression creates an object that implements a functional interface.
		 * 
		 * 15. What is a lambda expression?
		 * 
		 * answer: A lambda expression is used to instantiate an object that implements
		 * a functional interface.
		 * 
		 */
	} 

	// Problem #8
	public interface Nameable {
		public void setName(String n);
		public String getName();
	}
	// Problem #3
	public abstract class B {
		private int m; 
		protected int n; 
		public void setM(int m) {
			this.m = m;
		}
		public int getM() {
			return this.m;
		}
		public void setN(int n) {
			this.n = n;
		}
		public int getN() {
			return this.n;
		}
		public abstract double calc();
	}
	public class D extends B {
		private double q;
		protected double r;
		public void setQ(double q) {
			this.q = q;
		}
		public double getQ() {
			return this.q;
		}
		public void setR(double r) {
			this.r = r;
		}
		public double getR() {
			return this.r;
		}
		public double calc() {
			return this.r * this.q;
		}
	}
}
