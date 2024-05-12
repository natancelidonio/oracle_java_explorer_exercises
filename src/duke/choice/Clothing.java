package duke.choice;

public class Clothing {

	private String description;
	private double price;
	private String size;
	
	private final double MIN_PRICE = 10.0;
	private final double TAX = 0.2;
	
	public Clothing() {
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
		return description + ", $" + price + ", " + size + ".";
	}
	
	
}
