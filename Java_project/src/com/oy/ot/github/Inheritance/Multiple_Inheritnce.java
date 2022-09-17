package com.oy.ot.github.Inheritance;
interface First_Interface{
	public void show1();
	public void run();
}
interface Second_Interface{
	public void talking();
}
class Person implements First_Interface,Second_Interface{
	@Override
	public void show1() {
		System.out.println("this metho is from the first interface");
	}
	@Override
	public void talking() {
		System.out.println("the allaiah is talking from the second interface");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("the run method from the first interface");
		
	}
	}
	
public class Multiple_Inheritnce {
	public static void main(String[] args) {
		Person memory=new Person();
		memory.talking();
		
	}

}
