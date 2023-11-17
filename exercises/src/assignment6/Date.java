package assignment6;

public class Date implements Comparable<Date>{
	
	private int day, month, year;
	
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
	
	public int compareTo(Date another) {
		int i;
		if (year < another.year)	{
			i = -1;
		}
		else if (year > another.year)	{
			i = 1;
		}
		else if (month < another.month)	{
			i = -1;
		}
		else if (month > another.month)	{
			i = 1;
		}
		else if (day < another.day)	{
			i = -1;
		}
		else if (day > another.day)	{
			i = 1;
		}
		else { i = 0; }
		return i;
	}
	
	public String toString()	{
		return day + "." + month + "." + year;
	}
	
}
