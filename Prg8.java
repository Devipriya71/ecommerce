package com.cts;
import java.util.Scanner;

public class Prg8 {
	       public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        int a,b,c,d score = 0;
	        
	        System.out.print("Are you ready for a quiz? ");
	       s.next();
	        System.out.println("start");
	        System.out.println();
	        System.out.println("Q1) What is the capital of Tamilnadu?");
	        System.out.println("\t1) banglore");//\t is used for  tab space
	        System.out.println("\t2) hyderabad");
	        System.out.println("\t3) chennai");
	        System.out.println();
	       
	        a = s.nextInt();
	        System.out.println();
	        if (a == 3) {
	            System.out.println("correct");
	            score++;
	        } else {
	            System.out.println("Sorry, answer is chennai.");
	        }
	        System.out.println();
	        System.out.println("Q2) Number of union territories in India?");
	        System.out.println("\t1) 5");
	        System.out.println("\t2) 9");
                        System.out.println("\t3) 6");
	        System.out.println();
	        
	       b = s.nextInt();
	        System.out.println();
	        if (b == 2) {
	            System.out.println("correct");
	            score++;
	        } else {
	            System.out.println("Sorry, 9 is the answer.");
	        }
	        System.out.println();
	        System.out.println("Q3) Which number is divisible by 13?");
	        System.out.println("\t1) 122");
	        System.out.println("\t2) 169");
	        System.out.println("\t3) 144");
	        System.out.println();
	        
	        c = s.nextInt();
	        System.out.println();
	        if (c == 2) {
	            System.out.println("That's correct!");
	            score++;
	        } else {
	            System.out.println("Sorry, 169 is the answer.");
	        }
	        
	        System.out.println();
	        System.out.println("How many planets in solarsyatem");
	        System.out.println("\t1)8");
	        System.out.println("\t2)4");
	        System.out.println("\t3)9");
	       
	        
	     d=s.nextInt();
			
	        if(d==3)
			{
				System.out.println("correct");
                                                                score++;
			}
			else
			{
				System.out.println("tSorry,9 is the answer");
		        
			}
			
	        System.out.println();
	        System.out.println("Overall, you got " + score + " out of 4 correct.");
	        
	    }
	}

