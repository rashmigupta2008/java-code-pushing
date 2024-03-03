package Assignments;
import java.util.Scanner;
public class Assignment21Copy {
	static Scanner sc=new Scanner(System.in);
	 static void addition(){
		int a, b, c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println(c);
	 } 
	 void subtraction(){
		 int a, b, c;
		 a=sc.nextInt();
		 b=sc.nextInt();
		 c=a-b;
		 System.out.println(c);	 
	 }
	public static void main(String[] args) {
		addition();
		 Assignment21Copy a1=new Assignment21Copy();
		 a1.subtraction(); 
	}
}
