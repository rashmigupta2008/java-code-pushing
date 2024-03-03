package Assignments;

interface city1
{
	void jhansi();
}
interface city2
{
	void lucknow();
}
abstract class city3 implements city1,city2
{
	abstract void kanpur();
}
public class Assignment_54 extends city3 {

	public static void main(String[] args) 
	{
		Assignment_54 a1=new Assignment_54();
		a1.jhansi();
		a1.kanpur();
		a1.lucknow();
	}
	public void jhansi() {
		System.out.println("you live in jhansi");
	}
	public void lucknow() {
		System.out.println("you live in jhansi");
	}
	void kanpur() {
		System.out.println("you live in jhansi");
	}
}
