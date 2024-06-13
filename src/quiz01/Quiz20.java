package quiz01;

import java.util.Scanner;

//사각형 출력(윤곽만)
public class Quiz20 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("가로 > ");
		int col = scan.nextInt(); //가로(열)
		System.out.print("세로 > ");
		int row = scan.nextInt(); //세로(행)
		
		/*
		 * 
		ex)5,4 
		*****
		*   *
		*   *
		*****
		 */
		
		for(int i = 1; i <= row; i++) { //세로(행)
			for(int j = 1; j <= col; j++ ) { //가로(열)
				if( (i==1 || i==row) || (j==1 || j==col) ) { //첫,마지막 행이거나, 첫,마지막 열일 때
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}