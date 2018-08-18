package com.demo.java.day11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Serialization {
	
	public static void main(String[] args) {
		Person p1 = new Person("John", 30, "Male");
		Person p2 = new Person("Rachel", 31, "Female");
		
		try{
			File file = new File("C:/Users/Sushil/Desktop/fos.txt");
			System.out.println(file.getName());
			
			
			
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream o = new ObjectOutputStream(fos);
			
			o.writeObject(p1);
			o.writeObject(p2);
			
			o.close();
			fos.close();
			
			FileInputStream fis = new FileInputStream("C:/Users/Sushil/Desktop/fos.txt");
			ObjectInputStream oi = new ObjectInputStream(fis);
			
			List<Person> list = new ArrayList<>(); 
			while(fis.available() >0){
				Object obj = oi.readObject();
				list.add((Person)obj);
				System.out.println(obj);
			}
			
			System.out.println("list :"+list);
			/*Person pr1 = (Person)oi.readObject();
			Person pr2 = (Person) oi.readObject();
			
			System.out.println(pr1);
			System.out.println(pr2);*/
			
			oi.close();
			fis.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
