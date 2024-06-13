package quiz01;

public class Quiz03 {

	public static void main(String[] args) {
		
		/*
		 * Q.
		 * 사과의 개수가 정해질 때, 3항 연산식을 이용해서 필요한 바구니의 개수를 구하세요.
		 */
		
		int bucket = 10; //바구니의 크기
		int apple = (int)(Math.random() * 150) + 1; //1~150 //사과의 개수
		int result = apple/bucket + (apple%bucket==0 ? 0 : 1); //나머지가 딱 떨어짐 or 안 떨어짐
		
		System.out.println("바구니는 사과 [" + bucket + "개]를 담을 수 있습니다.");
		System.out.println("사과는 [" + apple + "개] 있습니다.");
		System.out.println("필요한 바구니의 개수는 [" + result +"개]입니다.");
	}
}
