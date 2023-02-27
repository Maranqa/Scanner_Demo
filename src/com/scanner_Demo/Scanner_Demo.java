package com.scanner_Demo;
import java.util.Scanner;
public class Scanner_Demo { 



	
//		System.out.println("Enter your name");
//		Scanner s = new Scanner(System.in);
//		s.next();
//		System.out.println("Enter your name");
//		Scanner y = new Scanner(System.in);
//		y.nextLine();
//		System.out.println("enter your age");
//		Scanner s1 = new Scanner(System.in);
//		s1.nextInt();
	public static void main(String[] args)
	{

		
		System.out.println("enter your Tamil marks:");
		Scanner s = new Scanner(System.in);
		int a =s.nextInt();
        System.out.println("Enter your English marks");
		int b=s.nextInt();
		System.out.println("Enter your Maths Marks");
		int c=s.nextInt();
		System.out.println("Enter your Science Marks");
        int d=s.nextInt();
		System.out.println("Enter your Social science Marks");
        int e =s.nextInt();
		int total;
		total=a+b+c+d+e;
		System.out.println("total marks are:"+total);
		float average=total/5;
		System.out.println("average marks:"+average);
	
	}		
}	
		
		
		
		
//		System.out.println("Enter your bank balance");
//		Scanner s2 =new Scanner(System.in);
//		s2.nextFloat();
//		System.out.println("Enter your refernce letter");
//		Scanner s3 = new Scanner(System.in);
//		s3.next().charAt(0);
//		
	



