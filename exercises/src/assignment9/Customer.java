package assignment9;

public class Customer extends Manager{
	
	private String cusName;
	private Date Date;

	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public Date getDate() {
		return Date;
	}
	public void setDate(Date date) {
		this.Date = date;
	}
	public Customer(int id, String cusName, Date date) {
		super(id);
		this.cusName = cusName;
		this.Date = date;
	}
	public String toString()	{
		return "Order ID: " + super.getID() + "\nCustomer: " + cusName + "\nOrder date: " + Date.toString();
	}
	/*private double sum()	{
		total = 0;
		for(DrderLine list:order)	{
			total += list.total();
		}
		return total;
	}*/
}
