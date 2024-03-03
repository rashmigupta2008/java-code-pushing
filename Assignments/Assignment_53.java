package Assignments;
interface class11
{
	void hello();
}
interface class22
{
	void hii();
}
interface class3
{
	void add();
}
interface class4
{
	void sub();
}
public class Assignment_53 implements class22,class11,class3,class4
{
	public static void main(String[] args){
		Assignment_53 a1=new Assignment_53();
		a1.hello();
		a1.hii();
		a1.add();
		a1.sub();
	}
	public void hii(){
		System.out.println("say hii");
		
	}
	public void hello(){
		System.out.println("say hello");
		
	}
	public void sub() {
		System.out.println("you perform addition");
	}
	public void add() {
		System.out.println("you perform subtraction");
	}
}
