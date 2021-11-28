package ch10java6thedition;
import java.util.Scanner;
/**
 * This is #1 in the programming challenges. It demonstrates the 
 * Employee and Production worker classes.
 * 
 * @author craig
 * 6/14/21
 * 11:33am 
 * At work with Colin. Just talked to Maria. Day one with 
 * new bedroom air conditioner.
 */
public class ProductionWorkerDemo {
	public static void main(String[]args) {
		String name;
		String number;
		String hireDate;
		int shift;
		double hourlyPayRate;

		// Create an object of the Scanner class
		Scanner input = new Scanner(System.in);


		// Get user input for employee 
		System.out.println("What is the employee's name?");
		name = input.nextLine();

		System.out.println("What is the employee's number? (XXX-L format)");
		number = input.nextLine();

		System.out.println("When was the employee hired?");
		hireDate = input.nextLine();

		System.out.println("What shift does the employee work?");
		shift = Integer.valueOf(input.nextLine());

		System.out.println("What is the employee's hourly pay rate?");
		hourlyPayRate = Double.valueOf(input.nextLine());


		// Create an Employee object of type ProductionWorker
		Employee worker = new ProductionWorker(name, number, hireDate,
						 shift, hourlyPayRate);

		// Display the results
		System.out.println(worker.toString());
				
	}	
}
