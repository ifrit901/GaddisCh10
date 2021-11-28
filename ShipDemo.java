package ch10java6thedition;
import java.util.Scanner;
/**
 * This program demonstrates the Ship, CruiseShip, and
 * CargoShip classes. It corresponds to programming 
 * challenge #10.
 * (Last problem in the chapter!!!)
 * 6/19/21
 * 10:20am
 * At work with Colin, Maria is back at the station
 * @author craig
 */
public class ShipDemo {
	public static void main(String[]args) {

		Scanner input = new Scanner(System.in);

		Ship scooner = new Ship("The Bobo", "1984");

		CruiseShip titanic = new CruiseShip(700);
		titanic.setName("Titanic");
		titanic.setYearMade("1912");

		CargoShip tanker = new CargoShip(15000);
		tanker.setName("Tanky");
		tanker.setYearMade("1975");

		CruiseShip redOctober = new CruiseShip(45);
		redOctober.setName("Red October");	
		redOctober.setYearMade("1962");	

		Ship [] ships = {scooner, titanic, tanker, redOctober};

		for(Ship ship : ships) {
			System.out.println(ship.toString());
		}

		
	}	
		
}
