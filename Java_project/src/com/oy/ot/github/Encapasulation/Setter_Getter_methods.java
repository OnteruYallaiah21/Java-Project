package com.oy.ot.github.Encapasulation;
class Person{
	private String name;
	public void setName(String newname) {
		this.name=newname;
	}
	public String getName() {
		return name;
	}
	public void display() {
		System.out.println(name);
	}
}
public class Setter_Getter_methods {
	public static void main(String[] args) {
		Person memory=new Person();
		
		memory.setName("yallaiah");
		//System.out.println(memory.name); not visible
		System.out.println(memory.getName());
	     memory.display();
		
	}

}
