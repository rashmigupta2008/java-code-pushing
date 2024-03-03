package Assignments;

public class Assignment_75 {

	public static void main(String[] args) {
		int a[]=new int[4];
		a[0]=21;
		a[1]=31;
		a[2]=41;
		a[3]=51;
		int check=41;
		for(int i=0;i<a.length;i++)
		{
			if(check==a[i])
			{
				System.out.println("element is present in array");
			}
			else
			{
				System.out.println("element is not present in array");
			}
		}
	}

}
