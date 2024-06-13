package quiz01;

import java.util.Scanner;

//문자열 합(반복문)
public class Quiz16 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int cnt = scan.nextInt(); //반복횟수 //5
		String str = scan.next(); //가
		String resultStr = "";
		int i = 1;

		while( i <= cnt ) {
			resultStr += str; //문자열도 숫자처럼 더할 수 있음
			i++;
		}
		System.out.println(resultStr);
	}
}

/*
 * 
 * 
 * 첫째 줄에 반복 횟수, 둘째 줄에 반복할 문자열이 주어집니다.

반복횟수 만큼 문자열을 붙여서 출력해 주세요.


5 가
가가가가가


3 나
나나나


5 0
00000

 * 
 * 
 * 
 */
