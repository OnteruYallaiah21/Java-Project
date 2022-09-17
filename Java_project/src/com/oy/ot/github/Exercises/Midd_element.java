package com.oy.ot.github.Exercises;
import java.util.*;
public class Midd_element {
	public static void main(String[] args) {
		int middle=0;
		Scanner sc=new Scanner(System.in);
		int[] array=new int[5];
	for(int i=0;i<5;i++) {
		 System.out.println("enter the" +i+ "in the array");
		 array[i]=sc.nextInt();
		
	}
	middle=5/2;
	
   System.out.println("the middle element is"+array[middle]);
	    
	}

}
