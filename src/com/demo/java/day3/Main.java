package com.demo.java.day3;


public class Main {
	
	public static void main(String[] args) {
		
		//
		
		MyClass.NestedClass p = new MyClass.NestedClass();
		
		p.display();
		
		//MyClass m = new MyClass();
		
		MyClass.InnerClass i = new MyClass().new InnerClass();
		i.print();
	}

}
