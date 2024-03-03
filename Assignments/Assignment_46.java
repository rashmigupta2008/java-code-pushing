package Assignments;
public class Assignment_46 extends Mother {  //u can inherit only parent class but not other sub class
	void display()
	{
		System.out.println("my name is sita");
	}

	public static void main(String[] args) {
		Assignment_46 h1=new Assignment_46();
				h1.enter();
				h1.display();
				Child12.show();   //u can call child12 class by creating object of child2 class 
	}          //but u can not call child12 class method by using h1 ref variable because this is other sub class ref variable
}
class Child12 
{
	 static void show()
	{
		System.out.println("my name is ram");
	}
}

class Mother
{
	void enter()
	{
		System.out.println("enter your name");
	}
}
