package Assignments;
interface a1
{
	void day();
	void night();
}
interface a2 extends a1
{
	void welcome();
	void bye();
}
public class Assignment_50 implements a2 {

	public static void main(String[] args) {
		Assignment_50 a1=new Assignment_50();
		a1.day();
		a1.night();
		a1.bye();
		a1.welcome();
	}
	public void welcome() {
		System.out.println("you are welcome my home");
	}
	public void bye() {
		System.out.println("goodbye");
	}
	public void day() {
		System.out.println("its sunny day today");
	}
	public void night() {
		System.out.println("this night has full moon");	
	}
}
