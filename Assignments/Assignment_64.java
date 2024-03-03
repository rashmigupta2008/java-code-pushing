package Assignments;

import java.util.Arrays;

public class Assignment_64 {

	public static void main(String[] args) {
		String name[]=new String[3];
		name[0]="rashmi";
		name[1]="raju";
		name[2]="krish";
		System.out.println(Arrays.toString(name));      
        Arrays.sort(name);  
        System.out.println(Arrays.toString(name));
	}

}
