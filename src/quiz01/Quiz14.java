package quiz01;

import java.util.Scanner;

// 배수 출력하기
public class Quiz14 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//(3) 증감식 이용
		int x = scan.nextInt(); //반복횟수 10까지의
		int n = scan.nextInt(); //배수  5의 배수
		int i = n; //5

		while( i <= x ) {
			System.out.print(i + " ");
			i += n;
		}
	}
}

/*
 * 
 * 
 * 어떤 수 x까지의 수 중에서 n의 배수를 찾아보려고 한다.

첫째 줄의 x와 n을 입력 받아 n의 배수를 가로로 출력하세요.

10 3
3 6 9


//(2)공백 처리 버전
int x = scan.nextInt();
		int n = scan.nextInt();
		int i = 1;
		int cnt = 0;

		while( i <= x ) {
			if(i%n==0) {
				if(cnt!=0) {
					System.out.print(" ");
				}
				System.out.print(i);
				cnt++;
			}
			i++;
		}
		
		
//(1)기본 버전
int x = scan.nextInt();
		int n = scan.nextInt();
		int i = 1;

		while( i <= x ) {
			if(i%n==0) {
				System.out.print(i + " ");
			}
			i++;
		}
		
 */
