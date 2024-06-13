package quiz12;

public class MainClass {

	public static void main(String[] args) {
		
		Shape c = new Circle("원형", 5); //다형성
		System.out.println( c.getName() );
		System.out.println( c.getArea() );
		System.out.println( "------------------" );

		Shape r = new Rect("사각형", 5); //다형성
		System.out.println( r.getName() );
		System.out.println( r.getArea() );
	}
}
