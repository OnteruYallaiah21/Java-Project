package com.oy.ot.github.Inheritance;

public class Bike {
	protected int gear;
	protected int speed;
	public Bike(int gear,int speed) {
		// constuctor does not have any return type
		this.gear=gear;
		this.speed=speed;
	}
	public void Applybrake(int brake) {
		speed-=brake;
		System.out.println("THE CURRENT SPEED OF BIKE IS "+speed);
	}
	public void Speedup(int raise) {
		speed+=raise;
	}
	public static void main(String[] args) {
		Bike obj=new Bike(5,79);
		obj.Applybrake(8);
	}
	

}
