package quiz01;

import java.util.Scanner;

//updown게임
public class Quiz23 {
	
	public static void main(String[] args) {
		
		/*
			1~100까지 임의의 숫자를 하나 생성합니다. (정답 값 이라고 가정)
			
			스캐너를 통해서 값을 입력받고,
			랜덤수가 입력받은 값보다 작으면 "더 작은수를 입력하세요"
			랜덤수가 입력받은 값보다 크면 "더 큰수를 입력하세요"
			
			정답을 맞추면 시도횟수를 출력하고, 종료하면 됩니다.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		/****** 변수 선언 ******/
		int randNum = (int) (Math.random()*100)+1; //0~99 -> 1~100
		int answer;
		int tryCnt = 0;

		/******* 반복문 *******/
		while(true) {
			
			//입력 받기
			System.out.print("정답입력 > ");
			answer = scan.nextInt();
			tryCnt++;

			if(answer==randNum) { //종료
				System.out.println("정답입니다.");
				System.out.println("시도횟수 : " + tryCnt + "번");
				break;
			} else if(answer > randNum) {
				System.out.println("더 작은 수를 입력하세요.");
			} else if(answer < randNum) {
				System.out.println("더 큰 수를 입력하세요.");
			}
		}
		
	} //main
}