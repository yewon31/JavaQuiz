package quiz04;

public class Calculator { //부모클래스
	
	int result;
	double pi;
	
	Calculator() {
		result = 0;
		pi = 3.14;
	}
	
	//result에 값을 누적시키는 기능
	void add(int n) { 
		result += n;
	}
	
	//pi를 이용해서 원의 넓이를 리턴하는 기능  (원의넓이: PI * r * r)
	double circle(int r) { 
		return pi*r*r;
	}
}
