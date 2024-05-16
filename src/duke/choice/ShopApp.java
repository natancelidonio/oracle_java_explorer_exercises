package duke.choice;

public class ShopApp {

	public static void main(String[] args) {

		
		System.out.println("Welcome to Duke Choice Shop!");
		
		Customer c1 = new Customer("Pinky", 3);
				
		System.out.println("\nHello, " + c1.getName() +".\n");

		System.out.println("Minimum price is $" + Clothing.MIN_PRICE + ";\n");
		
		Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
		Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");

		Clothing[] items = {item1, item2, new Clothing("Green Scarf", 5.0, "S"), new Clothing("Blue T-Shirt", 10.5, "S")};
		
		c1.addItems(items);

		System.out.println("Items in stock:\n");
		for(Clothing item : items) {
			//System.out.println(item.getDescription() + ", " + item.getPrice() + ", " + item.getSize() + ";");
			System.out.println(item.toString());
		}
		
		
		System.out.println("\nTotal is $" + c1.getTotalClothingCost() + ".\n");
		
		
		int sum = 0;
		int count = 0;
		for(Clothing item : c1.getItems()) {
			if (item.getSize() == "L") {
				count++;
				sum += item.getPrice();
			}		
		}
		int average = 0;
		try {
			average = (count == 0) ? 0 : sum / count;
			System.out.println("\nAverage price for all items owned by " + c1.getName() + " is: $" + average);
		} catch (ArithmeticException e) {
			System.out.println("Don't divide by 0");
		}
	}

}
