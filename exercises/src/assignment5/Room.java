package assignment5;
import java.util.*;
public class Room {
	private String roomNumber;
	private String description;
	
	public String getRoomNumber() {
		return roomNumber;
	}

	public void askData()	{
		System.out.println("Enter room number: ");
		Scanner roomNum = new Scanner(System.in);
		roomNumber = roomNum.nextLine();
		System.out.println("Enter room's description: ");
		Scanner descrip = new Scanner(System.in);
		description = descrip.nextLine();
	}

	@Override
	public String toString() {
		return roomNumber + ": " + description;
	}
	
	
	
}
