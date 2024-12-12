package com.recursion;

import java.util.Scanner;

public class Factorial {
	
	public static int printFact(int num)
	{
		//base case
		if(num==0)
			return 1;
		//Small problem - recursive work
		// smallans = printFact(num-1);
		
		//big problem - self work
		//int ans = num*smallans;
		return num*printFact(num-1);
		
		//Time and space complexity = o(n) 
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num = sc.nextInt();
		int ans = printFact(num);
		System.out.println("Factorial of " +num+ " is:- "+ans);

	}

}
