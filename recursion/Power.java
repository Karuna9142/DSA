package com.recursion;

import java.util.Scanner;

public class Power {
	static int pow(int p, int q)
	{
		//Base case
		if(q==0)
			return 1;
		//recursive work
		//int smallans = pow(p,q-1);
		
		//Self work
		return pow(p,q-1)*p;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:- ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		System.out.println(pow(a,b));

	}

}
