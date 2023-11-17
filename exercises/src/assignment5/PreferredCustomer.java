package assignment5;

public class PreferredCustomer extends Customer{
	private double purchases;
	private double result;
	public double getPurchases() {
		return purchases;
	}
	
	public PreferredCustomer(int customerNumber, String name, String address, double purchases) {
		super(customerNumber, name, address);
		this.purchases = purchases;
	}

	public void setPurchases(double purchases) {
		this.purchases = purchases;
	}
	
	public double bonus()	{
		if (purchases>=500 && purchases<=1000) {
			result = purchases*2/100;
		}
		else if(purchases>1000) {
			result = purchases*5/100;
		}
		return result;
	}

	public String toString()	{
		return super.toString() + ", purchases: " + purchases + ", bonus: " + bonus();
	}
}
