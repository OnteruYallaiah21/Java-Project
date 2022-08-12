/**
 * 
 */
package com.oy.ot.github.Exercises;
import java.util.*;

public class Second_Highest {
	public static void main(String[] args) {
		int temp;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=input.nextInt();
		int[] array=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("enter the " +(i+1)+  "\tthe number");
			array[i]=input.nextInt();
		}
		System.out.println("the numbers in array before asending orderis");
		for(int i=0;i<size;i++) {
			System.out.print(array[i]);
			System.out.print(",");
			
		}
		
		for(int i=0;i<size;i++) {
			
			for(int j=i+1;j<size;j++) {
				if(array[i]>array[j]) {// this is very imporatant when we write two or more
					 temp=array[i];//89 56 43 72//1)56 89 43 72 //on blow if loop
				    array[i]=array[j];
				    array[j]=temp;
				    //temp=0;
				}
		   }
		}
		System.out.println("");
		System.out.println("the numbers after asending order is ");
		     for(int i=0;i<size;i++) {
		    	 System.out.print(array[i]);
		    	 System.out.print(",");
		    	 
		     }
		     System.out.println("");
		     System.out.println("the second larhest number in the arry is==> "+array[size-2]);
		
		
	}

}
