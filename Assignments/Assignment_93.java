package Assignments;
class Upcast123  {
	static void a()   {
		System.out.println("this is first alphabet");
	}
}
class Upcast234 extends Upcast123   {
	void b()   {
		System.out.println("this is second alphabet");
	}
}
class Upcast345 extends Upcast234   {
	 void c()   {
		System.out.println("this is third alphabet");
	}
}
public class Assignment_93 extends Upcast345{

	public static void main(String[] args) {
		 Upcast234 up1=new Upcast345();    //upcasting
		 a();
		 up1.b();
		 //actually downcasting is not possible w/o upcasitng so first we have to upcasting for that level then go for downcasting
		 Upcast345 u1=new Assignment_93(); //upcasting
		 a();
		 u1.b();
		 Assignment_93 t1=(Assignment_93) u1;  //downcasting
		 a();
		 t1.b();
		 t1.c(); 
	}
}
