package Assignments;

import java.util.Scanner;

//WAP convert int into double and double into byte
public class Assignment_89 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a");
		int a=sc.nextInt();
		double b=a;
		System.out.println(b);
		byte c=(byte) b;     //it is actually (200%256) because 200 is out of range of byte. when no. is out of the range then no. is divided by range of byte (256)
		System.out.println(c); //if no is within the range then it will give normal ans
	}
}