package exercises1;

import java.util.Scanner;

public class Exercise2b {

	public static void main(String[] args) {
		System.out.println("How many strings you want?");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String[] store = new String[n];
		System.out.println("Enter strings");
		for(int i=0;i<n;i++) {
			Scanner input1 = new Scanner(System.in);
			store[i] = input1.nextLine();
		}
		for(int k=0;k<n;k++) {
			System.out.println(store[k]);
		}
	}

}
