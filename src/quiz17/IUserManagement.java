package quiz17;

public interface IUserManagement {
	
	public void insert(String name, int age);
	public void printList();
	public boolean search(String name);
	public boolean delete(String name);
}
