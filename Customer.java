package ch10java6thedition;


/**
 * This is the Customer class  which extends the 
 * Person class and corresponds to Programming
 * challenge #7.
 * 
 * @author craig
 * 6/17/21
 * 3:59pm
 * At home with Maria
 */
public class Customer extends Person1{
	
	String customerNumber;
	boolean wantsMailingList;

	public Customer() {

	}

	public Customer(String name, String address, String telephoneNumber, 
		           String customerNumber, boolean wantsMailingList) {
		super.setName(name);
		super.setAddress(address);
		super.setTelephoneNumber(telephoneNumber);
		this.customerNumber = customerNumber;
		this.wantsMailingList = wantsMailingList;
	}

	// Accessors
	public String getCustomerNumber() {
		return this.customerNumber;
	}

	public boolean getWantsMailingList() {
		return this.wantsMailingList;
	}
		
	// Mutators
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public void setWantsMailingList(boolean wantsMailingList) {
		this.wantsMailingList = wantsMailingList;
	}
		
	public String toString() {
		return       "Customer name: " + this.getName() + "\n" +
			"Address: " + this.getAddress() + "\n" +
			"Telephone number: " + this.getTelephoneNumber() + "\n" +
			"Customer #: " + this.getCustomerNumber() + "\n" +
			"Mailing list: " + this.getWantsMailingList() + "\n";

	}
}
