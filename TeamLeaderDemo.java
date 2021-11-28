package ch10java6thedition;
import java.util.Scanner;
/**
 *
 * @author craig
 */
public class TeamLeaderDemo {
	public static void main(String[]args) {	
		String name;
		String number;
		String hireDate;
		int shift;
		double hourlyPayRate;
		double monthlyBonus;
		int trainingHoursRequired;
		int trainingHoursAttended;

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

		System.out.println("What is the employee's monthly bonus?");
		monthlyBonus = Double.valueOf(input.nextLine());

		System.out.println("How many hours of required training are there\n"
			+ "for the employee?");
		trainingHoursRequired = Integer.valueOf(input.nextLine());

		System.out.println("How many hours of required training has the "
			+ "employee attended?");
		trainingHoursAttended = Integer.valueOf(input.nextLine());

		// Create a TeamLeader object
		TeamLeader leader = new TeamLeader(name, number, hireDate, shift, 
					           hourlyPayRate, monthlyBonus,
					           trainingHoursRequired, 
					           trainingHoursAttended);

		// Display the results
		System.out.println(leader.toString());
	}
}
