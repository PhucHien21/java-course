package homework3;

public class Course {
	
	//Variables
	private String code, name;
	private double credits;
	
	//Constructor
	public Course(String code, String name, double credits)	{
		this.code = code;
		this.name = name;
		this.credits = credits;
	}
	
	//Setters and Getters
	public String getCode()	{
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}

	public String getName()	{
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getCredits()	{
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}
	
	//Other Methods
	public String toString()	{
		return "Code: " + code + ", Name: " + name + ", Credits: " + credits;
	}
	
	
}
