package Assignment3;

public class Date {
	
	//Variables
	private int day, month, year;

	//Constructor
	/*public Date(String date)	{
		this.day = Integer.parseInt(date.substring(0, 2));
		this.month = Integer.parseInt(date.substring(3, 5));
		this.year = Integer.parseInt(date.substring(6, 10));
	}*/
	
	public Date(String date)	{	
		String[] array = date.split("\\.", 3);
		this.day = Integer.parseInt(array[0]);
		this.month = Integer.parseInt(array[1]);
		this.year = Integer.parseInt(array[2]);
	}
	
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
	
	
}
