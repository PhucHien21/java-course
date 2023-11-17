package homework4;

public class Purchased extends StockedPart{
	
	//Variables
	private double price;
	private String supplier;
	
	//Getters
	public double getPrice() {
		return price;
	}
	public String getSupplier() {
		return supplier;
	}
	
	//Other methods
	public Purchased(String partName, int numberInStock, double price, String supplier)	{
		super(partName, numberInStock);
		this.price = price;
		this.supplier = supplier;
	}
	
	public double inventoryValue()	{
		return price*getNumberInStock();
	}
	
	@Override
	public String toString() {
		return "Part name: " + getPartName() + ", Number in stock: " + getNumberInStock()
				+ ", Supplier: " + getSupplier() + ", Price" + getPrice();
	}
}
