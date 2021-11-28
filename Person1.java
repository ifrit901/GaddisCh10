package ch10java6thedition;

/**
 *
 * @author craig
 */
/**
 * This is the Person class corresponding to 
 * Programming challenge #7. 
 * 
 * @author craig
 * 6/17/21
 * 3:52pm
 * At home with Maria
 */
public class Person1 {
	
	String name, address, telephoneNumber;

	public Person1() {

	}

	public Person1(String name, String address, String telephoneNumber) {
		this.name = name;
		this.address = address;
		this.telephoneNumber = telephoneNumber;
	}

	// Getters
	public String getName() {
		return this.name;
	}

	public String getAddress() {
		return this.address;
	}

	public String getTelephoneNumber() {
		return this.telephoneNumber;
	}

	// Setters
	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	
}

