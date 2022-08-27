package com.oy.ot.teststring;

public class Particularcharcount {
	public static void main(String[] args) {
		int count = 0;
		String str="yallaiah is very going to tour";
		for(int i=0;i<=str.length()-1;i++) {
			if(str.charAt(i)=='t') {
				count++;
			}
				
		}
		System.out.println("the letter t is reapeated to "+count);
	}

}
