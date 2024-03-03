package Assignments;

//Check if the String is Palindrome

public class Assignment_83 {

	public static void main(String[] args) {
		String input="radar";   
		String output="";
		for(int i=input.length()-1;i>=0;i--)
		{
			char ch=input.charAt(i); 
			output=output+ch;   
	}
		System.out.println(output);
		if(input.equals(output))
		{
			System.out.println("the giver string is pallindrome");
		}
		else
		{
			System.out.println("the giver string is pallindrome");
		}
	}

	}


