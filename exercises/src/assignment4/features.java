package assignment4;
import java.util.*;
public class features {
	private int ID;
	private String cusName;
	private date Date;
	private double total;
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
	public date getDate() {
		return Date;
	}
	public void setDate(date date) {
		this.Date = date;
	}
	public void addFeatures(int iD, String cusName, date date) {
		this.ID = iD;
		this.cusName = cusName;
		this.Date = date;
	}
	
	private ArrayList<orderLine> order = new ArrayList<>();
	public features()	{
		order.add(new orderLine("Pencil", 2.5, 100));
		order.add(new orderLine("Note book", 5, 20));
		order.add(new orderLine("Pencil case", 14.95, 10));
	}
	private double sum()	{
		total = 0;
		for(orderLine list:order)	{
			total += list.total();
		}
		return total;
	}
	
	public String toString()	{
		StringBuilder string = new StringBuilder();
		string.append("Order ID:\t" + ID + "\nCustomer:\t" + cusName + "\nOrder Date:\t" + Date);
		string.append("\nProduct \t\t Price \t Quantity \t Sum");
		for(orderLine list:order) {
			string.append(list.toString());
		}
		string.append("\nTotal price: " + sum() + " �");
		String name = string.toString();
		return name;
	}
}