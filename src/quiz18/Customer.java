package quiz18;

public class Customer implements Comparable<Customer> { //비교할 대상

	private String name;
	private int number;
	
	public Customer() {
	}

	public Customer(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", number=" + number + "]";
	}

	@Override
	public int compareTo(Customer c) {
		return Integer.compare(this.number, c.getNumber()); //오름차순
	}

	
	
	
}