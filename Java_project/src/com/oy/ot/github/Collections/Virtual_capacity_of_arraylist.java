package com.oy.ot.github.Collections;
import java.util.*;
public class Virtual_capacity_of_arraylist {
	public static void main(String[] args) {
		ArrayList<Object> virtual=new ArrayList<Object>();
		System.out.println(virtual.size());
		ArrayList<Integer> array=new ArrayList<Integer>(Arrays.asList(68,78,45));
		System.out.println(array);
		ArrayList<String> string=new ArrayList<String>(Arrays.asList("yallaiah","chiddu","teju"));
		System.out.println(string);
		for(int i=0;i<string.size();i++) {
			System.out.println(string.get(i));
		}
		for(String s:string) {
			System.out.println(s);
			
		}
		Iterator<String> it=string.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
