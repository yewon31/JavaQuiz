package quiz17;

import java.util.ArrayList;
import java.util.List;

public class ListQuiz01 {

	public static void main(String[] args) {
		
		/*
		 * 1. 숫자를 저장하는 리스트를 만들고, 1~20까지 값을 순서대로 저장
			2. UserVO를 저장할 수 있는 리스트를 만들고, User 객체 3개 저장
			3. 2번에 저장된 list 안에, 이름과 나이를 반복문으로 전부 출력
			4. 2번에 저장된 list안에, "홍길동" 이 있다면, 홍길동 객체의 이름과 나이를 출력
			5. 2번에 저장된 list안에, "홍길동" 이 있다면, 홍길동 객체를 삭제.
		 */

		//1. 숫자를 저장하는 리스트를 만들고, 1~20까지 값을 순서대로 저장
		List<Integer> numList = new ArrayList<>();
		for(int i=1; i<21; i++) numList.add(i);

		//2. UserVO를 저장할 수 있는 리스트를 만들고, User 객체 3개 저장
		List<UserVO> uvoList = new ArrayList<>();
		uvoList.add(new UserVO("홍길동", 10));
		uvoList.add(new UserVO("이순신", 20));
		uvoList.add(new UserVO("홍길자", 30));
		
		//3. 2번에 저장된 list 안에, 이름과 나이를 반복문으로 전부 출력
		for(UserVO u : uvoList) {
			System.out.println("이름 : " + u.getName() + ", 나이 : " + u.getAge());
		}
		System.out.println();
		
		//4. 2번에 저장된 list안에, "홍길동" 이 있다면, 홍길동 객체의 이름과 나이를 출력
		//5. 2번에 저장된 list안에, "홍길동" 이 있다면, 홍길동 객체를 삭제.
		for(UserVO u : uvoList) {
			if(u.getName().equals("홍길동")) {
				//출력
				System.out.println("이름 : " + u.getName() + ", 나이 : " + u.getAge());
				//삭제
				uvoList.remove(u);
				break; //향상된 for문은 remove() 시 전체 순회 불가
			}
		}
		
	}
}
