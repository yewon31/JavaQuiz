package quiz17;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringToken01 {

	public static void main(String[] args) {
		
		/*
		 * 1. 스캐너를 통해서 nextLine() 문장을 받습니다. - 안녕 하세요 오늘은 날씨가 좋네요
		 * 2. 입력된 문자열을 토크나이저를 이용해서 공백기준으로 분리
		 * 3. 분리한 토큰의 개수를 출력
		 * 4. 분리된 토큰을 콘솔에 숫자를 붙여서 세로로 출력
		 *    1. 안녕
		 *    2. 하세요.
		 *    3. 오늘은 
		 *    4. 날씨가 
		 *    5. 좋네요 .
		 * 5. 분리된 문자열을 배열에 저장
		 */

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(str);
		int cnt = st.countTokens();
		System.out.println("잘린 문자의 개수:" + cnt);
		System.out.println();
		String[] arr = new String[cnt];
		
		for(int i=0; st.hasMoreTokens(); i++) {
			String word = st.nextToken();
			System.out.println((i+1) + ". " + word);
			arr[i] = word;
		}

		System.out.println();
		System.out.println(Arrays.toString(arr));
	}
}
