package ch10java6thedition;
import java.util.Scanner;

/**
 * The ShiftSupervisorDemo demonstrates the 
 * ShiftSupervisor class.
 * 
 * @author craig
 * 6/14/21
 * 8:48pm
 * At home with Maria
 */
public class ShiftSupervisorDemo {
	public static void main(String[]args) {
		String name, number, hireDate;
		double annualSalary, annualProductionBonus;

		Scanner input = new Scanner(System.in);

		System.out.println("What is the employee's name?");
		name = input.nextLine();

		System.out.println("What is the employee's number? (XXX-L) format");
		number = input.nextLine();

		System.out.println("What is the employee's hire date?");
		hireDate = input.nextLine();

		System.out.println("What is the employee's annual salary?");
		annualSalary = Double.valueOf(input.nextLine());

		System.out.println("What is the employee's annual production bonus?");
		annualProductionBonus = Double.valueOf(input.nextLine());

		// Create a ShiftSupervisor object with the data gathered
		ShiftSupervisor sup = new ShiftSupervisor(name, number, hireDate,
						annualSalary, annualProductionBonus);

		// Display the results
		System.out.println("New Shift Supervisor\n" +
			             sup.toString());
		
	}	
}
