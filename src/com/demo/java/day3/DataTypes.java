package com.demo.java.day3;

public class DataTypes {
	
	static int a = 10;
	static long b = 20;
	
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		a = (int)b;
		System.out.println(a);
		
		b= a;
		
		
		int[] arr = new int[5]; //empty array
		
		int[] arr1 = {5,8,7,6};
		
		for(int i=0;i<arr1.length;i++){
			System.out.println(arr1[i]);
		}
		
		
		//multi dimensional array
		
		int[][] twoD = new int[3][3];
		
		/*1 2 3 
		  5 6 8 
		  7 8 9*/
		
		int[][] twoarr = {{1,2,3},{5,6,8},{7,8,9}};
		int counter = 0;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.println(twoarr[i][j]);
				
				/*twoarr[i][j] = counter;
				counter++;*/
			}
		}
		
		Employee.company = "HCL";
		Employee e1 = new Employee("Shraddha", 2323);
		Employee e2 = new Employee("Sushil", 23323);
		
		System.out.println(Employee.company);
		
		Employee.display();
		
	}
	
	
	

}
