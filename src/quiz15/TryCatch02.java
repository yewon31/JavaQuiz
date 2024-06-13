package quiz15;

import java.util.Scanner;

public class TryCatch02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int rand = (int)(Math.random()*100) +1;
		int count = 0;
		
		while(true) {
			try {
				count++;
				System.out.print("1과 100 사이의 값 입력 > ");
				int input = sc.nextInt();
				if( input == rand ) {
					System.out.println("정답입니다. (시도횟수 : " + count + ")");
					break;
				} else if( input < rand ) {
					System.out.println("더 큰 수 입력");
				} else {
					System.out.println("더 작은 수 입력");
				}
			} catch (Exception e) {
				System.out.println("잘못 입력했습니다.");
				sc.nextLine();
			}
		}
		
	}
	
}
