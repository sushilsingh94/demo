package com.demo.java.day8;

public class StudentC implements Comparable<StudentC>{
	
	private String name;
	private int age;
	
	public StudentC(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name:"+name+" Age:"+age;
	}

	@Override
	public int compareTo(StudentC o) {
		if(age > o.getAge()){
			return 1;
		}else if(age == o.getAge()){
			return 0;
		}else{
			return -1;
		}
	}

}
