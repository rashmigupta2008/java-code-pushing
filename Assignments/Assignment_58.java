package Assignments;

public class Assignment_58 {

	public static void main(String[] args) {
		Assignment_58 a1=new Assignment_58();  //we can access any method with any access specifier which are in same class
		a1.add();
		a1.div();
		a1.mul();
		a1.sub();
	}
	public void add()
	{
		System.out.println("you perform addition");
	}
	private void sub()
	{
		System.out.println("you perform subtraction");
	}
	protected void mul()
	{
		System.out.println("you perform multiplication");
	}
	 void div()
	{
		System.out.println("you perform division");
	}
}
