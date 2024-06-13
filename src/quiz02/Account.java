package quiz02;

public class Account {
	
	//멤버변수는 각 데이터 타입의 기본 값으로 자동 초기화
	String name;
	String password;
	int balance;
	
	/*************** 생성자 ***************/
	Account() {
	}
	
	Account(String pName, String pPassword, int pBalance) {
		name = pName;
		password = pPassword;
		balance = pBalance;
	}

	/*************** 메서드 ***************/
	void deposit(int money) { //입금
		balance += money;
	}
	void withDraw(int money) { //출금
		balance -= money;
	}
	int getBalance() { //잔액 조회
		return balance;
	}

}
