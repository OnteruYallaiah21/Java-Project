package com.oy.ot.github.Collections;
import java.util.*;
public class aRRA_LIST_2 {
	public static void main(String[] args) {
		ArrayList<String> array=new ArrayList<String>(Arrays.asList("yallaia","chiddu","renu","pavan"));
		ArrayList<String> array1=new ArrayList<String>();
		array1.add("python");
		array.add("java");
		array.add("ai");
	   array.addAll(array1);
	   System.out.println(array);
	   for(String s:array) {
		   System.out.println(s);
	   }
	   for(int i=0;i<array.size();i++) {
		   System.out.println(array.get(i));	   

	   }
	   Iterator<String> it=array.iterator();
	   while(it.hasNext()) {
		   System.out.println(it.next());
	   }
	}

}
