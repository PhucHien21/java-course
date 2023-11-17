package assignment9new;

public class Order {
	private int ID;
	private String cusName;
	private Date Date;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		this.ID = iD;
	}
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
	public Order(int iD, String cusName, Date date) {
		this.ID = iD;
		this.cusName = cusName;
		this.Date = date;
	}
	
	public String toString()	{
		return "Order ID: " + ID + "\nCustomer: " + cusName + "\nOrder date: " + Date.toString();
	}
	
	/*private double sum()	{
		total = 0;
		for(OrderLine list:order)	{
			total += list.total();
		}
		return total;
	}*/
}
