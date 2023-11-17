package assignment6;

public class Circle implements Measurable{
	private double cx; // centre x
    private double cy; // centre y
    private double r; // radius
    
  //Constructor
    public Circle(double cx, double cy, double r) {
        this.cx = cx;
        this.cy = cy;
        this.r = r;
    }

    public double getCx() {
        return cx;
    }

    public double getCy() {
        return cy;
    }

    public double getR() {
        return r;
    }

    public double area() {
        return Math.PI * r * r;
    }
    
    public double perimeter() {
        return Math.PI * (r * 2);
    }
    
    public void scale(double scaleValue) {
    	this.r = this.r*scaleValue;
    }
}
