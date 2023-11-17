package assignment5;
import java.util.*;
public class Office extends Room{
	private String staffMembers;
	StringBuilder str = new StringBuilder();
	
	public void askData()	{
		super.askData();
		System.out.println("Enter staffs: ");
		Scanner staff = new Scanner(System.in);
		staffMembers = staff.nextLine();
		System.out.println("Enter staffs: (enter 0 to stop)");
		Scanner input = new Scanner(System.in);
		String Input = input.next();
		String check = "0";
		while (Input.equalsIgnoreCase(check) == false) {
			staffMembers = staffMembers + ", " + Input;
			System.out.println("Enter staffs: (enter 0 to stop)");
			Input = input.next();
		}
	}
	
	public String toString()	{
		return super.toString() + ", staff: " + staffMembers;
	}
	
	public void worksHere(String name) {
		StringBuffer sb = new StringBuffer(name);
		if (staffMembers.toLowerCase().contains(name.toLowerCase()))	{
			System.out.println(super.toString() + ", staff: " + staffMembers);
		}
	}
}