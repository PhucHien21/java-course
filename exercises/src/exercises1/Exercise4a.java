package exercises1;

public class Exercise4a {

	public static void main(String[] args) {
		ex4 product;
		product = new ex4();
		product.setName("Laptop");
		product.setPrice(2000);
		product.setQuantity(2);
		System.out.println("Name " + product.getName());
		System.out.println("Price " + product.getPrice());
		System.out.println("Quantity " + product.getQuantity());
		System.out.println();
		System.out.println("Total " + product.total());
	}

}
