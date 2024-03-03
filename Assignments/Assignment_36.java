package Assignments;

import java.util.Scanner;

public class Assignment_36 {
	static void addition() {
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		double b=s1.nextDouble();
		double add=a+b;
		System.out.println(add);
	}
	 void subtraction() {
		Scanner s1=new Scanner(System.in);
		byte a=s1.nextByte();
		int b=s1.nextInt();
		int sub=a-b;
		System.out.println(sub);
	 }

	public static void main(String[] args) {
		System.out.println("addition");
		addition();	
		System.out.println("subtraction");
		 Assignment_36 a1=new  Assignment_36();
		a1.subtraction();
		System.out.println("multiplication");
		 Assignment_36 a2=new  Assignment_36();
		a2.multiplication();
		System.out.println("division");
		division();
	}
	 void multiplication() {
			Scanner s1=new Scanner(System.in);
			float a=s1.nextFloat();
			int b=s1.nextInt();
			float mul=a*b;
			System.out.println(mul);
		 }
	 static void division() {
			Scanner s1=new Scanner(System.in);
			int a=s1.nextInt();
			int b=s1.nextInt();
			int div=a/b;
			System.out.println(div);
		 }
}
