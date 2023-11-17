package exercises1;

import java.util.Scanner;

public class Exercise4b {

	public static void main(String[] args) {
		ex4 product;
		product = new ex4();
		System.out.println("How many orders?");
		Scanner orders = new Scanner(System.in);
		int k = orders.nextInt();
		ex4[] list = new ex4[k];
		for (int i=0; i<k; i++)	{
			orders.nextLine();
			list[i]=new ex4();
			System.out.println("Product name?");
			list[i].setName(orders.nextLine());
			System.out.println("Price?");
			list[i].setPrice(orders.nextDouble());
			System.out.println("Quantity?");
			list[i].setQuantity(orders.nextInt());
			list[i].total();
		}
		
		double sum = 0;
		for (int i=0; i<k; i++)	{
			sum +=list[i].total();
		}
		
		System.out.println("Receipt");
		System.out.println("Name \t Price \t Quantity \t Total");
		for (int i=0; i<k; i++)	{
			System.out.println(list[i].getName() + " \t" + list[i].getPrice() + " \t" + list[i].getQuantity() + " \t" + list[i].total());
		}
		System.out.println();
		System.out.println("Total: " + sum);
		
	}

}
