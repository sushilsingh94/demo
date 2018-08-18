package com.demo.java.day11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Streams {
	
	public static void main(String[] args) throws IOException {
		
		/*FileInputStream fis = new FileInputStream("C:/Users/Sushil/Desktop/file.txt");
		int i =0;
		fis.skip(10);
		while((i = fis.read()) != -1){
			System.out.print((char)i);
		}
		fis.close();
		
		
		FileReader fr = new FileReader("C:/Users/Sushil/Desktop/file.txt");
		int c = 0;
		while((c=fr.read())!= -1){
			System.out.print((char) c);
		}
		fr.close();*/
		
		
		FileWriter fw = new FileWriter("C:/Users/Sushil/Desktop/input.txt");
		String s = "Hello how are you";
		fw.write(s);
		fw.close();
		
		FileOutputStream fos = new FileOutputStream("C:/Users/Sushil/Desktop/inputfos.txt");
		String ss = "this is fileoutput stream";
		byte[] b = ss.getBytes();
		fos.write(b);
		fos.close();
	}

}
