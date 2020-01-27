package com.cts.jan26;

import java.util.Scanner;

public class Prg5 {
	public static void main(String args[]) {
	
	String string;
	int i,j;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the string");
	string=scan.nextLine();
	// System.out.println(string);
	for(i=0;i<string.length();i++)
	{
		if(string.substring(i).startsWith(" ")||i==0){
			
			for(j=i+1;j<=string.length();j++)
			{
				if(string.substring(j).startsWith(" ")||j==string.length())
				{
					System.out.println(string.substring(i,j));
					i=j;
				}
				
			}
		}
	}
	}
}


