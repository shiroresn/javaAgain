package com.first.basics;

import java.util.Scanner;

public class Palindrome {
	
	//Write a program to find all pallindromes between two numbers
	
	public static void main(String[] args) {
		int n1,n2;
		Scanner sc = new Scanner(System.in);
		do
		{	
			System.out.println("Enter Number 1 : ");
			n1 = sc.nextInt();
			System.out.println("Enter Number 2 : ");
			n2 = sc.nextInt();
			if(!(n1<n2))
			{
				System.out.println("Please enter Number 1 less than Number");
			}
		}while(!(n1<n2));
		
		for(int i=n1;i<n2;i++)
		{
			int lengthOfArray=Integer.toString(i).length();
			String stringOfI = Integer.toString(i);
			int counter=0;
			for(int p=0,q=lengthOfArray-1;p<lengthOfArray/2;p++,q--)
			{
				if(stringOfI.charAt(p)!=stringOfI.charAt(q))
				{
					break;
				}
				else
				{
					counter++;
					if(counter==lengthOfArray/2)
					{
						System.out.println(i);
					}
				}
			}
		}
	}

}
