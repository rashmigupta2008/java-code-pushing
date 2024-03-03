package Assignments;
class Upcast11
{
	static void ram()
	{
		System.out.println("ram");
	}
}
class Upcast2 extends Upcast11
{
	void sita()
	{
		System.out.println("sita");
	}
}
public class Assignment_91 extends Upcast2 {
	void priya()
	{
		System.out.println("priya");
	}
	public static void main(String[] args) {
		Upcast2 p1=new  Assignment_91();
		p1.sita();  //we can access the property of super class which is getting upcasted
	    ram();   //we can also access the property of super classes which above the upcasted super class
	    Assignment_91 a1=(Assignment_91) p1;
	    a1.sita();
	    ram();
	    a1.priya();
    }
}
