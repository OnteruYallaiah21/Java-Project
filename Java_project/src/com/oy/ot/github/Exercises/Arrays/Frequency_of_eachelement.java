package com.oy.ot.github.Exercises.Arrays;
import java.util.*;
public class Frequency_of_eachelement {
	public static void main(String[] args) {
		int count=0,j,i;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=input.nextInt();
		int[] array=new int[size];
	try {
		for(i=0;i<size;i++) {
			System.out.println("enter the "+(i+1)+ "number");
			array[i]=input.nextInt();
		}
	}catch(Exception e) {
		System.out.println("array is out of bound of ecpection occur kindely check the size of array");
			
			
		}
			Frequency memory=new Frequency();
			memory.Fre(array,size);
		
		
	}

}
class Frequency{
	int count=0;
	void Fre(int[] array,int size) {
		System.out.println("the number in an array is ");
		for(int i=0;i<size;i++) {
			System.out.println(array[i]);
		}
		try {
		for(int i=0;i<size;i++) {
			count=0;
			for(int j=i+1;j<size;j++) {
				if(array[i]==array[j]) {
					count++;
					if(count>1) {
						System.out.println("the number=>"+array[i]+"=>repeated=>"+count+"=>times");
					}
					else {
						System.out.println("go to next number");
					}
										
				}
				
				
					
				}
					
			}
		
			
		}catch(Exception e) {
			System.out.println("the numbers are not present");
			}
		}
	
		//return size;
		
	}
	//return count;
	

