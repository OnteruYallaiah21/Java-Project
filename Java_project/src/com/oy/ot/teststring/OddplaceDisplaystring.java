package com.oy.ot.teststring;

public class OddplaceDisplaystring {
	public static void main(String[] args) {
		String str="yallesh onteru";
		for(int i=0;i<str.length();i++) {
			if(i%2==0) {
				System.out.println("the char is placed in string accordiing to index\t=>"+str.charAt(i));
				
			}
		}
		
	}
	

}
