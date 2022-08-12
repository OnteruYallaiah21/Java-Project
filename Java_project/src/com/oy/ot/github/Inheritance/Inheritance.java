package com.oy.ot.github.Inheritance;

public class Inheritance {
	public static void main(String[] args) {
		Mountainbike mountainbikeobj=new Mountainbike(2,78,20);// the values are automatically pass throgh the super keyword the base 
		// class if we pass arguments to child class
		System.out.println("the present speed of the bike is"+mountainbikeobj.speed);
		mountainbikeobj.Applybrake(7);
		
	}

}
