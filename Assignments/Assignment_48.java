package Assignments;
class Concrete_Class{
	static void add()
	{
		System.out.println("perform addition");
	}
	void sub(){
		System.out.println("perform subtraction");
	}
}
abstract class Mini extends Concrete_Class{
	abstract void multiply();
	abstract void division();	
}
public class Assignment_48 extends Mini {
	public static void main(String[] args) {
		Assignment_48 a1=new Assignment_48();
		add();
		a1.sub();
		a1.multiply();
		a1.division();
		modulus();
		a1.percentage();
}
	void multiply(){
		System.out.println("perform multiplication");
	}
	void division() {
		System.out.println("perform division");
	}
	static void modulus(){
		System.out.println("perform modulus");
	}
     void percentage(){	
		System.out.println("find out the percentage");
	}
}
