package quiz01;

import java.util.Scanner;

//느린 소수의 합(기초)
//continue 사용한 코드로 수정
public class Quiz21 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		/*   변수 세팅   */
		int x = scan.nextInt();
		int totalSum = 0;
		
		
		/*   x까지의 수 중 소수들의 합   */
		start:for(int i=2; i<=x; i++) { //2~x

			/*   i가 소수인지 판별하여 누적   */
			for(int j=2; j<i; j++) { //2~i 
				if(i%j==0) { //1과 자기자신을 제외한 약수가 하나라도 있으면 소수x
					continue start;
				}
			}
			totalSum += i; //i가 소수라면 누적
		}
		
		/*   출력   */
		System.out.println(totalSum);
		
		
	} //main
}


/*
 * 

숙제내용
어떤 수 x가 주어질 때 x까지의 수 중 소수들의 합을 출력해주세요.

소수?
소수는 약수가 1과 자기자신인 수 입니다.

예시
5 까지의 소수합은 2 + 3 + 5 = 10 입니다
6 까지의 소수합은 2 + 3 + 5 = 10 입니다
7 까지의 소수합은 2 + 3 + 5 + 7 = 17 입니다


숙제힌트
중첩반복을 사용해야 하는문제.
어떤 값이 소수인지 확인해서 더한다.



입출력 예시
No
입력값
결과값
1
5
10




2
6
10

3
7
17

4
8
17

*/