package quiz15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionQuiz01 {

	public static void main(String[] args) {
	
		/*
		 * 1. main에서 scanner를 사용해서 2개의 정수값을 입력받음
		 * 2. divide(a, b) 를 입력받는 메서드에 전달을 해주세요.
		 * 3. divide메서드에서는 a / b를 진행하는데, b가 0인 경우 예외를 강제 생성해서 종료하는 구문을 작성 해보세요.
		 * 4. main에서 입력받을 때는, 문자인경우 예외처리를 진행하고, 다시 입력받으세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.println();
				System.out.print("정수 a 입력 > ");
				int a = sc.nextInt();
				System.out.print("정수 b 입력 > ");
				int b = sc.nextInt();
				
				System.out.println("a/b 결과 : " + divide(a, b));
				break;
			} catch (InputMismatchException e) {
				System.out.println("정수로만 입력하세요.");
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				sc.nextLine(); //개행문자 제거
			}
		}
	}
	
	static double divide(double a, double b) throws Exception {
		if(b == 0) throw new ArithmeticException("0으로 나눌 수 없음");
		return a/b;
	}
}
