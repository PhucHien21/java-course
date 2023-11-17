package assignment4;
import java.util.Scanner;
public class Ex4_2b {
	
	private Distribution Distro;
	StringBuilder str = new StringBuilder();
	public Ex4_2b(Distribution Distro) {
		this.Distro = Distro;
	}
	
	public void getNumber(int num) {
		Distro.insertValue(num);
	}
	
	public String print()	{
		str.append("Number\t\tFrequency\n");
		for (int i=Distro.getMin(); i<=Distro.getMax(); i++) {
			str.append(i + "\t\t" + Distro.frequency(i) + "\n");
		}
		str.append("Average: " + Distro.average());
		return str.toString();
	}
	
	public static void main(String[] args) {
		Distribution newDistro = new Distribution(0, 5);
		Ex4_2b distro = new Ex4_2b(newDistro);
		System.out.println("Enter the grade (Enter number > 5 to calculate)");
		Scanner input = new Scanner(System.in);
		int grade = input.nextInt();
		while (grade>=0 && grade<=5) {
			distro.getNumber(grade);
			System.out.println("Enter the grade (Enter number > 5 to calculate)");
			grade = input.nextInt();
		}
		System.out.println("Result:\n" + distro.print());
	}

}
