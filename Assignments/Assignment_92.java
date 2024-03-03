package Assignments;
class Upcast111  {
	void road()   {
		System.out.println("this road is good");
	}
}
class Upcast22 extends Upcast111   {
	static void line()  {
		System.out.println("it goes to stright");
	}
}
class Upcast33 extends Upcast22  {
	void pink()   {
		System.out.println("it looks good");
	}
}
public class Assignment_92 extends Upcast33 {
	public static void main(String[] args) {
		Upcast22 up=new Upcast33();    //upcastimg
		line();
		up.road();	
		Upcast33 t1=(Upcast33)up;  //downcasting
		t1.pink();
		line();
		t1.road();

	}

}
