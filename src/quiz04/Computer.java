package quiz04;

public class Computer extends Calculator {
	
	/*** 오버라이딩 ***/
	//메서드를 오버라이딩 하고, pi대신 하는 Math.PI를 사용해서 원의 넓이를 구하세요.
	double circle(int r) {
		return Math.PI*r*r;
	}
	
	/*** 오버로딩 ***/	
	//정사각형의 넓이 를 리턴
	double rect(double w) {
		return w*w;
	}
	
	//직사각형의 넓이 를 리턴
	double rect(double w, double h) {
		return w*h;
	}
	
	//직육면체의 부피를 리턴
	double rect(double w, double h, double l) {
		return w*h*l;
	}
}
