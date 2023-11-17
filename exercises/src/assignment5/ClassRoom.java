package assignment5;

import java.util.Scanner;

public class ClassRoom extends Room{
	private int seats;
	private int computers;
	private String dataProjector;
	
	public void askData()	{
		super.askData();
		System.out.println("Enter seats: ");
		Scanner seat = new Scanner(System.in);
		seats = seat.nextInt();
		System.out.println("Enter computers: ");
		Scanner com = new Scanner(System.in);
		computers = com.nextInt();
		System.out.println("DataProjector? (Y/N): ");
		Scanner data = new Scanner(System.in);
		dataProjector = data.nextLine();
	}
	
	public String toString()	{
		return super.toString() + ", seats: " + seats + ", computers: " + computers + ", DataProjector: " + dataProjector;
	}
}
