package Assignments;

          public class Assignment_21 {
	      int a;
	      int b;
	      int c;
	      int d;
	
			public static void main(String[] args) {
				add();
				subtract();
		
			}
			static void add()
			{
				Assignment_21 a1=new Assignment_21();
				a1.a=10;
				a1.b=5;
				a1.c=a1.a+a1.b;
				System.out.println(a1.c);
					
			}
			static void subtract()
			{
				Assignment_21 a1=new Assignment_21();
				a1.a=10;
				a1.b=5;
				a1.d=a1.a-a1.b;
				System.out.println(a1.d);			
			}	
	}


