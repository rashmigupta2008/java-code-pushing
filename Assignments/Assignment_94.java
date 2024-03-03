package Assignments;

//WAP to find the area of circle where pi is coming from Math.Pi method and r is coming from Math.Random method it is printing 10 times

public class Assignment_94 {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++)
		{
			double pi=Math.PI;
			double r1=Math.random();
			//area of circle
			double a1=pi*r1*r1;
			System.out.println("area of circle is:"+a1);
		}
	}
}