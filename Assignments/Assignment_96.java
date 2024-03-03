package Assignments;
//WAP to use getter and setter with int, char, boolean, string, float, double 
		class Modified   {
			private int a=30;  
			private char c='r'; 
			private boolean b=true; 
			private String str="rashmi"; 
			private float f=25.50f; 
			private double d=45.30; 
			public int get_a()       {
				return a;  }
			public char get_c() {      
				return c;   }
			public boolean get_b()      {
				return b;  }
			public String get_str()       {
				return str;  }
			public float get_f()       {
				return f;   }
			public double get_d()       {
				return d;   }
			public void set_a(int a)      {
				this.a=a;	}
			public void set_c(char c)      {
				this.c=c;}
			public void set_b(boolean b)     {
				this.b=b;	}
			public void set_str(String str)      {
				this.str=str;}
			public void set_f(float f)     {
				this.f=f;}
			public void set_d(double d)      {
				this.d=d;} }
		public class Assignment_96 {
			public static void main(String[] args) {
				Modified a1=new Modified();
				a1.set_a(50);
				a1.set_c('g');
				a1.set_b(false);
				a1.set_str("ramola");
				a1.set_f(100.40f);
				a1.set_d(200.50);
				System.out.println(a1.get_a()); 
				System.out.println(a1.get_c());
				System.out.println(a1.get_b());
				System.out.println(a1.get_str());
				System.out.println(a1.get_f());
				System.out.println(a1.get_d());	
			}
		}
	
	



