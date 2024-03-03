package Assignments;

import java.util.Arrays;

//Check if 2 given strings are anagram of each other or not
public class Assignment_84 {

	public static void main(String[] args) {
		String a1="race";
		String a2="care";
		if(a1.length()!=a2.length())
		{
			System.out.println("both strings are not anagram");
		}
		else
		{
			char [] c1=a1.toCharArray();   //converting string into character of array
			Arrays.sort(c1);    //sorting chAr of array
			System.out.println(Arrays.toString(c1)); 
			char [] c2=a2.toCharArray();
			Arrays.sort(c2);
			System.out.println(Arrays.toString(c2));
			if(Arrays.equals(c1, c2)==true)
			{
				System.out.println("both are anagram");
			}
		}
	
	}

	}

