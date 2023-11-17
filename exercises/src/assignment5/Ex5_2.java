package assignment5;
import java.util.*;
public class Ex5_2 {

	public static void main(String[] args) {
		ArrayList<Customer> customer = new ArrayList<>();
		customer.add(new Customer(1, "Tri Hoang", "C13"));
		customer.add(new PreferredCustomer(2, "Hong Huynh", "C13", 720.25));
		customer.add(new Customer(3, "Hong Yen", "C15"));
		customer.add(new PreferredCustomer(4, "Ngan Huynh", "C21", 1021.9));
		customer.add(new Customer(5, "Diep Bach", "C9"));
		customer.add(new PreferredCustomer(6, "Kim Vuong", "C9", 962.75));
		
		for(Customer cus: customer)	{
			System.out.println(cus.toString());
		}
		
		for(Customer cus: customer)	{
			if(cus instanceof PreferredCustomer) {
				System.out.println(cus.toString());
			}
			
		}
	}

}
