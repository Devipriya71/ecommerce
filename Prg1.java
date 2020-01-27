package com.cts;

import java.util.Scanner;

public class Graduation {

	public static void main(String[] args) {
		
		String name;
		int year;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter your name:");
		name=s.next();
		
		System.out.println("Enter your year of graduation:");
		year =s.next();
		
		System.out.println("My name is "+name+". And I will graduate in "+year+".");
		
		

	}

}
