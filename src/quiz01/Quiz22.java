package quiz01;

import java.util.Scanner;

//덧셈문제
public class Quiz22 {
	
	public static void main(String[] args) {
		
		/*
		 *  프로그램이 실행되면, 랜덤한 덧셈 문제를
			이 랜덤한 수의 범위는 1~100 사이의 값
			사용자가 답안을 입력할 때마다. 정답 또는 오답 카운트가 누적됩니다.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		/****** 변수 선언 ******/
		int randomNumber1, randomNumber2, answer;
		int correctCnt = 0, wrongCnt = 0;

		/******* 반복문 *******/
		while(true) {
			
			//값 세팅
			randomNumber1 = (int) (Math.random()*100)+1; //0~99 -> 1~100
			randomNumber2 = (int) (Math.random()*100)+1;
			
			//입력 받기
			System.out.println("-------------------");
			System.out.println(randomNumber1 + " + " + randomNumber2 + " = ? ");
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");
			System.out.print("> ");
			answer = scan.nextInt();

			if(answer==0) { //종료
				System.out.println("프로그램 정상 종료");
				System.out.println("정답 : " + correctCnt + "개");
				System.out.println("오답 : " + wrongCnt + "개");
				break;
			} else if(answer == randomNumber1 + randomNumber2) { //정답
				System.out.println("정답입니다.");
				correctCnt++;
			} else { //오답
				System.out.println("오답입니다.");
				wrongCnt++;
			}
		}
		
	} //main
}