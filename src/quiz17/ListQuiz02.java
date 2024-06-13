package quiz17;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ListQuiz02 {

	public static void main(String[] args) {
		
		//간단한 회원정보 관리 프로그램
		Scanner scan = new Scanner(System.in);
		
		//값을 저장할 리스트
		List<UserVO> list = new ArrayList<>();

		inputWhile:while(true) {
			try {
				System.out.println();
				System.out.println("[1.회원등록 2.회원전체보기 3.회원정보검색 4.회원정보삭제 5.프로그램종료]");
				System.out.print(" > ");
				
				int menu = scan.nextInt();
				scan.nextLine();
				switch (menu) {
					case 1:
						//스캐너로 이름, 나이를 입력받아서 User객체에 저장하고, 리스트에 하나 추가
						System.out.print("이름 > ");
						String name = scan.nextLine();
						System.out.print("나이 > ");
						int age = scan.nextInt();
						scan.nextLine();
						list.add(new UserVO(name, age));
						break;
					case 2:
						//list안에 저장된 모든 회원정보를 반복문으로 출력.
						for(UserVO u : list) {
							System.out.println("이름 : " + u.getName() + ", 나이 : " + u.getAge());
						}
						break;
					case 3:
						//찾을 이름을 입력받아서, 이름이 있다면, 이름과 나이를 출력합니다.
						//단. 찾는 이름이 없으면 " ~~~ 님은 없습니다" 를 출력합니다.
						System.out.print("이름 > ");
						String searchName = scan.nextLine();
						boolean flag = false;
						for(UserVO u : list) {
							if(u.getName().equals(searchName)) {
								System.out.println("이름 : " + u.getName() + ", 나이 : " + u.getAge());
								flag = true;
							}
						}
						if(!flag) System.out.println(searchName + "님은 없습니다.");
						break;
					case 4:
						//삭제할 이름을 입력받아서, 이름과 동일한 User객체를 삭제
						//단. 첫번째로 발견되는 User만 삭제.
						System.out.print("이름 > ");
						String delName = scan.nextLine();
						flag = false;
						for(UserVO u : list) {
							if(u.getName().equals(delName)) {
								list.remove(u);
								flag = true;
								break;
							}
						}
						if(!flag) System.out.println(delName + "님은 없습니다.");
						break;
					case 5:
						System.out.println("프로그램을 종료합니다.");
						break inputWhile;
						//System.exit(0);
						//프로그램 종료
				}
			} catch (InputMismatchException e) {
				System.out.println("다시 입력해주세요.");
				scan.nextLine(); //개행문자 제거
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
