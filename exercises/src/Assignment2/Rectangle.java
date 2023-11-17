package Assignment2;

public class Rectangle {
	
	//Variables
	
	private double LLx;
	private double LLy;
	private double URx;
	private double URy;
	
	//Constructors
	public Rectangle()	{
		this.LLx=0;
		this.LLy=0;
		this.URx=1;
		this.URy=1;
	}
	
	public Rectangle(double URx, double URy) {
		this.LLx=0;
		this.LLy=0;
		this.URx=URx;
		this.URy=URy;
	}
	
	public Rectangle(double LLx, double LLy, double URx, double URy)	{
		this.LLx=LLx;
		this.LLy=LLy;
		this.URx=URx;
		this.URy=URy;
	}
	
	//Setters and Getters
	
	public double getLLx()	{
		return LLx;
	}
	
	public void setLLx(double LLx) {
		this.LLx = LLx;
	}

	public double getLLy()	{
		return LLy;
	}
	
	public void setLLy(double LLy) {
		this.LLy = LLy;
	}


	public double getURx()	{
		return URx;
	}
	
	public void setURx(double URx) {
		this.URx = URx;
	}
	
	public double getURy()	{
		return URy;
	}

	public void setURy(double URy) {
		this.URy = URy;
	}
	
	//Other methods
	
	public double width()	{
		return Math.abs(URx-LLx);
	}
	
	public double height()	{
		return Math.abs(URy-LLy);
	}
	
	public double area()	{
		return width()*height();
	}
	
}
