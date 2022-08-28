package com.oy.ot.github.Collections;
import java.util.*;
public class Array_List1 {
	public static void main(String[] args) {
		int[] array=new int[5];//n+1 size static array
		array[0]=100;
		System.out.println(array[0]);
		System.out.println(array[2]);// garbage value
		// for dynamic array memory allocation
		ArrayList<Integer> Array=new ArrayList<Integer>();// genaric array list
		Array.add(3);
		Array.add(199);
		Array.add(199);
		Array.add(199);
		Array.add(199);
		ArrayList array1=new ArrayList();// non genaric arraylist raw tpe we can store the values of all data types
		array1.add("yallaiah");
		array1.add('g');
		array1.add(8.774646);
		System.out.println(array1.size());
		System.out.println(array1.get(1));


	}

}
