package Assignments;

public class Assignment_80 {

	public static void main(String[] args) {
		String str="rashmi123gupta";
		char c1[]=str.toCharArray();    
		for(int i=0;i<=str.length()-1; i++)
		{
			boolean ans=Character.isDigit(c1[i]);  
			if(ans==true)
			{
				System.out.println(i);
			}
		}
	}

}
