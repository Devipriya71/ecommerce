package com.cts;

import java.util.Scanner;

public class Prg4 {

	public static void main(String[] args) {
		
		int limit;
		float[] array=new float[20];
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the limit of numbers:");
		//limit=Integer.parseInt(scanner.next());
		limit=scanner.nextInt();
		
		System.out.println("Enter Elements:");
		
		for(int i=0;i<limit;i++) {
			array[i]=scanner.nextFloat();
		}
		for(int i=0;i<limit;i++) {
			for(int j=i+1;j<limit;j++) {
				
			if(array[i]>array[j] )
			{
				float t=array[i];
				array[i]=array[j];
				array[j]=t;
			
			}
		}
	}
		
		for(int i=0;i<limit;i++) {
			System.out.println(array[i]);
		}

	}

}
