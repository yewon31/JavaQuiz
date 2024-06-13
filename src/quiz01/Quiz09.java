package quiz01;

import java.util.Scanner;

public class Quiz09 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String menu = scan.next();

		switch( menu ) {
		case "수박":
			System.out.println("4만원");
			break;
		case "사과":
			System.out.println("3만원");
			break;
		case "멜론":
			System.out.println("5만원");
			break;
		case "귤":
			System.out.println("6만원");
			break;
		default :
			System.out.println("없는메뉴");
		}
	}
}

/*
길동이네 가게가 가게를 오픈 했습니다.

구입할 수 있는 메뉴는 [수박, 사과, 멜론, 귤] 입니다.

메뉴의 가격은 다음과 같습니다.
수박 = 3만원
사과 = 4만원
멜론 = 5만원
귤 = 6만원
없는 메뉴라면 "메뉴없음" 을 출력해 주세요

메뉴를 입력하면 해당 알맞은 가격을 출력하는 문장을 작성해주세요.
단 switch 문으로 작성해주세요
*/
