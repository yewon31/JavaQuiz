package quiz20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class FileQuiz01 {

	public static void main(String[] args) {
		
		/*
		 * 1. 스캐너로 읽을 파일명을 확장자포함 입력받습니다. 
		 * 2. upload폴더에 파일이 있다면, 이 파일을 uploadcopy로 복사해주세요.
		 *    파일이 없으면 "파일명이 없습니다" 예외구문을 출력합니다.
		 */

		Scanner sc = new Scanner(System.in);

		InputStream ios = null;
		OutputStream fos = null;
		
		try {
			
			System.out.print("읽을 파일명(확장자 포함) > "); 
			String fileName = sc.nextLine(); //img.png
			String[] fileNameArr = "img.png".split("\\.");
			
			String inputPath = "C:\\Users\\user\\Desktop\\course\\java\\upload\\"+fileName;
			String outputPath = "C:\\Users\\user\\Desktop\\course\\java\\uploadcopy\\"+fileNameArr[0]+"_copy."+fileNameArr[1];
			
			ios = new FileInputStream(inputPath); //FileNotFoundException
			fos = new FileOutputStream(outputPath);
			
			byte[] arr = new byte[1000]; //사진 크기가 44kb, 1000바이트씩 44번
			
			int result;
			while( (result = ios.read(arr)) != -1 ) { //read(바이트) 는 읽은 길이를 반환하고, 더이상 읽을 내용이 없다면 -1반환
				//파일 output
				fos.write(arr, 0, result); //배열의 0~데이터길이 까지 파일을 씀
			}
			System.out.println("파일 복사 완료");
			
		} catch (FileNotFoundException e) {
			System.out.println("파일명 없음");
			//e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("확장자를 입력해주세요.");
			//e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ios.close();
				fos.close();
			} catch (Exception e2) {
			}
		}
		
			
	}
}
