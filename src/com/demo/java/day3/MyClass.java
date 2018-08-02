package com.demo.java.day3;

public class MyClass {
	
	public void displayMain(){
		System.out.println("MyClass");
	}
	
	public static class NestedClass{
		public void display(){
			System.out.println("nestedclass");
		}
	}
	
	public class InnerClass{
		public void print(){
			System.out.println("InnerClass");
		}
	}

}
