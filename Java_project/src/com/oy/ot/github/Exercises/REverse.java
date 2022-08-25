package com.oy.ot.github.Exercises;

public class REverse {
	public static void main(String[] args) {
		int number=123,sum=0,i,remainder;
		while(number>0) {
			remainder=number%10;
			sum=sum*10+remainder;
			number=number/10;
			
			
		}
		System.out.println("the reverse of a nuner is "+sum);
	}

}
