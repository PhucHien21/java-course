package assignment5;
import java.util.*;
public class Ex5_3 {

	public static void main(String[] args) {
		ArrayList<Room> rooms = new ArrayList<>();
	
		System.out.println("Menu:\n"
				+ "1. Insert an office\n"
				+ "2. Insert a classroom\n"
				+ "3. Insert another room\n"
				+ "4. Print out all rooms\n"
				+ "5. Print out offices\n"
				+ "6. Print out classrooms\n"
				+ "7. Print out other rooms\n"
				+ "8. Search a room\n"
				+ "9. Search a staff member\n"
				+ "0. Stop\n"
				+ "Choose your action: ");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		
		while (choice != 0)	{
			
			switch(choice) {
			case 1:
				Office office = new Office();
				office.askData();
				rooms.add(office);
				break;
			case 2:
				ClassRoom classroom = new ClassRoom();
				classroom.askData();
				rooms.add(classroom);
				break;
			case 3:
				Room other = new Room();
				other.askData();
				rooms.add(other);
				break;
			case 4:
				for(Room room: rooms)	{
					System.out.println(room.toString());
				}
				System.out.println("\n");
				break;
			case 5:
				for(Room room: rooms)	{
					if (room instanceof Office)	{
						System.out.println(room.toString());
					}
				}
				System.out.println("\n");
				break;
			case 6:
				for(Room room: rooms)	{
					if (room instanceof ClassRoom)	{
						System.out.println(room.toString());
					}
				}
				System.out.println("\n");
				break;
			case 7:
				for (Room room: rooms) {
					if(room instanceof Office == false && room instanceof ClassRoom == false)	{
						System.out.println(room.toString());
					}
				}
				System.out.println("\n");
				break;
			case 8:
				System.out.println("Enter finded room number: ");
				Scanner check = new Scanner(System.in);
				String Check = check.next();
				for(Room room: rooms)	{
					if (room.getRoomNumber().equalsIgnoreCase(Check))	{
						System.out.println(room.toString());
					}
				}
				break;
			case 9:
				System.out.println("Enter staff name: ");
				Scanner check9 = new Scanner(System.in);
				String Check9 = check9.next();
				for(Room room: rooms)	{
					
					if (room instanceof Office) {
						((Office) room).worksHere(Check9);
					}
						
				}
				break;
			}
			
			System.out.println("Menu:\n"
					+ "1. Insert an office\n"
					+ "2. Insert a classroom\n"
					+ "3. Insert another room\n"
					+ "4. Print out all rooms\n"
					+ "5. Print out offices\n"
					+ "6. Print out classrooms\n"
					+ "7. Print out other rooms\n"
					+ "8. Search a room\n"
					+ "9. Search a staff member\n"
					+ "0. Stop\n"
					+ "Choose your action: ");
			choice = input.nextInt();
		}
		System.out.println("Done!");
	}

}
