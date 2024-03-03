package Assignments;

public class Assignment_11 {
	static void state(int a) {
		int sum= a+5;
		System.out.println(sum);
		
	}
	static void state(double m, double n)
	{
		double multiply=m*n;
		System.out.println(multiply);
	}
     void state(char s)
     {
		System.out.println("this is fine");
	}
	 static void state(boolean p)
	{
		System.out.println("pass the value");
	}
	 void state(String d)
		{
			System.out.println("wow");
		}

	public static void main(String[] args) {
		Assignment_11 m1=new Assignment_11();
		m1.state(300);
		m1.state(3.15, 2.40);
		m1.state('q');
		m1.state(true);
		m1.state("thank god");

	}

}
