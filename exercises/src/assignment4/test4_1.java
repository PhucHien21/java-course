package assignment4;

public class test4_1 {

	public static void main(String[] args) {
		features newOrder = new features();
		date Date = new date(12,11,2018);
		newOrder.addFeatures(1056, "Charlie Brown", Date);
		System.out.println(newOrder.toString());
	}

}
