package Assignments;

interface class1
{
	void hello();
}

interface class2
{
	void hii();
}
public class Assignment_52 implements class2,class1
{

	public static void main(String[] args)
	{
		Assignment_52 a1=new Assignment_52();
		a1.hello();
		a1.hii();
	}
	
	public void hii()
	{
		System.out.println("say hii");
		
	}
	public void hello()
	{
		System.out.println("say hello");
		
	}
}
