package Assignments;

//write a program where create a class, make pi as final local variable and 1 static method where r=14 and in main method r=7
//find out the area of circle

public class Assignment_30 {
	
	static void area1()
	{
		final double pi=3.14;
		int r=14;
		double area12=pi*r*r;
		System.out.println(area12);
	}

	public static void main(String[] args) {
		final double pi=3.14;
		int r=7;
		double area11=pi*r*r;
		System.out.println(area11);
		area1();

	}

}
