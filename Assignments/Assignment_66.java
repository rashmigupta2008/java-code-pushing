package Assignments;
import java.util.Arrays;
import java.util.Scanner;
public class Assignment_66 {
	public static void main(String[] args) {
		int a[]=new int[4];
		int sum=0;
		for( int i=0;i<a.length;i++)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the index value: "+i);
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println(Arrays.toString(a));
		double d= sum/a.length;
		System.out.println(d);
		double r=sum%a.length;
		System.out.println(r);
	}
}
