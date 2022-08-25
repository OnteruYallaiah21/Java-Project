package com.oy.ot.github.Exercises;

public class String_count {
	public static void main(String[] args) {
		String str;int count=0;
		str="my name is yallaiah";
		System.out.println("the size oif string withgapa is "+str.length());
		char[] strArray = str.toCharArray();
		for (int i = 0; i < strArray.length; i++) {
			if(strArray[i] != ' ')
				count++;
			System.out.println(strArray[i]);
		}
		System.out.println("Count : "+count);
		
	}
	

}
