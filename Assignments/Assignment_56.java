package Assignments;

interface animal1
{
	void dog();
}

interface animal2 extends  animal1
{
	void cat();
}

interface animal3 extends  animal2
{
	void cow();
}
public class Assignment_56 implements animal3
{

	public static void main(String[] args) {
		Assignment_56 a1=new Assignment_56();
		a1.cat();
		a1.dog();
		a1.cow();
	}
	public void cat() {
		System.out.println("do you like cat?");
	}
	public void dog() {
		System.out.println("do you like dog?");
	}
	public void cow() {
		System.out.println("do you like cow?");
	}

}
