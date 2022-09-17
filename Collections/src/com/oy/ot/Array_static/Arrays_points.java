package com.oy.ot.Array_static;

public class Arrays_points {
	public static void main(String[] args) {
		short a=56;
		int a1=a;// 2)short can be converted to int type
  //--------int arry to short array------//
		short[] a2= {2,5,6,7,8};
		System.out.println(a2.getClass().getName());
		int[] a3= {7,8,4,35};
		System.out.println(a3.getClass().getName());
		String[] str= {"yallesh","ramu"};
		Object[] a4=str;// object array is capable of holding the string object array ehy because it is parent of string class
		System.out.println(a4.getClass().getName());
		Object[] obj= {56,"yallaesh",'g'};
		System.out.println(obj.getClass().getName());
		// short array object and int array object is completely defferent
		//int[] a3=a2;//1) short array object canot be converted to int array object
        //--byte-short-char-int-long-double	
		int a5 =4;
		int a6=8;
		a6=a5;// here a6 is assigned as a5 now a6 is ready to move garbage collection unused data automatically goes to garbge collection
		
  //---- anonymos class------------------------//
		//1) anynomous class does not have any name and reference it is used for only instanly for methpod arguments
		 Arrays_points memory=new  Arrays_points();
		memory.Annomoys_array(new int[] {2,7});
		for(Object obj1:obj) {
			System.out.println(obj1);
		}
		
		
	}
	public void Annomoys_array(int[] ano) {
		System.out.println("thius is anynomyos method ");
		int total=0;
		for(int a:ano) {
			total=total+a;
		}
		System.out.println("the sum of array elements are\t"+total);
	}

}
