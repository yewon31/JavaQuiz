package quiz20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


public class FileQuiz03 {

	public static void main(String[] args) {
		
		/*
		 * 상혁이가 입사한 회사에서, 매일 오전 아침 7시에 연계사(회사)에서
		 * 날짜유형의 CSV파일을 매일 전송 해줍니다.
		 * 
		 * ex) 2024_06_04_data.csv
		 * 주의할 점은 내일이되면 2024_06_05_data.csv 이 됩니다.
		 * 
		 * 그래서 상혁이는 아침마다, csv파일을 읽어서 우리의 데이터베이스에 저장하는
		 * 프로그램코드를 생성해야 합니다.
		 * 
		 * 1. buffered를 사용해서 오늘날짜패턴_data.csv 파일을 읽어서 한줄에 하나씩 출력을 하세요.
		 * 2. 읽은 데이터는 , 구분자로 만들어져 있는데 ,기준으로 데이터를 분리해서 
		 *    getter,setter를 가지는 Data클래스에 저장하고, 이 객체를 리스트에 저장하면 됩니다. 
		 *    
		 * 힌트)
		 * Date사용, Data객체는 본인이생성, ArrayList사용  
		 * 
		 */
		
//		LocalDate date  = LocalDate.now();
//		String now = date.format( DateTimeFormatter.ofPattern("yyyy_MM_dd")  );
//		System.out.println(now); //문자열 
		
		List<Data> list = new ArrayList<>(); //값을 정리할 리스트
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd");
		String now = sdf.format(date);
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\" + now + "_data.csv";
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader( new FileReader( path ));
			
			String str;
			while( (str = br.readLine() ) != null ) {
				
				String[] arr = str.split(",");
				
				Data data = new Data(arr[0], arr[1], arr[2], arr[3]);
				list.add(data);
			}
			System.out.println(list.toString());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (Exception e) {
			}
		}
	}
}
