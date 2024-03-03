package Assignments;

interface novel1
{
	void study();
}

interface novel2 extends novel1
{
	void write();
}
abstract class book implements novel2
{
	abstract void read();
}

public class Assignment_55 extends book
{

	public static void main(String[] args) {
		Assignment_55 a1=new Assignment_55();
		a1.read();
		a1.study();
		a1.write();
	}
	public void write() {
		System.out.println("you want to write a book");
	}
	public void study() {
		System.out.println("you want to study this book");
	}
	void read() {
		System.out.println("you want to read this book");
	}
}
