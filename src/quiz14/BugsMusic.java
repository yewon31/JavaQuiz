package quiz14;

public class BugsMusic implements SongList {
	
	private String[] list = new String[100];
	private int count = 0;
	
	/* SongList인터페이스를 상속받습니다.
	 * 마음대로 작성.
	 * 
	 */
	
	@Override
	public void insertList(String song) {
		list[count++] = song;
		
	}
	@Override
	public void playList() {
		if(count<1) {
			System.out.println("~벅스 광고~");
			return;
		}
		int rand = (int)(Math.random() * count);
		System.out.println(list[rand]);
		
	}
	@Override
	public int playLength() {
		return count;
	}
}