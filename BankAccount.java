package ch10java6thedition;

/**
 *
 * @author craig
 */
public abstract class BankAccount {
	
	private double accountBalance;
	private int numberOfDeposits;
	private int numberOfWithdrawals;
	private double annualInterestRate;
	private double serviceCharges;

	public BankAccount() {
		
	}
	public BankAccount(double balance, double interestRate) {
		accountBalance = balance;
		annualInterestRate = interestRate;
	}

	public void deposit(double deposit) {
		accountBalance += deposit;
		numberOfDeposits++;
	}

	public void withdraw(double withdrawal) {
		accountBalance -= withdrawal;
		numberOfWithdrawals++;
		if(numberOfWithdrawals > 4) {
			addServiceCharges(1);
		}
	}

	public void calcInterest() {
		double monthlyInterest = this.annualInterestRate / 12;
		double interest = accountBalance * monthlyInterest;
		accountBalance += interest;
	}

	public void monthlyProcess() {
		accountBalance -= serviceCharges;
		calcInterest();
		numberOfWithdrawals = 0;
		numberOfDeposits = 0;
		serviceCharges = 0;
	}

	public void addServiceCharges(int charge) {
		serviceCharges += 1.0;
	}
	public int getNumberOfWithdrawals() {
		return numberOfWithdrawals;
	}
		
	public double getBalance() {
		return this.accountBalance;
	}
	public int getNumberOfDeposits() {
		return this.numberOfDeposits;
	}
	public double getServiceCharges() {
		return this.serviceCharges;
	}
}
