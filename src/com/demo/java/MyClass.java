package com.demo.java;

public class MyClass {

	public MyClass(int b){
		
	}
	
	
	private void displayValues(int a, int b){
		int c = a + b;
		
		System.out.println("Value of C:"+c);
	}
	
	
	public static void main(String[] args){
		MyClass my = new MyClass(10);
		my.displayValues(10, 20);
	}

}
