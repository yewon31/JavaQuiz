package quiz01;

import java.util.Scanner;

public class Quiz08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		if(num==0) {
			System.out.println("제로");
		} else if(num<0) {
			System.out.println("음수");
		} else if(num%2!=0) {
			System.out.println("홀수");
		} else {
			System.out.println("짝수");
		}
	}
}

/*
숙제내용
어떤 정수를 입력받아

홀수라면 홀수
짝수라면 짝수
0이라면 제로
음수라면 음수

를 출력하는 프로그램 코드를 작성해주세요

숙제힌트
조건의 순서를 잘 생각해주세요
*/