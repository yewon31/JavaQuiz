package quiz06;

public class MainClass {
	
	public static void main(String[] args) {
		
		Car car = new Car("티코");
		Car car2 = new Car("벤틀리", 10);
		
		car.run();
		System.out.println("-----------------");
		car2.run();
	}
}
