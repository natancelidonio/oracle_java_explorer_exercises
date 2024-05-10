package duke.choice;

public class Clothing {

	public String description;
	public double price;
	public String size;
	
	public Clothing() {
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
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
