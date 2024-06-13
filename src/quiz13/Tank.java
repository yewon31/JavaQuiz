package quiz13;

public class Tank extends Unit {
	
	public boolean modeFlag = false;
	
	static int hp = 100;
	public Tank(int x, int y) {
		super(x, y, hp);
	}

	void changeMode () {
		modeFlag = modeFlag ? false : true;
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
