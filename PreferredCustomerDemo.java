package ch10java6thedition;
import java.util.Scanner;
/**
 * This program demonstrates the PreferredCustomer
 * class from programming challenge #8. 
 * 
 * @author craig
 * 6/18/21
 * 8:56am
 * At work with Colin
 */
public class PreferredCustomerDemo {
	public static void main(String[]args) {
		double purchaseAmount;

		Scanner input = new Scanner(System.in);

		System.out.println("How much stuff did the customer buy?");
		purchaseAmount = Double.valueOf(input.nextLine());

		PreferredCustomer diva = new PreferredCustomer(purchaseAmount);

		System.out.println(diva.toString());
		double actualPrice = 
			diva.getPurchaseAmount() - (diva.getPurchaseAmount()*diva.getDiscountLevel());
		System.out.println("Price after discount: $" + String.format("%,.2f", actualPrice));
	}	
}
