package Assignments;

//Reverse a String and Print it
public class Assignment_82 {

	public static void main(String[] args) {
		String str="rashmi321";
			String output="";
			for(int i=str.length()-1;i>=0;i--)
			{
				char ch=str.charAt(i);  
				output=output+ch;    

		}
			System.out.println(output);
	}

}
