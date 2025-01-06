package com.recursion;

import java.util.Scanner;

public class SumOfDigit {
	
	static int sod(int n)
	{
		//base case
		if(n>=0 && n<=9)
			return n;
		return sod(n/10)+n%10;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:- ");
		int num = sc.nextInt();
		
		System.out.println(sod(num));
		

	}

}
