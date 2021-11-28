package ch10java6thedition;


/**
 * The ProductionWorker class for programming 
 * challenge #1. It extends the Employee class.
 * @author craig
 */
public class ProductionWorker extends Employee {
	
	private int shift;
	private double hourlyPayRate;

		
	/**
	 * Constructor accepts an int and a double 
	 * for shift and pay rate.
	 * @param shift The day or night shift as integers
	 * @param hourlyPayRate The employee's pay rate
	 */
	public ProductionWorker(String name, String number, String hireDate, 
			          int shift, double hourlyPayRate) {
		super(name, number, hireDate);	
		this.shift = shift;
		this.hourlyPayRate = hourlyPayRate;
	}

	// Accessors

	/**
	 * The getShift method returns the 
	 * shift of the employee.
	 * @return The employee's shift
	 */
	public int getShift() {
		return this.shift;
	}

	/**
	 * The getHourlyPayRate returns 
	 * the hourly pay rate of the employee.
	 * @return The employee's pay rate
	 */
	public double getHourlyPayRate() {
		return this.hourlyPayRate;
	}

	// Mutators

	/**
	 * The setShift method sets the 
	 * employee's shift.
	 * @param shift The shift as an integer
	 */
	public void setShift(int shift) {
		this.shift = shift;
	}

	/**
	 * The setHourlyPayRate sets the
	 * employee's pay rate.
	 * @param hourlyPayRate The employee's pay rate by hour
	 */
	public void setHourlyPayRate(double hourlyPayRate) {
		this.hourlyPayRate = hourlyPayRate;
	}

	@Override
	public String toString() {
		return super.toString() +
		          "Shift: " + this.getShift() + "\n" + 
		          "Hourly Pay: $" + this.getHourlyPayRate() + "\n";
	}

}
