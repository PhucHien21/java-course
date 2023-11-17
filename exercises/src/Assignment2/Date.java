package Assignment2;

public class Date {
	
	//Variables
	private int day, month, year;
	
	//Constructor
	public Date() {
		java.time.LocalDate today = java.time.LocalDate.now();
		day = today.getDayOfMonth();
		month = today.getMonthValue();
		year = today.getYear();
	}
	
	public Date(int day, int month, int year)	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	
	public Date(String date)	{	
		String[] array = date.split("\\.", 3);
		this.day = Integer.parseInt(array[0]);
		this.month = Integer.parseInt(array[1]);
		this.year = Integer.parseInt(array[2]);
	}
	
	/*
	public Date(String date)	{
		this.day = Integer.parseInt(date.substring(0, 2));
		this.month = Integer.parseInt(date.substring(3, 5));
		this.year = Integer.parseInt(date.substring(6, 10));
	}
	*/
	//Setters and Getters
	public int getDay()	{
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth()	{
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getYear()	{
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	//Othes Methods
	public String toString()	{
		return day + "." + month + "." + year;
	}
	
	public boolean isSame(Date another) {
		if (another.getDay() == this.day && another.getMonth() == this.month 
				&& another.getYear() == this.year)	{
			return true;
		}
		else	{
			return false;
		}
	}
	
	public static final String[] MONTHNAMES = {"January", "February", "March",
	                                           "April", "May", "June",
	                                           "July", "August", "September",
	                                           "October", "November","December"};
	public String longDate() {
		return "The " + day + " of " + MONTHNAMES[month-1] + ", " + year;
	}
	
	public static void setMonthNumber(String monthEnter) {	
		int i;
		int check = 0;
		for (i=0; i<12; i++) {
			if (MONTHNAMES[i].equalsIgnoreCase(monthEnter) == true)	{
				System.out.println("The month's number is: " + (i+1));
			}
			else { check++; }
		}
		if (check == 12)	{
			System.out.println("There are no month call: " + monthEnter);
		}
		
	}
}
