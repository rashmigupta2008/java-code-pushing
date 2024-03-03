package Assignments;

import java.util.Date;

public class Assignment_71 {

	public static void main(String[] args) {
		Date d1=new Date();   
		System.out.println(d1.getTime());  
		Date d2=new Date(d1.getTime());
		String s1=d2.toString();
		System.out.println(s1);
		String day=s1.substring(0, 4);
		System.out.println("day is:"+day);
		String month=s1.substring(4, 8);
		System.out.println("month is:"+month);
		String date=s1.substring(8, 10);
		System.out.println("date is:"+date);
		String year=s1.substring(24);
		System.out.println("year is:"+year);
		String time=s1.substring(11, 20);
		System.out.println("time is:"+time);
	}
}
