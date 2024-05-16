package duke.choice;

public class Clothing implements Comparable<Clothing>{

	private String description;
	private double price;
	private String size;
	
	public final static double MIN_PRICE = 10.0;
	public final static double TAX = 0.2;
	
	public Clothing() {
	}
	
	public Clothing(String description, double price, String size) {
		this.description = description;
		this.price = price;
		this.size = size;
	}



	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price * (1 + TAX);
	}

	public void setPrice(double price) {
		this.price = (price > MIN_PRICE) ? price : MIN_PRICE;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return getDescription() + ", $" + getPrice() + ", " + getSize() + ".";
	}
	
	@Override
	public int compareTo (Clothing c) {
		return this.description.compareTo(c.description);
	}
	
}
