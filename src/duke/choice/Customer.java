package duke.choice;

public class Customer {

	public String name;
	
	public Customer() {
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return name;
	}
	
	
}
