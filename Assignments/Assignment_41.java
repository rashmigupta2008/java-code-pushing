package Assignments;
//WAP a program using  Switch(a) keyword case1:
//addition, case2:subtraction, case3:multiplication, 
//case4:division And fetch the value of 'a' with scanner class using next int() method.

import java.util.Scanner;

public class Assignment_41 {
	
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the value of a:");
		int a=s1.nextInt();
		switch(a)
		{
		case 1: System.out.println("addition");   
                break;  
        case 2: System.out.println("subtraction");  
                break;
        case 3: System.out.println("multiplication");   
                break;
        case 4: System.out.println("division");   
                break;                  
        default: System.out.println("I am the default line");   
		}
	}

}
