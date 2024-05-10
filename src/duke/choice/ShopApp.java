package duke.choice;

public class ShopApp {

	public static void main(String[] args) {

		double tax = 0.2;
		
		System.out.println("Welcome to Duke Choice Shop");
		
		Customer c1 = new Customer();
		c1.setName("Pinky");
		System.out.println("\nHello, " + c1 +"!");
		
		
		Clothing item1 = new Clothing();
		Clothing item2 = new Clothing();
		
		item1.setDescription("Blue Jacket");
		item1.setPrice(20.9);
		item1.setSize("M");
		
		item2.setDescription("Orange T-Shirt");
		item2.setPrice(10.5);
		item2.setSize("S");
		
		System.out.println();
		System.out.println(item1);
		System.out.println(item2);
		
		//assume the customer has purchased two T-Shirts and one Jacket.
		
		double total = 0; 
		total = (item2.price * 2 + item1.price) * (1 + tax);
		System.out.println("\n$" + total); 
	}

}
