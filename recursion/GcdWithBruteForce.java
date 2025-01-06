package com.recursion;

import java.util.Scanner;

public class GcdWithBruteForce {
	
	 static int gcd(int n1, int n2)
	{
		if(n2==0)
		{
			return n1;
		}
		else
		{
			return gcd(n2,(n1%n2));
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first  and second number");
		int num = sc.nextInt();
		int num1 = sc.nextInt();
		
		int ans = gcd(num, num1);
		System.out.println("Gcd of " +num+ " and " +num1+ " is :- "+ans);

	}

}
