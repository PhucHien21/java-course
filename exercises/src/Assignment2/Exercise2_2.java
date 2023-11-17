package Assignment2;

import java.util.Scanner;

public class Exercise2_2 {

	public static void main(String[] args) {
		System.out.println("Enter the date");
		
		Scanner DAY = new Scanner(System.in);	int day = DAY.nextInt();
		Scanner MONTH = new Scanner(System.in);	int month = MONTH.nextInt();
		Scanner YEAR = new Scanner(System.in);	int year = YEAR.nextInt();

		Date date = new Date();
		date.setDay(day);
		date.setMonth(month);
		date.setYear(year);
		Date today = new Date();
		
		System.out.println("The date entered: " + date.toString());
		System.out.println("The day today: " + today.toString());
		
		System.out.println("Enter the date (Using constructor): ");
		
		Scanner DAY1 = new Scanner(System.in);		int day1 = DAY1.nextInt();
		Scanner MONTH1 = new Scanner(System.in);	int month1 = MONTH1.nextInt();
		Scanner YEAR1 = new Scanner(System.in);		int year1 = YEAR1.nextInt();
		Date date1 = new Date(day1, month1, year1);
		
		System.out.println("The day entered (Using constructor): " + date1.toString());
		
		System.out.println("Enter the day (in String): ");
		
		Scanner DAY2 = new Scanner(System.in);
		
		Date date2 = new Date(DAY2.nextLine());
		
		System.out.println("The day enter (in String): " + date2.toString());
		
		System.out.println("Compare the first date entered and second day entered: " + date.isSame(date1));
		
		System.out.println("The first date entered in long form: " + date.longDate());
		
		System.out.println("Enter the month's name: ");
		
		Scanner MONTHENTER = new Scanner(System.in);
		
		Date.setMonthNumber(MONTHENTER.nextLine());
	}

}
