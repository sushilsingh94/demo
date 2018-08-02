package com.demo.java.day3;

public class Employee {
	
	private String name;
	private int id;
	public static String company;
	
	static{
		company = "TCS";
		System.out.println("static block:"+company);
	}
	
	public Employee(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	
	
	public static void display(){
		System.out.println("Hello"+company);
	}
	

}
