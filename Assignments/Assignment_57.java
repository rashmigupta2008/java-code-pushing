package Assignments;

//write a program where 4 methods are with 4 types of access specifier

public class Assignment_57 {
	
	public static void add()
	{
		System.out.println("addition");
	}
	private static void sub()
	{
		System.out.println("subtraction");
	}
	protected void multiply()
	{
		System.out.println("multiplication");
	}
	static void div()
	{
		System.out.println("division");
	}
	public static void main(String[] args)
	{
		Assignment_57 a1=new Assignment_57();
		a1.multiply();
		add();
		sub();
		div();
	}

}
