package Assignment3;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise3_1 {

	public static void main(String[] args) {
		
		Scanner input;
		String dateEnter;
		int check=0;
		
		System.out.println("Enter dates");
		
		ArrayList<Date> date = new ArrayList<>();
		
		input = new Scanner(System.in);
		dateEnter = input.nextLine();
		
		while (dateEnter.length()>0){
			date.add(new Date(dateEnter));
			input= new Scanner(System.in);
			dateEnter = input.nextLine();
		}
		
		for (int k=0; k<date.size(); k++)	{
			System.out.println(date.get(k).toString());
		}
		
		System.out.println("Enter year need to find: ");
		Scanner YEAR = new Scanner(System.in);
		int year = YEAR.nextInt();
		
		for (int k=0; k<date.size(); k++)	{
			if (date.get(k).getYear() == year)	{
				System.out.println(date.get(k).toString());
			}
			else { check++; }
		}
		
		if (check == date.size())	{
			System.out.println("There are no dates with following year");
		}
		
		System.out.println("Enter the date you want to find: ");
		Scanner DATEFIND = new Scanner(System.in);
		Date datefind = new Date(DATEFIND.nextLine());
		check = 0;
		for (int k=0; k<date.size(); k++)	{
			if (datefind.isSame(date.get(k)) == true)	{
				System.out.print("The index is: " + (k+1));
			}
			else {	check++; }
		}
		if (check == date.size())	{
			System.out.print("There is no date " + datefind + " in data");
		}
	}

}
