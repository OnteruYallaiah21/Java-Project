package com.oy.ot.blogic.String_;

public class Sub_String {
	public static void main(String[] args) {
		String s="hello yallesh is how are u";
		System.out.println(s);
		System.out.println(s.substring(6));// prints the output from 6 th letter onwards
		System.out.println(s.substring(0, 5));// prints the in between letter
		String[] str=s.split(" ");
		//System.out.println(s.split("is"));
		for(String a:str)
			System.out.println(a);
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
			
	}

}
