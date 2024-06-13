package quiz01;

//for문 사용 4문제
public class Quiz18 {
	
	public static void main(String[] args) {

		//1. 7~100까지 7의 배수 출력
		System.out.print("1) 7의 배수 : ");
		for(int i = 7; i <= 100; i+=7) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("--------------------------");
		

		//2. 1~100까지 정수 중에서 9의 배수의 개수를 출력
		int cnt=0;
		for(int i = 1; i <= 100; i++) {
			if(i%9==0) cnt++;
		}
		System.out.println("2) 100까지 9배수의 개수 : " + cnt);
		System.out.println("--------------------------");
		

		//3. 50~100까지 두 수 사이의 합계 출력
		int sum=0;
		for(int i = 50; i <= 100; i++) {
			sum += i;
		}
		System.out.println("3) 50~100까지 두 수 사이의 합계 : " + sum);
		System.out.println("--------------------------");
		

		//4. A~Z 문자열의 합 출력 ABCDEF .... Z
		String str="";
		for(char i = 'A'; i <= 'Z'; i++) { //char형도 반복 가능
			str += i;
		}
		System.out.println("4) A~Z 문자열의 합 : " + str);
		
	}
}