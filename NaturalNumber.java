package com.recursion;

import java.util.Scanner;

public class NaturalNumber {
	public static void printNum(int num)
	{
		if(num==0)
		{
			//System.out.println(num);
			return;
		}
		printNum(num-1);
		System.out.println(num);
	}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Number");
	int n = sc.nextInt();
	
	printNum(n);
		

	}

}
