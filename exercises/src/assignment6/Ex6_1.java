package assignment6;
import java.util.*;
public class Ex6_1 {

	public static void main(String[] args) {
		ArrayList<Measurable> objects = new ArrayList<>();
		int fig = 1;
		objects.add(new Circle(5.7, 9.1, 3.2));
		objects.add(new Rectangle(2.9, 4.1, 7.5, 8.6));
		
		for (Measurable obj: objects)	{
			System.out.println("Figure " + fig + ": Area = " + obj.area() + ", Perimeter = " + obj.perimeter());
			fig++;
		}
		
		fig = 1;
		
		System.out.println("Enter scale value: ");
		Scanner input = new Scanner(System.in);
		double value = input.nextDouble();
		
		while (value != 0) {
			for (Measurable obj: objects)	{
				obj.scale(value);
				System.out.println("Figure " + fig + ": Area = " + obj.area() + ", Perimeter = " + obj.perimeter());
				fig++;
			}
			
			fig = 1;
			
			System.out.println("Enter scale value (enter 0 to stop): ");
			value = input.nextDouble();
		}
		System.out.println("Done!");
	}

}
