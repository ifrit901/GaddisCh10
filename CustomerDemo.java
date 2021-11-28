package ch10java6thedition;
import java.util.Scanner;


/**
 * This program demonstrates the Customer class
 * corresponding to Programming challenge #7.
 * 
 * @author craig
 * 6/17/21
 * 4:04
 * At home with Maria
 */
public class CustomerDemo {
	public static void main(String[]args) {
		String name;
		String telephoneNumber;
		String address;
		String number;
		boolean mailingList;
		String answer;

		// Create an object of the Scanner class
		Scanner input = new Scanner(System.in);

		System.out.println("What is the customer's name?");
		name = input.nextLine();

		System.out.println("What is the customer's telephone number?");
		telephoneNumber = input.nextLine();

		System.out.println("What is the customer's address?");
		address = input.nextLine();

		System.out.println("What is the customer's customer number?");
		number = input.nextLine();

		System.out.println("Does the customer want to be on the "
			+ "mailing list? (Y or N)");
		answer = input.nextLine();
		if(answer.equalsIgnoreCase("y")) {
			mailingList = true;
		} else {
			mailingList = false;
		}

		// Initialize a Customer object and display its data
		Customer customer = new Customer(name, address, number, 
					         telephoneNumber, mailingList); 
		
		System.out.println("New Customer info\n"
			+ "-------------------\n"
			+ customer.toString());

	}	
}
