package Assignment2;

import java.util.Scanner;

public class Exercise2_1 {

	public static void main(String[] args) {
		
		System.out.println("Enter Upper Right conner coordinates and Lower Left conner coordinates");
		Scanner URX = new Scanner(System.in);	double URx = URX.nextDouble();
		Scanner URY = new Scanner(System.in);	double URy = URY.nextDouble();
		Scanner LLX = new Scanner(System.in);	double LLx = LLX.nextDouble();
		Scanner LLY = new Scanner(System.in);	double LLy = LLY.nextDouble();
		
		Rectangle rec1 = new Rectangle();
		Rectangle rec2 = new Rectangle(URx, URy);
		Rectangle rec3 = new Rectangle(URx, URy, LLx, LLy);
		
		System.out.println("Rectangle 1: Width " + rec1.width() + 
				", Height " + rec1.height() + ", Area " + rec1.area());
		System.out.println("Rectangle 2: Width " + rec2.width() + 
				", Height " + rec2.height() + ", Area " + rec2.area());
		System.out.println("Rectangle 3: Width " + rec3.width() + 
				", Height " + rec3.height() + ", Area " + rec3.area());
	}

}
