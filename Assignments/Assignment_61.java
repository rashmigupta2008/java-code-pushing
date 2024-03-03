package Assignments;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment_61 {

	public static void main(String[] args) {
		
		int a=10,b=0,c;
		try
		{
			c=a/0;
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		try
		{
			int i=sc.nextInt();
		}
		catch(InputMismatchException e1)
		{
			System.out.println(e1);
		}
		
		System.out.println("program is terminated normally");
	}

}
