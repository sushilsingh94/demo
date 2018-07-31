package com.demo.java.day2;

public class Car implements Wheels, Seater{

	@Override
	public void noOfWheels(int b) {
		System.out.println("No of Wheels in car:"+(b*2));
	}

	@Override
	public int noOfSeats(int a) {
		System.out.println("No of Seats in car:"+a);
		return a;
	}
	
	

}
