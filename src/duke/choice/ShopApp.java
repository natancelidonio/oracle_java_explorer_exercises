package duke.choice;

public class ShopApp {

	public static void main(String[] args) {

		
		System.out.println("Welcome to Duke Choice Shop!");
		
		Customer c1 = new Customer("Pinky", 3);
				
		System.out.println("\nHello, " + c1.getName() +".\n");
		
		Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
		Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");

		Clothing[] items = {item1, item2, new Clothing("Green Scarf", 5.0, "S"), new Clothing("Blue T-Shirt", 10.5, "S")};
		
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
