package quiz05;

import java.util.Scanner;

public class MyAccount extends Account {
	
	/*************** 생성자 ***************/
	MyAccount() {
	}
	
	MyAccount(String pName, String pPassword, int pBalance) {
		name = pName;
		password = pPassword;
		balance = pBalance;
	}

	/*************** 메서드 오버라이딩 ***************/
	void deposit(int money) { //입금
		balance += money;
		System.out.println(name + "님의 계좌에 " + money + "원이 입금되었습니다.");
	}
	
	void withDraw(int money) { //출금
		//사용자의 입력(Scanner)를 통해 비밀번호가 일치하면 금액 감소
		//또한 balance보다 큰 금액을 출금하려는 경우에는 "잔액부족" 을 출력
		Scanner scan = new Scanner(System.in);
		System.out.print("출금 비밀번호 입력 > ");
		String inputPw = scan.next();
		/*** 비밀번호 비교 ***/
		if(inputPw.equals(password)) {
			if(balance<money) {
				System.out.println("잔액 부족");
				return;
			}
			balance -= money;
			System.out.println(name + "님의 계좌에 " + money + "원이 출금되었습니다.");
		} else {
			System.out.println("비밀번호 불일치");
		}
	}
	
}
