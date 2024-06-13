package quiz12;

public class Circle extends Shape {

	//원형은 생성될 때 도형이름과, 반지름의 길이를 받고 초기화합니다.
	//getArea()는 원의 넓이를 계산하도록 오버라이딩 처리
	//main에서 객체를 생성해서 확인하세요
	private int radius;
	
	public Circle(String name, int radius) { //도형이름과, 반지름의 길이를 받고 초기화
		super(name);
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return radius * radius * Math.PI; //원의 넓이
	}
}