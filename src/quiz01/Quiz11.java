package quiz01;

import java.util.Scanner;

public class Quiz11 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int min = 0;
		int mid = 0;
		int max = 0;
		
		if(a>b) {
			if(a>c) {
				max = a;
				if(b>c) {
					mid = b;
					min = c;
				} else {
					mid = c;
					min = b;
				}
			} else {
				max = c;
				mid = a;
				min = b;
			}
		} else {
			if(b>c) {
				max = b;
				if(a>c) {
					mid = a;
					min = c;
				} else {
					mid = c;
					min = a;
				}
			} else {
				max = c;
				mid = b;
				min = a;
			}
		}
		
		//2번째 방법
		/*
		if(a>b && a>c) {
			max = a;
			if(b>c) {
				mid = b;
				min = c;
			} else {
				mid = c;
				min = b;
			}
		} else if(b>a && b>c) {
			max = b;
			if(a>c) {
				mid = a;
				min = c;
			} else {
				mid = c;
				min = a;
			}
		} else {
			max = c;
			if(a>b) {
				mid = a;
				min = b;
			} else {
				mid = b;
				min = a;
			}
		}
		*/
		
		System.out.println(max + " " + mid + " " + min);		
	}
}

/*
정수를 3개를 입력 받습니다.

입력 순서에 상관없이

큰값 중간값 작은값 의 형태로 출력해주세요.

(같은수의 입력은 없다고 가정합니다)
숙제힌트
조건을 잘 생각해야 하는 문제
*/
