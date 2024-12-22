package com.recursion;

import java.util.Scanner;

public class GcdEx1 {
	
	static int igcd(int x, int y)
	{
		while(x%y!=0)
		{
			int rem  = x%y;
			x = y;
			y = rem;
		}
		return y;
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two number");
		
		int x = sc.nextInt();
		int y = sc.nextInt();

		System.out.println("Gcd of these numbers are: - "+igcd(x,y));
	}

}
