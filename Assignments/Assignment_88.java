package Assignments;

import java.util.Scanner;

//WAP convert byte into double and double into int

public class Assignment_88 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a");
		byte a=sc.nextByte();
		double b=a;
		System.out.println(b);
		int c=(int) b;
		System.out.println(c);
	}
}
