package duke.choice;

public class ShopApp {

	public static void main(String[] args) {

		double tax = 0.2;
		
		System.out.println("Welcome to Duke Choice Shop!");
		
		Customer c1 = new Customer();
		c1.setName("Pinky");
		c1.setSize("S");
		System.out.println("\nHello, " + c1 +".\n");
		
		
		Clothing item1 = new Clothing();
		Clothing item2 = new Clothing();

		Clothing[] items = {item1, item2, new Clothing(), new Clothing()};
	
		item1.setDescription("Blue Jacket");
		item1.setPrice(20.9);
		item1.setSize("M");
		
		item2.setDescription("Orange T-Shirt");
		item2.setPrice(10.5);
		item2.setSize("S");

		items[2].setDescription("Green Scarf");
		items[2].setPrice(5);
		items[2].setSize("S");
		
		items[3].setDescription("Blue T-Shirt");
		items[3].setPrice(10.5);
		items[3].setSize("S");
		

		System.out.println("Items in stock:\n");
		for(Clothing item : items) {
			System.out.println(item.description + ", " + item.price + ", " + item.size + ";");
		}
		
		System.out.println("\nAre you buying:\n");
		double total = 0; 
		
		for(Clothing item : items) {
			if (item.size == c1.size) {
				System.out.println(item);
				total += item.price * (1 + tax);
				if (total > 15) {
					break;
				}
			}
			
		}
		
		System.out.println("\nTotal is $" + total);
		
		
		int measurement = 3;
		
		switch (measurement) {
			case 1, 2, 3:
				c1.size = "S";
				break;
			case 4, 5, 6:
				c1.size = "M";
				break;
			case 7, 8, 9:
				c1.size = "L";
				break;
			default:
				c1.size = "X";
		}
	}

}
