package Assignment3;

import java.util.HashMap;
import java.util.Scanner;

public class Excercise3_2 {

	public static void main(String[] args) {
		
		Scanner num;
		int number;
		Scanner price;
		double prices;
		HashMap<Integer, Double> product = new HashMap<>();
		
		System.out.println("Enter product number and prices");
		System.out.print("Enter the product number (Enter 0 to stop) ");
		num = new Scanner(System.in);
		number = num.nextInt();
		
		while (number != 0)	{
			System.out.print("Enter the product prices: ");
			price = new Scanner(System.in);
			prices = price.nextDouble();
			product.put(number, prices);
			System.out.println("=================");
			System.out.print("Enter the product number (Enter 0 to stop) ");
			num = new Scanner(System.in);
			number = num.nextInt();
		}
		
		System.out.println("================");
		System.out.println("Show product price");
		System.out.print("Enter the product number (Enter 0 to stop): ");
		num= new Scanner(System.in);
		number = num.nextInt();
		while (number != 0)	{
			if (product.containsKey(number))	{
				System.out.println("Product price: " + product.get(number));
			}
			else {
				System.out.println("There is not product with number " + number);
			}
			System.out.println("================");
			System.out.print("Enter the product number (Enter 0 to stop): ");
			num= new Scanner(System.in);
			number = num.nextInt();
		}
		
		System.out.println("Done");
		
	}

}
