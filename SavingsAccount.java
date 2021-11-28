package ch10java6thedition;

/**
 * The SavingsAccount class extends the BankAccount
 * class for Programming challenge #9.
 * 
 * @author craig
 * 6/18/21
 * 12:25pm
 * At work with Colin
 */
public class SavingsAccount extends BankAccount{

	private boolean isInActive;
	
	public SavingsAccount() {
		
	}	

	public void withdraw(double withdrawal) {
		if(super.getBalance() < 25) {
			isInActive = true;	
		} else {
			super.withdraw(withdrawal);
		}
		isInActive = (super.getBalance() < 25) ? true : false;
	}

	public void deposit(double deposit) {
		if(!isInActive && (super.getBalance() + deposit) >= 25) {
			super.deposit(deposit);
			isInActive = true;
		} else if (isInActive) {
			super.deposit(deposit);
		}
	}

	public void monthlyProcess() {
		if(super.getNumberOfWithdrawals() > 4) {
			super.addServiceCharges(super.getNumberOfWithdrawals() - 4);
		} else {
			super.monthlyProcess();
		}
		isInActive = (super.getBalance() < 25) ? false : true;
	}
	public String toString() {
		return       "Account balance: " + super.getBalance() + "\n" +
			"Is account inactive? true/false: " + this.isInActive + "\n" + 
			"Number of withdrawals: " + super.getNumberOfWithdrawals() + "\n" +
			"Number of deposits: " + super.getNumberOfDeposits() + "\n" +
			"Service charges: " + super.getServiceCharges();

	}
}
