package ch10java6thedition;
import java.util.Scanner;
/**
 * This program tests the SavingsAccount class.
 * 
 * @author craig
 * 6/19/21
 * 7:14am
 * At work with Maria
 */
public class SavingsAccountDemo {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);

		SavingsAccount account = new SavingsAccount();
		account.deposit(100);
		account.withdraw(15);
		account.withdraw(15);
		account.withdraw(15);
		account.withdraw(15);
		account.withdraw(15);
		account.withdraw(10);
		System.out.println(account.toString());
	}	
}
