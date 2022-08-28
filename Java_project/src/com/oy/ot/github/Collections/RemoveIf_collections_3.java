package com.oy.ot.github.Collections;
import java.util.*;
public class RemoveIf_collections_3 {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14));
		list.removeIf(numbers->numbers%2==0);// lamida expression
		System.out.println(list);
		ArrayList<Integer> sublist=new ArrayList<Integer>(list.subList(0, 5));
		System.out.println(sublist);
	}

}
