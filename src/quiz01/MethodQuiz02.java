package quiz01;

public class MethodQuiz02 {

	public static void main(String[] args) {
		
		System.out.println( java(4) );
		System.out.println( sum(10) );
		System.out.println( primeNum(1,5) );
		System.out.println( primeNum(5,1) );
		System.out.println( primeNum(5,5) );
	}
	
	/*
		1. java()
		매개변수로 정수를 받습니다.
		매개변수 1 -> return "자";
		매개변수 2 -> return "자바";
		매개변수 3 -> return "자바자";
		매개변수 4 -> return "자바자바";
	*/
	static String java(int num) {
		
		String result = "";
		for(int i=0; i<num; i++) {
			result += (i%2==0?"자":"바");
		}
		
		return result;
	}

	
	/*
		2. sum()
		매개변수로 정수를 1개 받습니다.
		매개변수의 약수의 합계를 리턴
		매개변수 5 -> return 1 + 5
		매개변수 6 -> return 1 + 2 + 3 + 6
	*/
	static int sum(int num) {
		int result = 0;
		
		for(int i=1; i<=num; i++) {
			if(num%i==0) { //약수
				result += i;
			}
		}
		
		return result;
	}

	
	/*
		3. primeNum()
		매개변수 2개를 받아서, 순서 상관없이, 두 수 사이의 합계를 리턴.
		1, 2 => return 1 + 2;
		2, 1 => return 1 + 2;
		1, 1 => return 0;
	*/
	static int primeNum(int a, int b) {
		
		if(a==b) return 0;
		
		if(a>b) { //값 정렬
			int tmp = a; a = b; b = tmp;
		}
		
		int result = 0;
		while(a <= b) { //1, 2
			result += a++;
		}
		
		return result;
	}
}