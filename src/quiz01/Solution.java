package quiz01;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //정수 1개를 입력 받아서 짝수라면 숫자 1을 출력, 홀수라면 숫자 0을 출력하는 프로그램 코드를 작성하세요.
        
        int num = scan.nextInt();
        int result = num%2==0 ? 1 : 0;
        System.out.println(result);

        scan.close();
    }
}
