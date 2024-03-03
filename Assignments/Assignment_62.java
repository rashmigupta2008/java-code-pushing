package Assignments;

import java.util.Scanner;

public class Assignment_62 {

	public static void main(String[] args) throws ArithmeticException {
		Scanner sc=new Scanner(System.in);
		System.out.println("entert the age");
		int age=sc.nextInt();
		if(age>18)
		{
			System.out.println("you can access www.google.com");
		}
		else
		{
			throw new ArithmeticException("you can not access the website");
		}
	}
}
