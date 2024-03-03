package Assignments;
class Upcast0
{
	static void megha()  {
		System.out.println("hello megha");
	}
}
class Upcast1 extends Upcast0
{
	void mini() {
		System.out.println("hello mini");
	}
}
public class Assignment_90 extends Upcast1 {
	void mauli() {
		System.out.println("hello mauli");
	}
	public static void main(String[] args) {
		Upcast0 u1=new Assignment_90();  //upcasting converting sub class object into super class type
		megha();  //you can access only top super class property but not class Upcast1 and sub class property
		Assignment_90 up1=(Assignment_90)u1;  //downcasting 
		megha();
		up1.mini();
		up1.mauli();  //u can access property of class which are in middle of class of getting downcasted and which is downcasting
	}
}
