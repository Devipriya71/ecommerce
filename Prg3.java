package com.cts.jan26;

import java.util.Scanner;

public class Prg3 {

	public static void main(String[] args) {

		String name;
		int year = 0;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter your name:");
		
		while(!s.hasNext("[A-Za-z.!@#$%^&*]+"))
		{
			System.out.println("Please enter a valid name");
			s.next();
		}
		name=s.next();
		
		int c = 0;
		do {
			
			
		System.out.println("Enter your year of graduation:");
		
		try 
        { 
           
			year =s.next();
            c=0;
        }  
        catch (NumberFormatException e)  
        { 
            
        	System.out.println("Please enter a valid year"); 
            c++;
            
        } 
		}while(c!=0);
		
		System.out.println(name);
		System.out.println(year);
		
		

	}

}
