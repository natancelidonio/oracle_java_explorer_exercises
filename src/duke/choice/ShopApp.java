package duke.choice;

public class ShopApp {

	public static void main(String[] args) {

		
		System.out.println("Welcome to Duke Choice Shop!");
		
		Customer c1 = new Customer("Pinky", 3);
				
		System.out.println("\nHello, " + c1.getName() +".\n");
		
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
		
		c1.addItems(items);

		System.out.println("Items in stock:\n");
		for(Clothing item : items) {
			System.out.println(item.getDescription() + ", " + item.getPrice() + ", " + item.getSize() + ";");
		}
		
		System.out.println("\nAre you buying:\n");

		for(Clothing item : items) {
			if (item.getSize() == c1.getSize()) {System.out.println(item);}
		}
		
		System.out.println("\nTotal is $" + c1.getTotalClothingCost());
		
	}

}
