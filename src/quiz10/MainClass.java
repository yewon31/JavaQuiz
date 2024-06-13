package quiz10;

public class MainClass {

	public static void main(String[] args) {
		
		/*** 상품 ***/
		Product c1 = new Computer(); //600원
		Product r1 = new Radio(); //500원
		Product t1 = new Tv(); //400원
		/*** 장바구니 ***/
		MyCart cart = new MyCart(1500); //money
		
		/*** buy() 호출 > add() ***/
		cart.buy(c1);
		cart.buy(r1);
		cart.buy(t1);
		
		/*** info() 호출 ***/
		cart.info();
		

		System.out.println("");
		System.out.println("=============");
		System.out.println("");

		Product t2 = new Tv();
		cart.buy(t2);
		cart.info();
	}
}
