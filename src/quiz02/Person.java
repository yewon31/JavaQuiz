package quiz02;

public class Person {
	
	//멤버변수는 각 데이터 타입의 기본 값으로 자동 초기화
	String name;
	int age;
	int tall;
	
	/*************** 생성자 ***************/
	Person() {
	}
	
	Person(String pName, int pAge, int pTall) {
		name = pName;
		age = pAge;
		tall = pTall;
	}

	/*************** 메서드 ***************/
	void info() {
		System.out.println(name);
		System.out.println(age + "세");
		System.out.println("키 : " + tall);
	}

}
