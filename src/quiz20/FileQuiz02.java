package quiz20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class FileQuiz02 {

	public static void main(String[] args) {
		
		/*
		 * 1. 빠른입력을 통해서, 사용자로 부터 입력을 받습니다.
		 * 2. 사용자가 "그만" 을 적을때 까지 입력받아주면 됩니다.
		 * 3. 입력받을 내용을, BufferWriter를 이용해서, 파일을 쓰세요. (파일명은 자유)
		 * 4. 단, 사용자가 엔터를 칠때마다 데이터는 써져야합니다.
		 */
		
		/*
		 * inputStream, outputStream
		 * reader, Writer
		 * 
		 */
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\example.txt";
		
		BufferedReader br = null; //입력
		BufferedWriter bw = null; //출력
				
		try {
			
			br = new BufferedReader( new InputStreamReader(System.in) ); //키보드로입력
			bw = new BufferedWriter( new FileWriter(path) );
			
			while(true) {
				System.out.print("입력>");
				String str = br.readLine(); //nextLine()
				
				if(str.equals("그만")) {
					break;
				}
				
				bw.write(str + "\n"); //파일로쓰기
				bw.flush(); //버퍼를 비운다
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				bw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
