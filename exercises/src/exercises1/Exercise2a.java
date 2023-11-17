package exercises1;

import java.util.Scanner;

public class Exercise2a {

	public static void main(String[] args) {
		System.out.println("Enter both number");
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		int a = input1.nextInt();
		int b = input2.nextInt();
		
		if (a>b) {
			System.out.println("The greater value is " + a);
		}
		if (a<b) {
			System.out.println("The greater value is " + b);
		}
		if (a==b) {
			System.out.println("They are equal");
		}
	}

}
