package ch10java6thedition;

/**
 * The TeamLeader class for Programming
 * challenge #3. 
 * 
 * @author craig
 * 6/14/21
 * 9:15pm
 * At home with Maria
 */
public class TeamLeader extends ProductionWorker{
	
	private double monthlyBonus;
	private int trainingHoursRequired;
	private int trainingHoursAttended;

	public TeamLeader(String name, String number, String hireDate, 
		                int shift, double hourlyPayRate, double monthlyBonus, 
			int trainingHoursRequired, int trainingHoursAttended) {

		super(name, number, hireDate, shift, hourlyPayRate);
		this.monthlyBonus = monthlyBonus;
		this.trainingHoursRequired = trainingHoursRequired;
		this.trainingHoursAttended = trainingHoursAttended;
	}

	public double getMonthlyBonus() {
		return this.monthlyBonus;
	}

	public int getTrainingHoursRequired() {
		return this.trainingHoursAttended;
	}

	public int getTrainingHoursAttended() {
		return this.trainingHoursAttended;
	}
	public void setMonthlyBonus(double monthlyBonus) {
		this.monthlyBonus = monthlyBonus;
	}
	public void setTrainingHoursRequired(int hours) {
		this.trainingHoursRequired = hours;
	}

	public String toString() {
		return super.toString() + 
		          "Monthly Bonus: $" + this.getMonthlyBonus() + "\n" +
		          "Training Hours Required: " + this.getTrainingHoursRequired() + "\n" +
		          "Training Hours Attended: " + this.getTrainingHoursAttended() + "\n";

	}
}
