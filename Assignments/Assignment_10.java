package Assignments;

public class Assignment_10 {
	static void show()           //static method
	{
	int p=10,q=20;
	int sum=p+q;
	System.out.println(sum);
	
	}	
	static void medium()      //static method
	{
		int p=10,q=20;
		int subtraction=p-q;
		System.out.println(subtraction);
			
		}
	         void operator()     //non static method
	{
		int p=10,q=20;
		int multiply=p*q;
		System.out.println(multiply);	
		}
	        void div()          //non static method
	{
		int p=10,q=20;
		float division=(float) p/q;
		System.out.println(division);	
		}
		
	public static void main(String[] args) {
		show();              //calling static method
		medium();            //calling static method
		Assignment_10 n1=new Assignment_10();  //create an object of class 
		n1.operator();       //calling non static method
		n1.div();            //calling non static method		

	}

}
