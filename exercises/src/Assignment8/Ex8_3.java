package Assignment8;
import java.util.*;
import java.io.*;
public class Ex8_3 {

	private ArrayList<Employee> list = new ArrayList<>();
	private String fileName = "employees.dat";
	
	public void writeToFile() {
        System.out.println("ArrayList is serialized into employees.dat");
        try (ObjectOutputStream file_out
             = new ObjectOutputStream(new FileOutputStream(fileName))){
            file_out.writeObject(list);
        }
        catch(Exception e) {
            System.out.println("Problems with " + fileName);
            e.printStackTrace();
        }
    }
	
	@SuppressWarnings("unchecked")
    public void readFromFile() {
        System.out.println("ArrayList is de-serialized from employees.dat");
        try (ObjectInputStream file_in 
            = new ObjectInputStream(new FileInputStream(fileName))){
            list = (ArrayList<Employee>)file_in.readObject();
        }
        catch(Exception e) {
            System.out.println("Problems with " + fileName);
            e.printStackTrace();
        }
    }
	
	public void insertData()	{
		//@SuppressWarnings("resource")
        //Scanner input = new Scanner(System.in);
        //input.useLocale(Locale.ENGLISH);
		System.out.println("Enter your employee's type: "
        		+ "\n1: Hourly Employee"
        		+ "\n2: Sales Employee"
        		+ "\n3: Sales Manager "
        		+ "\n0: Done!");
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        int choice = input1.nextInt();
        
        while (choice != 0) {
        	switch(choice)	{
        	case 1:
        			System.out.println("Name?");
        			String name1 = input2.nextLine();
        			System.out.println("Hours?");
        			double hours = input1.nextDouble();
        			System.out.println("Hourly Wage?");
        			double hourlyWage = input1.nextDouble();
        			list.add(new HourlyEmployee(name1, hours, hourlyWage));
        			break;
        	case 2:
        			System.out.println("Name?");
        			String name2 = input2.nextLine();
        			System.out.println("Sales?");
        			double sales1 = input1.nextDouble();
        			System.out.println("commissionPercent");
        			double commissionPercent1 = input1.nextDouble();
        			list.add(new SalesEmployee(name2, sales1, commissionPercent1));
        			break;
        	case 3:
        			System.out.println("Name?");
        			String name3 = input2.nextLine();
        			System.out.println("Monthly Salary?");
        			double monthlySalary = input1.nextDouble();
        			System.out.println("Sales?");
        			double sales2 = input1.nextDouble();
        			System.out.println("commissionPercent");
        			double commissionPercent2 = input1.nextDouble();
        			list.add(new SalesManager(name3, monthlySalary, sales2, commissionPercent2));
        			break;
        	}
        	System.out.println("Enter your employee's type: "
            		+ "\n1: Hourly Employee"
            		+ "\n2: Sales Employee"
            		+ "\n3: Sales Manager "
            		+ "\n0: Done!");
        	choice = input1.nextInt();
        }
		 
	}
	
	public void print()	{
		System.out.println("List: ");
		for(Employee li: list)	{
			System.out.println(li.toString());
			System.out.println("Salary: " + li.calculateSalary() + " €");
		}
	}
	
	public static void main(String[] args) {
		Ex8_3 list = new Ex8_3();
		
		System.out.println("Enter your choice: "
				+ "\n1: Insert data and write into a file"
				+ "\n2: Read and print data from file"
				+ "\n0: Exit");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		
		while (choice != 0)	{
			switch (choice) {
			case 1:
				list.insertData();
				list.writeToFile();
				break;
			case 2:
				list.readFromFile();
				list.print();
			}
			System.out.println("Enter your choice: "
					+ "\n1: Insert data and write into a file"
					+ "\n2: Read and print data from file"
					+ "\n0: Exit");
			choice = input.nextInt();
		}
		
		System.out.println("Done!");

	}

}
