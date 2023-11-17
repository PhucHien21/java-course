package homework4;

import java.util.*;

public class StockList {

	public static void main(String[] args) {
		
		//Create Array List
		ArrayList<StockedPart> List = new ArrayList<>();
		List.add(new SameFactory("Screen", 200, 20, 10.19));
		List.add(new Purchased("Keyboard", 150, 50.48, "TriHoang"));
		List.add(new SameFactory("CPU", 100, 240, 50.27));
		List.add(new Purchased("Mouse", 130, 50.56, "Electronics"));
		List.add(new SameFactory("Speaker", 200, 30, 80.35));
		List.add(new Purchased ("Microphone", 160, 30.64, "Noidea"));
		
		//Output
		System.out.println("List items:");
		for(StockedPart i:List) {
			System.out.println(i.toString());
		}
		
		System.out.println("\nNames and inventory values of part:");
		for(StockedPart j:List)	{
			System.out.println("Name: " + j.getPartName() + ", Inventory values: " 
						+ String.format("%.2f", j.inventoryValue()));
		}
	}
}
