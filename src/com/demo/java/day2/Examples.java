package com.demo.java.day2;

public class Examples {
	
	public static void main(String[] args) {
		Vehicle v = new Bike();
		
		v.move();
		
		v = new Vehicle();
		v.move();
		
		
		Wheels w = new Bike(); 
		
		w.noOfWheels(2);
		
		w = new Car();
		
		w.noOfWheels(4);
		
		Bike b = new Bike();
		b.noOfWheels(2);
		
		Car c = new Car();
		c.noOfWheels(3);
		
		Seater s = new Bike();
		s.noOfSeats(2);
		
		s = new Car();
		s.noOfSeats(5);
	}

}
