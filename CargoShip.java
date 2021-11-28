package ch10java6thedition;

/**
 * The CargoShip class extends the Ship class.
 * Programming challenge #10.
 * 
 * @author craig
 */
public class CargoShip extends Ship {
	
	private int cargoCapacity;

	/**
	 * No-arg constructor
	 */
	public CargoShip() {

	}

	/**
	 * Constructor accepts an int argument 
	 * for capacity in tonnes.
	 * @param capacity The capacity in tonnes.
	 */
	public CargoShip(int capacity) {
		cargoCapacity = capacity;
	}

	// Accessors
	/**
	 * The getCapacity method returns the 
	 * value in cargoCapacity.
	 * @return cargoCapacity
	 */
	public int getCapacity() {
		return this.cargoCapacity;
	}

	// Mutators
	/**
	 * The setCapacity method sets the value
	 * in the cargoCapacity variable.
	 * @param capacity The ship's carrying capacity in tonnes
	 */
	public void setCapacity(int capacity) {
		cargoCapacity = capacity;
	}

	public String toString() {
		return "Name: " + this.getName() + "\n" +
		          "Capacity: " + this.getCapacity() + " tonnes.\n";

	}
}
