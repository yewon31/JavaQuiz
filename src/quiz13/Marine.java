package quiz13;

public class Marine extends Unit {
	
	public static int attack = 6;
	public static int armor = 0;
	
	static int hp = 60;
	public Marine(int x, int y) {
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
