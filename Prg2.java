package com.cts;
import java.util.Scanner;
public class Prg2 {
	
	public static void main(String[] args) {
		int limit,flag=0,location=0;
		int[] array=new int[20];
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the limit of numbers:");
		
		limit=scanner.nextInt();
		
		System.out.println("Enter Elements:");
		
		for(int i=0;i<limit;i++) {
			array[i]=scanner.nextInt();
		}
		for(int i=0;i<limit;i++) {
			for(int j=i+1;j<limit;j++) {
				
			if(array[i]>array[j] )
			{
				int t=array[i];
				array[i]=array[j];
				array[j]=t;
			
			}
		}
	}
		
		for(int i=0;i<limit;i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("The minimum value is "+array[0]);
		System.out.println("The maximum value is "+array[limit-1]);
		
		System.out.println("Enter the array index to be deleted");
		int arrayIndex=scanner.nextInt();
		for(int i = 0;i<limit;i++)
		{
			if(i==arrayIndex)
			{
				flag=1;
				location = i;
				break;
				
				
			}
			else
			{
				flag=0;
			}
		}
		if(flag==1) {
		for(int i=location+1;i<limit;i++)
		{
			array[i-1]=array[i];
			
		}
		System.out.println("After Deletion:");
		for(int i=0;i<limit-1;i++)
		{
			System.out.println(array[i]);
			
		}
		}
		else {
			System.out.println("Array index not found");
		}
		
		
		
		
		
		
	}

}
