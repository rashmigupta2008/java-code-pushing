package Assignments;
import java.util.Scanner;
public class Assignment_42 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the value of d");
		int d=s1.nextInt();
		System.out.println("enter the value of a");
		int a=s1.nextInt();
		System.out.println("enter the value of b");
		int b=s1.nextInt();
		int c=0;	
		switch(d){
		case 1: c=a+b;
		        break;
		case 2: c=a-b;
                break;
		case 3: c=a*b;      
                break;
		case 4: c=a/b;     
                break;
        default: System.out.println("out of the block");
		}
		System.out.println(c);
	}

}
