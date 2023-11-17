package assignment4;

public class Ex4_2 {

	private Distribution Distro;
	StringBuilder str = new StringBuilder();
	public Ex4_2(Distribution Distro) {
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
		Distribution newDistro = new Distribution(0, 9);
		Ex4_2 distro = new Ex4_2(newDistro);
		distro.getNumber(2);
		distro.getNumber(4);
		distro.getNumber(6);
		distro.getNumber(7);
		distro.getNumber(9);
		distro.getNumber(1);
		distro.getNumber(3);
		System.out.println(distro.print());
	}

}
