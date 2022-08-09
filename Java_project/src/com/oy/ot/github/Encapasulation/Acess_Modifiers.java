package com.oy.ot.github.Encapasulation;

public class Acess_Modifiers {
	public int age=23;
	 String str="yallesh";
	 
	public static void main(String[] args) {
	     
	System.out.println(" modifier                        public proteted default   private");
	System.out.println(" same class                      YES    YES      YES       YES ");
	System.out.println(" same_package_sub_class          YES    YES      YES       NO  ");
	System.out.println(" same_package_non_sub_class      YES    YES      YES       No");
	System.out.println(" defferent_package_subclass      YES    YES      No        No");
	System.out.println(" defferent_package_non_subclass  YES    NO       No        No");
	System.out.println("the sub class means derived class or child class");
	}
}
