package quiz01;

//배열에서 가장 큰 값
public class Quiz24 {
	
	public static void main(String[] args) {
		
		//배열이 주어질때, 배열 요소중 가장 큰 값 하나만 출력
		int[] arr = {34, 65, 12, 34, 56, 100, 54, 21, 99};
		int max = 0;
		for(int a : arr) {
			if(max < a) max = a;
		}
		System.out.println(max);
		
	} //main
}