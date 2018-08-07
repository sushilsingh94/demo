package com.demo.java.day6;

public class GenericMethod {
	
	public static <E> E printValue(E e){
		return e;
	}
	
	public static void print(String e){
		System.out.println(e);
	}

	public static void main(String[] args) {
		GenericMethod gm = new GenericMethod();
		
		gm.print("");
		String i = gm.printValue("hell");
		int t = gm.printValue(123);
	}
}
