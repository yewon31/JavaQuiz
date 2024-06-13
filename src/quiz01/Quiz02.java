package quiz01;

public class Quiz02 {

	public static void main(String[] args) {
		
		/*
		 * Q.
		 * 0~10 범위의 랜덤한 정수를 생성하고, 5에서 빼주면 범위는 -5~5가 됩니다.
		 * 이 값을 가지고, 3항 연산식을 이용해서 절대값(언제나 양수값)을 출력하시오. 
		 */
		
		int num = (int)(Math.random()*11)-5;
		int result = num>0 ? num : -num; //양수면 그대로 출력, 음수면 양수 만들어주기
		
		System.out.println("난수(-5~5) \t: " + num);
		System.out.println("절대값 \t\t: " + result);
	}
}
