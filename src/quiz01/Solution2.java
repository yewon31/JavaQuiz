package quiz01;

import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //사과의 개수를 입력 받아서, 사과의 개수 * 10 을 출력하세요.
        
        int appleCnt = scan.nextInt();
        System.out.println(appleCnt*10);

        scan.close();
    }
}
