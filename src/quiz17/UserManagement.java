package quiz17;

import java.util.ArrayList;
import java.util.List;

public class UserManagement implements IUserManagement {

	/****** 멤버변수 ******/
	private List<UserVO> list = new ArrayList<>();
	
	/****** 회원정보 추가 ******/
	public void insert(String name, int age) {
		list.add(new UserVO(name, age));
	}
	
	/****** 회원정보 출력 ******/
	public void printList() {
		for(UserVO u : list) {
			System.out.println("이름 : " + u.getName() + ", 나이 : " + u.getAge());
		}
	}
	
	/****** 회원정보 검색 ******/
	public boolean search(String name) {
		boolean flag = false;
		for(UserVO u : list) {
			if(u.getName().equals(name)) {
				System.out.println("이름 : " + u.getName() + ", 나이 : " + u.getAge());
				flag = true;
			}
		}
		return flag;
	}
	
	/****** 회원정보 삭제 ******/
	public boolean delete(String name) {
		boolean flag = false;
		for(UserVO u : list) {
			if(u.getName().equals(name)) {
				list.remove(u);
				flag = true;
				break;
			}
		}
		return flag;
	}
}
