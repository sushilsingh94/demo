package com.demo.java.day5;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DemoException {
	
	public void getSum(int a, int b) throws CustomException{
		System.out.println(a +b);
		
		getDivision(a, b);
	}
	
	public void getDivision(int a, int b) throws CustomException{
		int value = 0;
		try{
			value = a/b;
		}catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println("Exception :"+e.getMessage());
			throw new CustomException("Error due to division by Zero", e);
		}
		System.out.println(value);
	}
	
	public static void main(String[] args) throws Exception{
		DemoException d = new DemoException();
		
		d.getSum(5, 0);
	}

}
