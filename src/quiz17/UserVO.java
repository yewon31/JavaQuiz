package quiz17;

public class UserVO { //User Value Object

	//회원정보를 담기위한 클래스 -> 은닉, getter, setter
	private String name;
	private int age;

	public UserVO() {
		super();
	}

	public UserVO(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this. name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
