package quiz01;

import java.util.Arrays;
import java.util.Scanner;

//배열 값 수정
public class Quiz28 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		/*
		사용자에게 수정하고 싶은 이름을 입력받아서,
		해당 이름이 존재하면, 수정할 이름을 새롭게 입력받습니다.

		만약에 값이 없으면 "이름은 존재하지 않습니다" 를 출력합니다.

		문자열의 비교
		문자열. equals(비교할문자열)
		*/
		
		String[] arr = {"강타", "문희준", "토니안", "이재원", "장우혁" };
		System.out.print("수정할 이름 입력 > ");
		String targetName = scan.next();
		int targetIndex = -1;

		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals(targetName)) {
				targetIndex = i;
				break;
			}
		}
		
		if(targetIndex<0) {
			System.out.println("존재하지 않는 이름입니다.");
		} else {
			System.out.print("'" + targetName + "'을 변경할 이름 입력 > ");
			String changeName = scan.next();
			
			arr[targetIndex] = changeName;
			System.out.println(Arrays.toString(arr));
		}
	}

}
