package quiz13;

public class DropShip extends Unit {
	static int hp = 60;
	public DropShip(int x, int y) {
		super(x, y, hp);
	}
	@Override
	void location() {
		/* 현재 위치 출력 */
		System.out.println("x : " + x + ", y : " + y);
		
	}
	@Override
	void move(int x, int y) {
		/* x, y값을 변경 */
		System.out.println("move");
		this.x = x;
		this.y = y;
	}
	

}
