package assignment6;
import java.util.*;
public class Ex6_2 {

	public static void main(String[] args) {
		ArrayList<Date> date = new ArrayList<>();
		date.add(new Date(21, 9, 2001));
		date.add(new Date(21, 8, 2002));
		date.add(new Date(18, 7, 1969));
		date.add(new Date(17, 8, 1969));
		date.add(new Date(8, 3, 1970));
		
		
		Collections.sort(date);
		
		for (Date data: date) {
			System.out.println(data.toString());
		}
		
		System.out.println("Enter the date: ");
		Scanner input = new Scanner(System.in);
		Date datef = new Date(input.nextLine());
		String dateNew;
		while (true) {
			for (Date data: date) {
				if (datef.compareTo(data) == -1)	{
					System.out.println(data.toString());
				}
			}
			System.out.println("Enter the date (Enter 0 to stop)");
			dateNew = input.nextLine();
			datef = new Date(dateNew);

		}
		
	}

}
