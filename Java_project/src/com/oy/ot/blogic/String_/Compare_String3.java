package com.oy.ot.blogic.String_;

public class Compare_String3 {
	public static void main(String[] args) {
		Compare memory= new Compare();
		//System.out.println(s.equals(s1)));
		memory.compare1();
		
	}

}
class Compare{
	void compare1() {
		String s="yallaiah";
		String s1="Yallaiah";
		String  s2="yallaiah is good boy";
		System.out.println("equals methd"+s.equals(s1));
		System.out.println("equals"+s.equalsIgnoreCase(s1));
		System.out.println(s.compareTo(s2));
		System.out.println(s.compareTo(s1));
		System.out.println(s==s2);
		String s3=30+50+"strinh"+40+40;
		String s4=s3.concat(s);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s.toUpperCase());
		System.out.println(s1.toLowerCase());



		
	}
}
