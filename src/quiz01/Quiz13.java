package quiz01;

import java.util.Scanner;

// 개수 세기
public class Quiz13 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int i = 1;
		int cnt = 0;

		while( i <= num ) {
			if(i%4==0 && i%8!=0) {
				cnt++;
			}
			i++;
		}
		System.out.println(cnt);
	}
}

/*
 * 
 * 
 * 어떤수 N까지 정수 중의 4의 배수이면서 8의 배수가 아닌 수의 개수를 출력해주세요
 */
