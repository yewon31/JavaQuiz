package quiz01;

import java.util.Scanner;

public class Quiz12 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력 > ");
		int num = scan.nextInt();
		int i = 1; //제어변수 - 반복문 횟수를 제어할 변수

		System.out.println("-------------");
		System.out.println("[ 구구단 " + num + "단 ]");
		while( i <= 9 ) {
			System.out.println(num + " x " + i + " = " + num*i);
			i++;
		}
	}
}

/*
 * 어떤수 n을 입력받아서 n까지의 구구단 모형 출력
 */
