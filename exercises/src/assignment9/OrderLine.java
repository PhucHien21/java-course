package assignment9;

public class OrderLine extends Manager{
	
	private String name;
	private double price;
	private int quantity;

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double total() {
		return price*quantity;
	}

	public OrderLine(int id, String name, double price, int quantity) {
		super(id);
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "\n" + name + "\t\t" + price + "\t" + quantity + "\t" + total();
	}
	
	
	
}
