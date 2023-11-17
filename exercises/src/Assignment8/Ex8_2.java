package Assignment8;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class Ex8_2 {

	public static void main(String[] args) {
		
		ArrayList<Employee> list = new ArrayList<>();
		
		System.out.println("Enter the text's name");
		Scanner input1 = new Scanner(System.in);
		String filename = input1.nextLine();
		filename += ".txt";
		
		try(BufferedReader input = new BufferedReader(new FileReader(filename)))	{
    		String line;
    		while((line = input.readLine()) != null)	{
    			if(line.equals("HE"))	{
    				String name = input.readLine();
    				double hours = Double.parseDouble(input.readLine());
    				double hourlyWage = Double.parseDouble(input.readLine());
    				list.add(new HourlyEmployee(name, hours, hourlyWage));
    			}
    			
    			else if(line.equals("SE"))	{
    				String name = input.readLine();
    				double sales = Double.parseDouble(input.readLine());
    				double commissionPercent = Double.parseDouble(input.readLine());
    				list.add(new SalesEmployee(name, sales, commissionPercent));
    			}
    			
    			else if(line.equals("SM"))	{
    				String name = input.readLine();
    				double monthlySalary = Double.parseDouble(input.readLine());
    				double sales = Double.parseDouble(input.readLine());
    				double commissionPercent = Double.parseDouble(input.readLine());
    				list.add(new SalesManager(name, monthlySalary ,sales, commissionPercent));
    			}
    		}
    	} 
    	catch (IOException e1) {
    		System.out.println("There is no " + filename + " file!");
    	}
		
		for(Employee li: list)	{
			System.out.println(li.toString());
			System.out.println("Salary: " + li.calculateSalary() + " €");
		}

	}

}