package quiz01;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		
		/*
		 * Q.
		 * 스캐너를 활용해서 이름과 나이 입력받기
		 * 20세 이상이면 성인입니다
		 * 19세 이하라면 미성년자입니다
		 * 를 출력
		 */
		
        Scanner scan = new Scanner(System.in);
		
        //이름과 나이 입력받기
		System.out.print("이름 > ");
		String name = scan.next();
		System.out.print("나이 > ");
		int age = scan.nextInt();
		
		//메시지 출력하기
		String msg = age>=20 ? "성인입니다." : "미성년자입니다.";
		System.out.println("---------------------");
		System.out.println(name + "님은 " + msg);
		
		scan.close();
	}
}
