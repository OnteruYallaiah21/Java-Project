package com.oy.ot.github.Exercises;
import java.util.*;
public class Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the factorial number");
		int num=sc.nextInt();
		int temp=1;
		for(int i=1;i<=num;i++) {
			temp=temp*i;
			
		}
		System.out.println("the factorial of a number is "+temp);
		
	}

}
