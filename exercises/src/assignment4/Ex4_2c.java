package assignment4;
import java.util.*;
public class Ex4_2c {

	private Distribution Distro;
	StringBuilder str = new StringBuilder();
	public Ex4_2c(Distribution Distro) {
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
		Distribution newDistro = new Distribution(1, 6);
		Ex4_2c distro = new Ex4_2c(newDistro);
		Dice dice = new Dice();
		String Check = "y";
		int num;
		System.out.println("Start (Y/N)");
		Scanner input = new Scanner(System.in);
		String check = new String();
		check = input.nextLine();
		while (check.equalsIgnoreCase(Check))	{
			num = dice.rollDice();
			distro.getNumber(num);
			System.out.println("Continue (Y/N)");
			check = input.nextLine();
		}
		System.out.println("Result:\n" + distro.print());
	}

}
