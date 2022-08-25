package com.oy.ot.github.Exercises;
import java.util.*;
public class Reverse_numnber {
	public static void main(String[] main) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number for finding reverse ");
		int number=input.nextInt();
		InnerREver memory=new InnerREver();
		memory.reverse(number);
		//memory.reverse();
	}
}
class InnerREver{
	int reverse(int number) {
		int reverse=0,reaminder;
		while(number>0) {
			int remainder = number%10;
			reverse=reverse*10+remainder;
			number=number/10;
		}
		System.out.println("the reverse bof a number is "+reverse);
		return reverse;
	}
	
}
