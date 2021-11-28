package ch10java6thedition;

/**
 * This is the CruiseShip class which extends
 * the Ship class.
 * @author craig
 * Same as Ship
 */
public class CruiseShip extends Ship {

	private int maximumNumberOfPassengers;
	
	/**
	 * No-arg constructors
	 */
	public CruiseShip() {

	}

	public CruiseShip(int maxPassengers) {
		maximumNumberOfPassengers = maxPassengers;
	}

	// Accessors
	/**
	 * The getMaxPassengers method returns
	 * the maximum number of passengers.
	 * @return The value in maximumNumberOfPassengers
	 */
	public int getMaxPassengers() {
		return maximumNumberOfPassengers;
	}

	/**
	 * The setMaxPassengers method sets the 
	 * maximum number of passengers.
	 * @param passengers The value to be in maximumNumberOfPassengers
	 */
	public void setMaxPassengers(int passengers) {
		maximumNumberOfPassengers = passengers;
	}
	
	public String toString() {
		return "Name: " + this.getName() + "\n" +
		          "Maximum number of passengers: " + this.getMaxPassengers() + "\n";
	}

}
