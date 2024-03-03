package Assignments;
import java.util.ArrayList;
import java.util.Collections;
public class Assignment_98 {
			public static void main(String[] args) {
				ArrayList a1=new ArrayList();   //we make object of that class which method we are going to use 
				a1.add("rashmi");   //method add(from ArrayList class) is a parameterised method which accept single parameter only
				a1.add("priya");
				a1.add("mini");
				a1.add("samar");
				a1.add("sugandha");
				a1.add(20);
				a1.add(50);
				a1.add(90);
				a1.add(true);
				a1.add(false);
				a1.add('a');
				a1.add('r');
				a1.add(null);
				a1.add(null);
				a1.add("rashmi");
				a1.add("rashmi");
				//a1.add("");
				//Collections.sort(a1);//it is used to sort the data of same datatype
				//method sort from collections class,which is used to sort the data 
				System.out.println(a1);
				//Arraylist accept indexing,duplicate,heterogeneous,null,sort,dynamic(means as many as data u can store. so there is no fixed size)
			}
	}


