package ch10java6thedition;


/**
 * The Employee class for programming challenge #1.
 * 
 * @author craig
 * 6/14/21
 * 11:06am
 * On ambulance with Colin.
 */
public class Employee {

	private String name;
	private String number;
	private String hireDate;

	
	/**
	 * Constructor accepts arguments for 
	 * name, number, and hire date.
	 * @param name The employee's name
	 * @param number The employee's number
	 * @param hireDate The date the employee was hired
	 */
	public Employee(String name, String number, String hireDate)	{

		this.name = name;
		this.number = number;
		this. hireDate= hireDate;

	}
	// Accessors

	/**
	 * The getName method returns the 
	 * name of the employee.
	 * @return The name of the employee
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * The getNumber method returns the
	 * employee's number.
	 * @return The number of the employee
	 */
	public String getNumber() {
		return this.number;
	}

	/**
	 * The getHireDate method returns the
	 * date the employee was hired.
	 * @return The employee's hire date
	 */
	public String getHireDate() {
		return this.hireDate;
	}

	// Mutators

	/**
	 * The setName method sets the 
	 * employee's name.
	 * @param name The name of the employee
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * The setNumber method sets the
	 * employee's number.
	 * @param number The employee number
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * The setHireDate method sets the 
	 * employee's hire date.
	 * @param hireDate 
	 */
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public String toString() {
		return "Name: " + this.getName() + "\n" +
		          "Employee #: " + this.getNumber() + "\n" +
		          "Hire Date: " + this.getHireDate() + "\n";
	}
}
