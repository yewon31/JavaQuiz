package quiz01;

import java.util.Scanner;

//두 수 사이의 합
public class Quiz19 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt(); //정수1
		int num2 = scan.nextInt(); //정수2
		int sum = 0; //두 수 사이의 합
		int min = num1, max = num2; //min, max 초기화
		
		//num1이 num2보다 더 큰 경우 재정렬
		if(num1 > num2) { //5 > 1
			min = num2;
			max = num1;
		}
		
		//두 수 사이의 합계
		for(int i = min; i <= max; i++) { //1 ~ 5
			sum += i;
		}
		System.out.println( max==min ? 0 : sum); 
	}
}

/*

정수 2개를 입력 받습니다.

이 정수 사이의 합을 구해주세요.

예를들어
1 5가 입력되면 1 + 2 + 3 + 4 + 5 = 15 입니다
5 1가 입력되면 1 + 2 + 3 + 4 + 5 = 15 입니다

만약 같은 수라면 0이 출력 됩니다.



1
1 5
15

2
5 1
15

3
5 5
0

4
-1 -2
-3

*/