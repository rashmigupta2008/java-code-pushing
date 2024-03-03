package Assignments;

interface Amazon
{
	void login();
	void logout();
}

public class Assignment_49 implements Amazon {

	public static void main(String[] args) {
		Assignment_49 a1=new Assignment_49();
		a1.login();
		a1.logout();
	}
	public void login() {
		
		System.out.println("you have to login your account");
	}
	public void logout() {
		System.out.println("you have to logout your account");
	}

}
