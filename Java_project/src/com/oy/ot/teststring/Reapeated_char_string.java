package com.oy.ot.teststring;

public class Reapeated_char_string {
	public static void main(String[] args) {
		int count=0;
		String str=("my name is yallaiah i am from ummadivaram");
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
				}
			}
			System.out.println("the chacter is\t=>"+str.charAt(i)+"<=\trepeated to\t=>"+count);
			count=0;
		}
	}

}
