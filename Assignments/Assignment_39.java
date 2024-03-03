package Assignments;

import java.util.Scanner;

//write a program where age has to be entered at the run time and print the message
public class Assignment_39 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int age=s1.nextInt();
		if(age>=18)
		{
			System.out.println("I am adult");
		}
		else
		{
			System.out.println("I am still young");
		}
		
	}

}
