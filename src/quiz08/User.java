package quiz08;

public class User {

	private String name;
	private int rrn;
	private int age;
	
	
	public User(String name, int rrn, int age) {
		super();
		this.name = name;
		this.rrn = rrn; //Resident Registration Number : 주민등록번호
		this.age = age;
	}


	public User() {
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getRrn() {
		return rrn;
	}


	public void setRrn(int rrn) {
		this.rrn = rrn;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}






