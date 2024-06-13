package quiz15;

import java.util.Scanner;

public class TryQuiz01 {

	public static void main(String[] args) {
		/*
		 * 1. 스캐너를 통해서 정수 2개를 입력받습니다.
		 * 2. 입력받은 값이 정수라면 , 단순히 정수의 합을 출력하고 반복문을 종료하세요.
		 * 		무한반복문이 돌면, 이유를 찾아서 해결해보세요.
		 * 3. 입력받은 값이 에러를 발생시키는 값이라면 "정수로만 입력하세요" 를 출력한 후에 다시 입력받습니다.
		 * 4. 반복문을 탈출하면 프로그램 정상 종료 문장을 띄워주세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.print("정수 1 > ");
				int a = sc.nextInt();
				System.out.print("정수 2 > ");
				int b = sc.nextInt();
				System.out.println("합 : " + (a+b));
				break;
			} catch (Exception e) {
				System.out.println("정수로만 입력하세요.");
				//e.printStackTrace();
				sc.nextLine(); //개행문자 제거
			}
		}

		System.out.println("프로그램 정상 종료");
		
	}
}
