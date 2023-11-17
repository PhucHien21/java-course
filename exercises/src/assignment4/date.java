package assignment4;

public class date {
	
	private int day, month, year;
		
	public date(int day, int month, int year)	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public date(String date)	{	
		String[] array = date.split("\\.", 3);
		this.day = Integer.parseInt(array[0]);
		this.month = Integer.parseInt(array[1]);
		this.year = Integer.parseInt(array[2]);
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return getDay() + "." + getMonth() + "." + getYear();
	}
	
	
}
