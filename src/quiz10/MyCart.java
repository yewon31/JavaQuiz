package quiz10;

import java.util.Arrays;

public class MyCart {
	
	//1. 모든 변수와 메서드에 접근제한자를 선언하세요.
	public int money;
	public Product[] cart = new Product[1]; //상품을 저장할 배열
	public int i = 0;
	
	
	//2. MyCart의 생성자는 money만 받아서 초기화
	public MyCart(int money) {
		this.money = money;
	}
	
	
	/* 
	 * 3. buy(모든 상품을 받도록 선언)
	 * 접근제어자 퍼블릭
	 * 
	 * 가진돈과 전달된 물건의 가격을 비교해서 돈이 적으면 "금액부족" 출력후 종료
	 * 가진돈이 충분하면 물건의 가격을 money에 빼고
	 * add(상품)을 호출해 줍니다.
     */
	public void buy(Product p) {
		System.out.println("buy(" + p.name + ")");
		if(this.money < p.price) { //돈이 적으면
			System.out.println("금액부족");
			return;
		} else { //가진돈이 충분하면
			this.money -= p.price;
			this.add(p);
		}
	}
	
	
	/* 
	 * 4. add(모든 상품을 받도록 선언)
	 * 접근제어자 프라이빗
	 *
	 * 만약 i의 값이 장바구니의 크기보다 같거나 크다면
	 * 기존의 장바구니보다 크기가 * 2큰 배열을 생성. (1)
	 * 기존의 장바구니 값을 새로운 배열에 복사. (2)
	 * 새로운 장바구니를 기존의 장바구니와 바꾼다. (3)
	 * 
	 * 상품을 장바구니에 담는다.
	 * 
	 */
	private void add(Product p) {
		System.out.println("add(" + p.name + ")");
		System.out.println("-------------");
		if(this.i >= this.cart.length) { //i의 값이 장바구니의 크기보다 같거나 크다면
			//기존의 장바구니보다 크기가 * 2큰 배열을 생성 + 복사 + 교체
			this.cart = Arrays.copyOf(this.cart, this.cart.length*2); 
		}
		cart[this.i++] = p;
	}

	
	/*
	 * 5.info()
	 * 
	 * instanceof 를 적용해보면 좋을것 같아요
	 *
	 * 장바구니 안에 담긴 물건의 목록(name)을 출력한다.
	 * 장바구니 안에 담긴 물건의 가격을 모두 더해서 출력
	 * 남은금액 출력
	 * 메인에서 buy메서드 실행 
	 * 
	 */
	public void info() {
		System.out.println("");
		System.out.println("<<장바구니 목록>>");
		int totalPrice = 0;
		for(Product p : cart) { //this.i까지
			if(p==null) break;
			if(p instanceof Computer) {
				System.out.println("컴퓨터");
			} else if(p instanceof Radio) {
				System.out.println("라디오");
			} else if(p instanceof Tv) {
				System.out.println("티비");
			}
			totalPrice += p.price;
		}
		System.out.println("");
		System.out.println("총 금액 : " + totalPrice);
		System.out.println("남은 금액 : " + this.money);
	}
}
