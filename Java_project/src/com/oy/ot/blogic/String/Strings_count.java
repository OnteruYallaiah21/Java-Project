package com.oy.ot.blogic.String;
import java.util.*;
import java.lang.*;
public class Strings_count {
	public static void main(String[] args) {
		String obj=new String();
		obj.str_count();
	}

}
class String{
	void str_count() {
		int count=0;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the string ");
		java.lang.String str;
		str=input.next();
		System.out.println("the length of a string is"+str.length());
		try{for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!="") {
				count++;
			}
			
		}
	}catch(Exception e) {
		System.out.println("the number id facing a problem");
	}
	
}
}
