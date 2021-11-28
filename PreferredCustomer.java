package ch10java6thedition;

/**
 * This is the PreferredCustomer class
 * for Programming challenge #8 which 
 * extends the Customer class.
 * 
 * @author craig
 * 6/18/21
 * 6:56am
 * At work with Colin
 */

public class PreferredCustomer extends Customer{
	
	private double purchaseAmount;
	private double discountLevel;

	public PreferredCustomer() {

	}
	public PreferredCustomer(double purchaseAmount) {
		this.setPurchaseAmount(purchaseAmount);
	}

	// Accessors
	public double getPurchaseAmount() {
		return this.purchaseAmount;
	}
	public double getDiscountLevel() {
		return this.discountLevel;
	}

	// Mutators
	public void setPurchaseAmount(double purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
		if(purchaseAmount >= 500 && purchaseAmount < 1000) {
			this.setDiscountLevel(.05);
		} else if (purchaseAmount >= 1000 && purchaseAmount < 1500) {
			this.setDiscountLevel(.06);
		} else if (purchaseAmount >= 1500 && purchaseAmount < 2000) {
			this.setDiscountLevel(.07);
		} else if (purchaseAmount >= 2000) {
			this.setDiscountLevel(.1);
		}
	}
	public void setDiscountLevel(double discountLevel) {
		this.discountLevel = discountLevel;
	}

	@Override
	public String toString() {
		return "Purchase amount: $" + this.getPurchaseAmount() + "\n"
			+ "Discount level: " + this.getDiscountLevel() + "\n";
	}
}
