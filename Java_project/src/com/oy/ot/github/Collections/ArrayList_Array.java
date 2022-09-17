package com.oy.ot.github.Collections;
import java.util.*;
public class ArrayList_Array {
	public static void main(String[] args) {
		ArrayList<String> areray1=new ArrayList<String>(Arrays.asList("yallaiah","ramu","krishan","siddu"));
		Object arry2[]=areray1.toArray();
		System.out.println("the ");
		for(Object s:arry2) {
			System.out.println(s);
			
		}
		
	}

}
