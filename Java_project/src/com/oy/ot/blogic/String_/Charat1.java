package com.oy.ot.blogic.String_;
import java.io.FileNotFoundException;
import java.util.*;
public class Charat1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the string name");
		String s=input.next();
	
		System.out.println("string is \t"+s);
		//int index=input.nextInt();
		char ch1=s.charAt(2);
		System.out.println("the chaecter  at the place of index=>"+ch1);
		}
}
