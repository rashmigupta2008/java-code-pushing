package Assignments;

public class Assignment_20 {
	
	// write a program where  a class has 3 different method 1.main 2. static add 3. static subtract
	//take two variable a&b declare them at global level and initialize them locally inside each method and perform addition and subtraction
	
	static int a;
	static double b;

	public static void main(String[] args) {
		add();
		subtract();

	}
	static void add()
	{
		a=40;
		b=5.5;
		double c=a+b;
		System.out.println(c);
		
			
	}
	static void subtract()
	{
		a=65;
		b=10.20;
		System.out.println(a-b);
		
			
	}

}
