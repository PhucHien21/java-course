package assignment5;

public class Ex5_1 {

	public static void main(String[] args) {
		SolidPrism prism = new SolidPrism();
		prism.setHeight(7.3);
		prism.setLenght(6.4);
		prism.setWidth(9.2);
		prism.setDensity(4.1);
		System.out.println("Volume: " + prism.volume());
		System.out.println("Mass: " + prism.mass());
	}

}
