package Assignment8;
import java.util.*;
import java.io.*;
public class Ex8_1new {

	public static void main(String[] args) {
		
		System.out.println("Enter the text's name");
		Scanner input1 = new Scanner(System.in);
		String name = input1.nextLine();
		name += ".txt";
		
		System.out.println("Enter the search String");
		Scanner input2 = new Scanner(System.in);		
		String search = input2.nextLine();
						
		try(BufferedReader input = new BufferedReader(new FileReader(name)))	{
    		String line;
    		while((line = input.readLine()) != null)	{
    			if (line.toLowerCase().contains(search.toLowerCase())) {
    				System.out.println(line);
    			}
    		}
    	} 
    	catch (IOException e1) {
    		System.out.println("There is no " + name + " file!");
    	}

		
}
}	