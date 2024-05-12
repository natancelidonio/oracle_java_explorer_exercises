package duke.choice;

public class Customer {

	private String name;
	private String size;
	
	public Customer() {
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}


	@Override
	public String toString() {
		return name;
	}
	
	
}
