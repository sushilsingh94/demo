package com.demo.java.day2;

public class Bike extends Vehicle implements Wheels, Seater{
	
	
	public int noOfWheels(){
		return 0;
	}
	
	@Override
	public void move(){
		System.out.println("Bike is moving");
	}
	
	public void add(int a, int b){
		System.out.println("int sum:"+(a+b));
	}
	
	public void add(int a, int b, int c){
		System.out.println("int3 sum:"+(a+b+c));
	}
	
	public void add(int a, char b){
		System.out.println("char sum:"+(a+b));
	}
	
	public static void main(String[] args) {
		Bike b = new Bike();
		
		b.add(1, 2);
		System.out.println((int)'a');
		b.add(3, 'a');
		b.add(1, 3, 4);
	}

	@Override
	public int noOfSeats(int a) {
		System.out.println("Bike Seats:"+(a*5));
		return a;
	}

	@Override
	public void noOfWheels(int b) {
		System.out.println("Bike Wheels:"+(b*5));
		
	}

}
