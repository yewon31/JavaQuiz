package quiz21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz03 {

	static Map<String, String> patternMap = new LinkedHashMap<>();

	public static void main(String[] args) {

		/*
		 * 1. Buffered사용해서 건담.txt를 읽어 들입니다. 2. 정규표현식을 사용해서 일련번호, 지점(건담베이스 강남점) 등급[등급],
		 * 상세내용, 가격으로 나누어서 출력. 힌트) 상세내용 정규표현식으로 찾기가 불가능하므로, 시작지점, 끝지점을 사용해서 문자열 자르기
		 */

		String path = "C:\\Users\\user\\Desktop\\course\\java\\workspace\\JavaQuiz\\src\\quiz21\\건담.txt";
		BufferedReader br = null;

		patternMap.put("일련번호", "\\d{8}-\\d{2}-\\d{12,13}");
		patternMap.put("지점", "건담[가-힣]* [가-힣]+");		
		patternMap.put("등급", "(?<=\\[)([^ ]+)(?=\\])"); //[A-Z가-힣]
		patternMap.put("가격", "\\d*,?\\d+원");

		try {
			br = new BufferedReader(new FileReader(path));
			String str;
			int idx = 1;
			while ((str = br.readLine()) != null) { // 더이상 읽을게 없으면 null

				/****** 원본 출력 ******/
				System.out.println();
				System.out.println("원본 " + (idx++) + " : " + str);

				/****** 일련번호, 지점, 등급, 가격 출력 ******/
				printMatch(str, "일련번호");
				printMatch(str, "지점");
				printMatch(str, "등급");
				printMatch(str, "가격");

				/****** 상세내용 출력 ******/
				int start = getMatchIndex(str, patternMap.get("등급"), "end") + 2;
				int end = getMatchIndex(str, patternMap.get("가격"), "start") - 1;
				System.out.println("상세내용 : " + str.substring(start, end));

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (Exception e2) {
			}
		}

	}

	static void printMatch(String text, String name) {
		Matcher match = Pattern.compile(patternMap.get(name)).matcher(text);
		if (match.find())
			System.out.println(name + " : " + match.group());
	}

	static int getMatchIndex(String text, String pattern, String type) {
		Matcher match = Pattern.compile(pattern).matcher(text);
		if (match.find())
			return type.equals("start") ? match.start() : match.end();
		return -1;
	}
}
