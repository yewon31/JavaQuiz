package quiz01;

import java.util.Scanner;

// 약수의 합
public class Quiz15 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt(); //반복횟수
		int i = 1;
		int sum = 0; //약수의 합계

		while( i <= n ) { //10까지
			if(n%i==0) { //10%5==0 -> 5는 10d의 약수
				sum += i; 
			}
			i++;
		}
		System.out.println(sum);	
	}
}

/*
 * 
 * 
 * 어떤 수 N 까지의 약수의 합계를 구하세요

1까지 약수의 합은 1 입니다
10까지 약수의 합은 1 + 2 + 5 + 10 = 18 입니다

5
6

1
1

 * 
 * 
 * 
 */
