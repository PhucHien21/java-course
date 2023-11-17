package homework4;

public class SameFactory extends StockedPart{
	
	//Variables
	private int amount;
	private double rawUnitPrice;
	
	//Getters
	public int getAmount()	{
		return amount;
	}
	
	public double getRawUnitPrice()	{
		return rawUnitPrice;
	}
	
	//Other methods
	public SameFactory(String partName, int numberInStock, int amount, double rawUnitPrice) {
		super(partName, numberInStock);
		this.amount = amount;
		this.rawUnitPrice = rawUnitPrice;
	}
	
	public double inventoryValue()	{
		return amount*rawUnitPrice*getNumberInStock();
	}

	@Override
	public String toString() {
		return "Part name: " + getPartName() + ", Number in stock: " + getNumberInStock()
				+ ", Amount: " + getAmount() + ", Raw unit price: " + getRawUnitPrice();
	}
}
