package com.recursion;

import java.util.Scanner;

public class FibonacciSeries 
{
	public static int fib(int n)
	{
		//base case
		if(n==0 || n==1)
			return n;
		//subproblem
//		int prev = fib(n-1);
//		int prePrev = fib(n-2);
		
		//int ans = prev + prePrev;
		return fib(n-1) + fib(n-2);
		//Time Complexity = O(2n)
        //space complexity = O(n)		
	}
public static void main(String[]args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int num =sc.nextInt();
	for(int i = 0; i<=num; i++)
	{
		System.out.println(fib(i));
	}
}
}
