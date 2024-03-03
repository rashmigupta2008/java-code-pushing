package Assignments;

public class Assignment_79 {

	public static void main(String[] args) {
		String a1="rashmi321";
		char c1[]=a1.toCharArray();    
		for(int i=0;i<=a1.length()-1; i++)
		{
			boolean ans=Character.isDigit(c1[i]);  
			if(ans==true)
			{
				System.out.println(c1[i]+" its a digit:");
			}
			else
			{
				System.out.println(c1[i]+" its a char:");
			}
		}
	
	}

}
