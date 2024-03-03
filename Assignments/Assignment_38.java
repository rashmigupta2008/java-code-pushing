package Assignments;
//write a program to calculate area of a triangle where h and b are coming from scanner class
import java.util.Scanner;

public class Assignment_38 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int h=s1.nextInt();
		int b=s1.nextInt();
		int c=(h*b)/2;
		System.out.println("area of triangle:"+c);

	}
}
