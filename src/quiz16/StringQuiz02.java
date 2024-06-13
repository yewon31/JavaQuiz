package quiz16;

import java.util.Scanner;

public class StringQuiz02 {

	public static void main(String[] args) {
		/* 주민번호 검증메서드 masking(String) : String
		 * 마스킹 메서드는 주민번호값이 매개변수로 들어올 때
		 * 950101-*******로 마스킹 처리하여 리턴하는 static메서드를 만들어주세요.
		 * 
		 * 1. 문제의 간소화를 위해 생년월일은 정상범위라고 가정합니다.
		 * 2. 13자리가 아니거나, 남,여 가 아니라면 throws처리합니다.
		 * 3. 주민번호는 - 를 포함해서 받을 수 있습니다.
		 * 4. 남, 여에 대한 정보를 출력해줍니다.
		 *  
		 * masking메서드를 만들어주세요 
		 * 검증데이터 950101-1000000 -> 남자 950101-*******
		 * 검증데이터 950101-2000000 -> 여자 950101-*******
		 * 검증데이터 9501012000000 -> 여자 950101-*******
		 * 검증데이터 950101-5000000 -> 예외
		 * 검증데이터 9501015000000 -> 예외
		 * 검증데이터 950101511111 -> 예외
		 */
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("주민번호 입력 > ");
			String rrn = sc.nextLine();
			try {
				System.out.println(masking(rrn));
				break;
			} catch (Exception e) {
				System.out.println("예외");
				//System.out.println(e.getMessage());
				//e.printStackTrace();
			}
		}//while
		
	}
	
	static String masking(String str) throws Exception { //주민번호
		
		/*** 13자리 체크 ***/
		str = str.replaceAll("-", "");
		if(str.length()!=13) {
			throw new Exception("13자리를 입력해주세요.");
		}
		
		/*** 성별 체크 ***/
		char gender = str.charAt(6); //성별
		String genderName;
		if(gender=='1' || gender=='3') {
			genderName = "남자";
		} else if(gender=='2' || gender=='4') {
			genderName = "여자";
		} else {
			throw new Exception("뒷자리의 첫 숫자는 1~4이어야 합니다.");
		}
		
		/*** 마스킹 처리 ***/
		String birth = str.substring(0, 6);
		String result = genderName + " " + birth + "-*******"; //950101-*******
		
		return result;
	}
}
