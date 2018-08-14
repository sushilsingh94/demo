package com.demo.java.day9;

public class Employee {
	
	private String name;
	private int salary;
	
	public Employee(String name, int sal){
		this.name = name;
		this.salary = sal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	@Override
	public String toString() {
		return "Employee-Name:"+name+" Salary:"+salary;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == this) return true;
		if(!(obj instanceof Employee)){
			return false;
		}
		
		Employee e = (Employee) obj;
		
		return e.name.equals(this.name) && e.salary == this.salary;
	}
	
	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result + name.hashCode();
		result = 31 * result + salary;
		return result;
	}
}
