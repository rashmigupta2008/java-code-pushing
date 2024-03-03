package Assignments;

//Find out number of char and number of digits in string Rahul123

public class Assignment_81 {

	public static void main(String[] args) {
		String str="rahul123";
		char c1[]=str.toCharArray(); 
		int count1=0;
		int count2=0;
		for(int i=0;i<=str.length()-1; i++)
		{
			boolean ans=Character.isDigit(c1[i]);  
			if(ans==true)
			{
				count1++;
			}
			else
			{
				count2++;
			}
		}
		System.out.println("no of digits:"+count1);
		System.out.println("no of character:"+count2);
	}

}
