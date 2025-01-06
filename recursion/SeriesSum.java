package com.recursion;

import java.util.Scanner;

//Time Complexity = O(n)
public class SeriesSum {
	
	static int series(int n)
	{
		if(n==0)
			return 0;
		if(n%2==0)
		{
			return series(n-1)-n;
		}
		else
		{
			return series(n-1)+n;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		int res = series(n);
		System.out.println(res);

	}

}
