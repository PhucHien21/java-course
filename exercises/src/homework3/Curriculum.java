package homework3;

import java.util.ArrayList;

public class Curriculum {
	
	ArrayList<Course> course = new ArrayList<>();
	private int check;
	
	public Curriculum(ArrayList<Course> course)	{
		course.add(new Course("IITB8003", "Object Oriented Programming", 5));
		course.add(new Course("IITB5003", "Electronics", 5));
		course.add(new Course("IITB0106", "Mechanics", 4));
		course.add(new Course("IITB3003", "Differential Calculus", 2));
		course.add(new Course("IITB8002", "Application Development", 4));
		course.add(new Course("IITB8001", "C Programming", 4));
		course.add(new Course("IITB9001", "Digital Electronics", 5));
	}
	
	public ArrayList<Course> getCourse() {
		return course;
	}

	public void setCourse(ArrayList<Course> course) {
		this.course = course;
	}
	
	public void searchCode(ArrayList<Course> course, String ID)	{
		check = 0;
		for (int i=0; i<course.size(); i++) {
			if (course.get(i).getCode().equalsIgnoreCase(ID) == true) {
				System.out.println("Course: " + course.get(i).toString());
				check++;
			}
		}
		if (check == 0) {
			System.out.println("There are no courses with code " + ID);
		}
	}
	
	public void searchName(ArrayList<Course> course, String name)	{
		check = 0;
		for (int i=0; i<course.size(); i++) {
			if (course.get(i).getName().toLowerCase().contains(name.toLowerCase()) == true) {
				System.out.println("Course: " + course.get(i).toString());
				check++;
			}
		}
		if (check == 0) {
			System.out.println("There are no courses with words " + name);
		}
	}
	
	public void searchCredit(ArrayList<Course> course, int cr)	{
		check = 0;
		for (int i=0; i<course.size(); i++) {
			if (course.get(i).getCredits() == cr) {
				System.out.println("Course: " + course.get(i).toString());
				check++;
			}
		}
		if (check == 0) {
			System.out.println("There are no courses have " + cr + " credits");
		}
	}
	
}
