package ch10java6thedition;

/**
 * Ship class for Programming challenge #10.
 * 
 * @author craig
 * 6/19/21
 * 8:09am
 * At work with Maria
 */
public class Ship {
	
	private String name;
	private String yearMade;

	/**
	 * No argument constructor
	 */
	public Ship() {

	}

	/**
	 * Constructor accepts arguments for name and 
	 * year model
	 * @param name The name of the ship
	 * @param yearMade The year the ship was made
	 */
	public Ship(String name, String yearMade) {
		this.name = name;
		this.yearMade = yearMade;
	}

	// Accessors
	/**
	 * The getName method returns the 
	 * name of the ship.
	 * @return The value in the name field
	 */
	public String getName() {
		return name;
	}

	/**
	 * The getYearMade method returns the
	 * year model of the ship
	 * @return The value in the yearMade field
	 */
	public String getYearMade() {
		return yearMade;
	}

	/**
	 * The setName method sets the value
	 * in the name field.
	 * @param name The name of the ship
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * The setYearMade 
	 * @param yearMade 
	 */
	public void setYearMade(String yearMade) {
		this.yearMade = yearMade;
	}

	public String toString() {
		return "Name: " + this.getName() + "\n"
		       + "Year made: " + this.getYearMade() + "\n";
	}
}
