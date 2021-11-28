package ch10java6thedition;

/**
 * Programming challenge #2, the ShiftSupervisor class.
 * 
 * @author craig
 * 6/14/21
 * 8:08pm
 * At home with Maria.
 */
public class ShiftSupervisor extends Employee {

	private double annualSalary;
	private double annualProductionBonus;

	/**
	 * The constructor accepts data for the 
	 * ShiftSupervisor
	 * @param name The name of the supervisor
	 * @param number The supervisor's employee #
	 * @param hireDate The hire date for the supervisor
	 * @param annualSalary The supervisor's annual salary
	 * @param annualProductionBonus The supervisor's production bonus
	 */
	public ShiftSupervisor(String name, String number, String hireDate, 	
			     double annualSalary, double annualProductionBonus) {
		super(name, number, hireDate);
		this.annualSalary = annualSalary;
		this.annualProductionBonus = annualProductionBonus;
	}	

	/**
	 * The setAnnualSalary method sets the supervisor's 
	 * annual salary.
	 * @param annualSalary The supervisor's annual salary in dollars 
	 */
	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	/**
	 *  The setAnnualProductionBonus method sets the
	 * supervisor's annual production bonus.
	 * @param annualProductionBonus The supervisor's bonus
	 */
	public void setAnnualProductionBonus(double annualProductionBonus) {
		this.annualProductionBonus = annualProductionBonus;
	}

	/**
	 * The getAnnualSalary method returns the 
	 * supervisor's annual salary.
	 * @return The supervisor's annual salary
	 */
	public double getAnnualSalary() {
		return this.annualSalary;
	}

	/**
	 * The getAnnualProductionBonus method returns
	 * the supervisor's annual production bonus.
	 * @return The supervisor's annual bonus
	 */
	public double getAnnualProductionBonus() {
		return this.annualProductionBonus;
	}

	@Override
	public String toString() {
		return       super.toString() +
			"Annual Salary: $" + this.getAnnualSalary() + "\n" +
			"Annual Production Bonus: $" + this.getAnnualProductionBonus();

	}

}
