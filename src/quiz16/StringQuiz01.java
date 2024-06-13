package quiz16;

import java.util.Scanner;

public class StringQuiz01 {

	public static void main(String[] args) {
		/*
		 * 1. 스캐너를 통해서 공백을 포함한 id를 입력받습니다.
		 * 2. 공백을 제거한 아이디가 5글자 미만이면, 다시 입력받으세요.
		 * 3. 아이디는 소문자이어야 합니다. 
		 * 4. 아이디가 5글자 이상이면, "아이디가 등록되었습니다" 를 출력하고 프로그램을 종료.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("ID 입력 > ");
			String id = sc.nextLine();
			if(id.replaceAll(" ", "").length() < 5) { //모든 공백 제거
				System.out.println("5글자 이상 입력해주세요.");
			} else {
				if(!isAlphabet(id)) {
					System.out.println("소문자로만 입력해주세요.");
				} else {
					System.out.println("아이디 등록 완료");
					break;
				}
			}
		}//while
		
	}
	
	/*** 문자열이 영어 소문자로만 이루어졌는지 확인하는 메서드 ***/
	public static boolean isAlphabet(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!(c >= 'a' && c <= 'z')) return false;
        }
        return true;
    }
}
