package Assignments;

//write many non static method and call them inside main method

public class Assignment_6 {
	void call()
	{
		System.out.println("bangalore is beautiful city");
	}
	void film()
	{
		System.out.println("which movie did you watch last time");
	}

	public static void main(String[] args) {
		
		Assignment_6 a1=new Assignment_6();
		a1.call();
		a1.film();
		a1.add();

	}
	void add()
	{
		System.out.println("addition is done");
	}

}
