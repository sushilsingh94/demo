package com.demo.java.day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSample {
	
	public static void main(String[] args) {
		/*List<Student> list = new ArrayList<Student>();
		
		list.add(new Student("sunil", 23));
		list.add(new Student("ajay", 44));
		list.add(new Student("ganesh", 44));
		list.add(new Student("deepak", 33));
		
		System.out.println("Before sort:");
		for (Student student : list) {
			System.out.println(student);
		}*/
		
		
		
		
		/*Collections.sort(list, new MyComp());
		System.out.println("After sort:");
		for (Student student : list) {
			System.out.println(student);
		}
		
		Collections.sort(list, new MyNameComp());
		System.out.println("After Name sort:");
		for (Student student : list) {
			System.out.println(student);
		}*/
		
		List<StudentC> listc = new ArrayList<StudentC>();
		
		listc.add(new StudentC("sunil", 23));
		listc.add(new StudentC("ajay", 44));
		listc.add(new StudentC("ganesh", 44));
		listc.add(new StudentC("deepak", 33));
		
		System.out.println("Before sort:");
		for (StudentC student : listc) {
			System.out.println(student);
		}
		
		Collections.sort(listc);
		System.out.println("After sort:");
		for (StudentC student : listc) {
			System.out.println(student);
		}
	}

}
