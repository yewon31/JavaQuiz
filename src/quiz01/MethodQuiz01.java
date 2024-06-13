package quiz01;

public class MethodQuiz01 {

	public static void main(String[] args) {
		System.out.println( method3(1, 2, 3.5) );
		System.out.println( method4(100) );
		method5("Hi", 5);
		System.out.println( maxNum(2.2, 4.4) );
		System.out.println( abs(-50) );
	}

	static double method3(int a, int b, double c) {
		return a+b+c;
	}
	
	static String method4(int a) {
		if(a%2==0) {
			return "짝수";
		} else {
			return "홀수";
		}
	}
	
	static void method5(String str, int a) {
		for(int i=1; i<=a; i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	
	static double maxNum(double a, double b) {
		double max = a>b? a : b;
		return max;
	}
	
	static int abs(int a) {
		int result = a>0 ? a : -a;
		return result;
	}
}