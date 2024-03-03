package Assignments;
import java.util.Scanner;
public class Assignment_37 {
	static int a,b,c;	
	static Scanner a1=new Scanner(System.in);
	static void addition(){	 
		a=a1.nextInt();
		b=a1.nextInt();
		c=a+b;
		System.out.println(c);
	}
	void subtraction(){	
		a=a1.nextInt();
		b=a1.nextInt();
		c=a-b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		addition();
		Assignment_37 a12=new Assignment_37();
		a12.subtraction();	
		multiplication();
		division();				
	}
	static void multiplication(){	
		a=a1.nextInt();
		b=a1.nextInt();
		c=a*b;
		System.out.println(c);
	}
	static void division(){	
		a=a1.nextInt();
		b=a1.nextInt();
		c=(a/b);
		System.out.println(c);
	}
}
