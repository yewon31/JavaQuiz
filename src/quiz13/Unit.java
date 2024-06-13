package quiz13;

public abstract class Unit {
	
	/*** 변수 ***/
	int x=0;
	int y=0;
	int hp = 0;
	
	/*** 생성자 ***/	
	public Unit(int x, int y, int hp) {
		super();
		this.x = x;
		this.y = y;
		this.hp = hp;
	}

	/*** 메서드 ***/
	abstract void location();
	abstract void move(int x, int y);
	
	void stop() {
		/* 현재 위치에 정지 */	
		System.out.println("정지");
	}
}