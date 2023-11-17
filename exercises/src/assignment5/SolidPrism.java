package assignment5;

public class SolidPrism extends Prism{
	private double density;

	public double getDensity() {
		return density;
	}

	public void setDensity(double density) {
		this.density = density;
	}
	
	public double mass()	{
		return density*volume();
	}
}
