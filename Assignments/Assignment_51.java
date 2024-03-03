package Assignments;

	interface black
	{
		void primary();
	}
	abstract class white implements black
	{
		abstract void color();
		
		void favourite()
		{
			System.out.println("which color is your favourite");
		}
	}

public class Assignment_51 extends white
{
	public static void main(String[] args) {
		 Assignment_51 a1=new  Assignment_51();
		 a1.favourite();
		 a1.primary();
		 a1.color();
	}
	void color() 
	{
		System.out.println("very colorful");
	}
	
	public void primary()
	{
		System.out.println("live your life");
		
	}
}
