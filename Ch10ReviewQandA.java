package ch10java6thedition;

/**
 * Chapter 10 review questions and exercises.
 * 
 * @author craig
 */
public class Ch10ReviewQandA {
	
	/**
	 * Multiple choice and true and false
	 * 
	 * 1. In an inheritance relationship, this is the general class.
	 * 
	 * answer: b. superclass
	 * 
	 * 2. In an inheritance relationship, this is the specialized class.
	 * 
	 * answer: c. subclass
	 * 
	 * 3. This keyword indicates that a class inherits from another class.
	 * 
	 * answer: d. extends
	 * 
	 * 4. A subclass does not have access to these superclass members.
	 * 
	 * answer: b. private
	 * 
	 * 5. This keyword refers to an object's superclass.
	 * 
	 * answer: a. super
	 * 
	 * 6. In a subclass constructor, a call to the superclass constructor must _______.
	 * 
	 * answer: a. appear as the very first statement.
	 * 
	 * 7. The following is an explicit call to the superclass's default constructor.
	 * 
	 * answer: c. super()
	 * 
	 * 8. A method in a subclass that has the same signature as a method in 
	 * the superclass is an example of _____________.
	 * 
	 * answer: b. overriding
	 * 
	 * 9. A method in a subclass having the same name as a method in the 
	 * superclass but a different signature is an example of __________.
	 * 
	 * answer: a. overloading
	 * 
	 * 10. These superclass members are accessible to subclasses and classes 
	 * in the same package.  
	 * 
	 * answer: b. public 
	 * 
	 * 11. All classes directly or indirectly inherit from this class. 
	 * 
	 * answer: a. Object
	 * 
	 * 12. With this type of binding, the Java Virtual Machine determines at
	 * runtime which method to call, depending on the type of the object 
	 * that a variable references.
	 * 
	 * answer: d. dynamic
	 * 
	 * 13. This operator can be used to determine whether a reference variable 
	 * references an object of a particular class. 
	 * 
	 * answer: c. instanceof
	 * 
	 * 14. When a class implements an interface, it must _________.
	 * 
	 * answer: b. Provide all the non-default methods that are listed in the 
	 * interface, with the exact signatures and return types specified.
	 * 
	 * 15. Fields in an interface are _________.
	 * 
	 * answer: c. both final and static
	 * 
	 * 16. Abstract methods must be __________. 
	 * 
	 * answer: a. overridden 
	 * 
	 * 17. Abstract methods cannot ________. 
	 * 
	 * answer: c. be instantiated
	 * 
	 * 18. You use the _______ operator to define an anonymous inner class. 
	 * 
	 * answer: c. new
	 * 
	 * 19. An anonymous inner class must ________.
	 * 
	 * answer: d. either implement an interface or extend a superclass.
	 * 
	 * 20. A functional interface is an interface with _________.
	 * 
	 * answer: a. only one abstract method
	 * 
	 * 21. You can use a Lambda expression to instantiate an object that _________.
	 * 
	 * answer: c. implements a functional interface.
	 * 
	 * True or False
	 * 
	 * 22. Constructors are not inherited.
	 * 
	 * answer: true
	 * 
	 * 23. In a subclass, a call to the superclass constructor can only be 
	 * written in the subclass constructor.
	 * 
	 * answer: true
	 * 
	 * 24. If a subclass constructor does not explicitly call a superclass constructor,
	 * Java will not call any of the superclass's constructors.
	 * 
	 * answer: false. Java will at least implicitly call the superclass default constructor.
	 * 
	 * 25. An object of a superclass can access members declared in a subclass.
	 * 
	 * answer: false
	 * 
	 * 26. The superclass constructor always executes before the subclass constructor.
	 * 
	 * answer: true
	 * 
	 * 27. When a method is declared with the 'final' modifier, it must be overridden 
	 * in a subclass.
	 * 
	 * answer: false. It cannot be overridden in a subclass.
	 * 
	 * 28. A superclass has a member with package access. A class that is outside
	 * the superclass's package but inherits from it can access the member. 
	 * 
	 * answer: true. 
	 * 
	 * 29. A superclass reference variable can reference an object of a subclass 
	 * that extends the superclass. 
	 * 
	 * answer: true
	 * 
	 * 30. A subclass reference variable can reference an object of the superclass.
	 * 
	 * answer: false 
	 * 
	 * 31. When a class contains an abstract method, the class cannot be instantiated.
	 * 
	 * answer: true
	 * 
	 * 32. A class can only implement one interface. 
	 * 
	 * answer: false
	 * 
	 * 33. By default all members of an interface are public.
	 * 
	 * answer: true
	 * 
	 * 
	 * Find the Error
	 * 
	 * 1. The subclass should 'extend' the superclass, not 'expand' it.
	 * 
	 * 2. The constructor for the Car class cannot directly access the 'cost' 
	 * field of the Vehicle class as it is private. This can only be done by calling
	 * the superclass constructor with the super keyword and passing the 
	 * variable to its constructor argument.
	 * 
	 * 3. The Car constructor cannot assign value to a private variable from the vehicle 
	 * class. 
	 * 
	 * 4. The Vehicle class must be abstract.
	 * 
	 */
}
