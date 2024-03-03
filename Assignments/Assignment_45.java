package Assignments;
public class Assignment_45 extends Two
{

	public static void main(String[] args)
	{	
		System.out.println("multiplication");
		Assignment_45 m1=new Assignment_45();
		m1.add();
		m1.subtraction();
	}
}
	
class Three
{
	 void add()
	{
		System.out.println("addition");
	}
	
	}

class Two extends Three
{
	void subtraction()
	{
		System.out.println("subtrcation");
	}
	}

