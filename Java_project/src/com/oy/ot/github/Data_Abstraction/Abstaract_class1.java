package com.oy.ot.github.Data_Abstraction;
abstract class shape{
	String colour;
	// these are abstaract methos these are not implemented the abstract method have return types
	// but constructor does'not have any return types it only used for instantiate the object
	abstract String color();
	abstract double area();
	public void display() {
		System.out.println("this method is from abstract class");
	}
	
}
class Rectangle extends shape{
	public double area() {
		System.out.println("this method is inherited from the shape class");
		return 3.76;
	}

	@Override
	String color() {
		// TODO Auto-generated method stub
		return "red";
	}
}

public class Abstaract_class1 {
	public static void main(String[] args) {
		Rectangle memory=new Rectangle();
		memory.area();
		System.out.println(memory.color());
		
		
		
	}

}
