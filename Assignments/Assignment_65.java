package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_65 {

	public static void main(String[] args) {
		int a[]=new int[4];
		int b[]=new int[4];
		for(int i=0;i<a.length;i++)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the value of index: "+i);
			a[i]=sc.nextInt();
			b[i]=a[i];
		}
		System.out.println("array element of a: "+Arrays.toString(a));
		System.out.println("array element of b: "+Arrays.toString(a));
		
	}

}
