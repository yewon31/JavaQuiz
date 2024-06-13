package quiz13;

public class MainClass {

	public static void main(String[] args) {
		
		Unit m = new Marine(10, 10);
		m.location();
		m.move(20, 30);
		m.location();
		
		Unit t = new Tank(10, 10);
		t.location();
		t.move(20, 30);
		t.location();
		
		Unit d = new DropShip(10, 10);
		d.location();
		d.move(20, 30);
		d.location();
	}
}
