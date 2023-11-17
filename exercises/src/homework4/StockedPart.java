package homework4;

public abstract class StockedPart {
	
	//Variables
	private String partName;
	private int numberInStock;
	
	//Getters
	public String getPartName() {
		return partName;
	}
	
	public int getNumberInStock()	{
		return numberInStock;
	}
	
	//Other methods
	public StockedPart(String partName, int numberInStock)	{
		this.partName = partName;
		this.numberInStock = numberInStock;
	}
	
	public abstract double inventoryValue();
}
