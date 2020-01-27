package com.cts;

import java.util.Scanner;

public class Prg7 {
	
	public static void main(String args[]){
		String string,reverse="";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		string=s.next();
		int length=string.length();
		for(int i=length-1;i>=0;i--){
			reverse=reverse+string.charAt(i);
		}
		if(string.equals(reverse))
		{
			System.out.println(string+" is a pallindrome. ");
		}
		else{
			System.out.println(string+ " not a pallindrome");
		}
	}

}
