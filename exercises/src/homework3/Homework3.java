package homework3;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		
		char choice = 'y';
		int select = 0;
		
		Scanner option, choose, codeEnter, nameEnter, crEnter;
		String code, name;
		int cr;
		
		ArrayList<Course> course = new ArrayList<>();
		Curriculum courses = new Curriculum(course);
		
		System.out.println("Curriculum");
		
		
		while (choice == 'y' || choice == 'Y')	{
			
			System.out.println("================");	
			System.out.println("Select your work");
			System.out.println("1: Find courses with given code ");
			System.out.println("2: Find courses with given words ");
			System.out.println("3: Find courses have given credits ");
			System.out.print("Type your option (1 to 3) ");
			option = new Scanner(System.in); 
			select = option.nextInt();
				
			switch (select)	{
				case 1:
					System.out.print("Enter the course's code: ");
					codeEnter = new Scanner(System.in);
					code = codeEnter.nextLine();
					courses.searchCode(course, code);
					break;
				case 2:
					System.out.print("Enter the course's name: ");
					nameEnter = new Scanner(System.in);
					name = nameEnter.nextLine();
					courses.searchName(course, name);
					break;
				case 3:
					System.out.print("Enter the course's credits: ");
					crEnter = new Scanner(System.in);
					cr = crEnter.nextInt();
					courses.searchCredit(course, cr);
					break;
				default:
					System.out.println("Select work from 1 to 3");
					continue;
			}
			System.out.print("Continue? (Y/N) ");
			choose = new Scanner(System.in);
			choice = choose.next().charAt(0);
		}
		System.out.println("Done");
	}
}
