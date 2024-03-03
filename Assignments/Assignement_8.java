package Assignments;
//call the more constructor in the main method

public class Assignement_8 {
	Assignement_8()
	
	{
		System.out.println("i am not hungry");
	}
	Assignement_8(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		new Assignement_8();
		new Assignement_8(20,30);
		new Assignement_8("rashmi");

	}
	Assignement_8(String s)
	{
		System.out.println(s);
	}

}
