package quiz21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz02 {

	public static void main(String[] args) {
		
		String str = "123123-45644 GS25(치킨도시락) 4,400원";
		String str2 = "123123-3453454 GS25(마늘햄쌈) 5,000원";
		String str3 = "123456-3453 GS(갓혜자도시락) 6,000";
		
		String[] arr = {str, str2, str3};
		
		//arr 상품번호, GS25, (상품명), 가격 을 정규표현식으로 나눠서 출력.
		for (String text : arr) {
			System.out.println();
			func(text, "\\d{6}-\\d{4,7}");
			func(text, "GS(25)?");
			func2(text, "\\(([^ ]+)\\)", 1);
			func(text, "[0-9]+,[0-9]+[원]?");
		}
	}
	
	static void func(String text, String pattern) {
		Matcher match = Pattern.compile(pattern).matcher(text);
		if(match.find()) System.out.println(match.group());
	}
	
	static void func2(String text, String pattern, int group) {
		Matcher match = Pattern.compile(pattern).matcher(text);
		if(match.find()) System.out.println(match.group(group));
	}
}
