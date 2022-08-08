package com.oy.ot.github.Exercises;
import java.util.*;
public class Prime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the the array");
		int size=sc.nextInt();
		ArrayList<Integer> array=new ArrayList<Integer>();
		for(int i=0;i<=size;i++) {
			array.add(i);
		}
		int temp=0,count=0;
		for(int i=0;i<size;i++) {
			for(int j=1;j<=array.get(i);j++) {
				if(array.get(i)%j==0)
					count++;
			}
			if(count==2)
				temp++;
			count=0;
		}
		System.out.println("the prime numbers between 1 to "+size+" is=>"+temp);
		
	}

}
