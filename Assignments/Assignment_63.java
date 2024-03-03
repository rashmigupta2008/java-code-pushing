package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_63 {
	public static void main(String[] args) {
		
		int a[]=new int[4];
		
		for(int i=0;i<4;i++)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the value of index: "+i);
			 a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a)); 
		
	}

}

