package com.oy.ot.github.Inheritance;

public class Mountainbike extends Bike {
	public int seatheight;
	    public Mountainbike(int gear,int speed,int starheight) {
	    	super(gear,speed);// when ever the arguments are pases to derived class there arguments are
	    	// automaticaly pass to the base class or parent class 
	    	// and we acess the methods of base class such as Applybrake ,Applyraise 
	    	this.seatheight=starheight;
	    	
	    }
	    public void setseatheight(int value) {
	    	System.out.println("the mountain bike speed is "+seatheight);
	    	
	    }

}
