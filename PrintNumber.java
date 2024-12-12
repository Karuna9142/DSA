package com.recursion;

import java.util.Scanner;

public class PrintNumber 
{
	public static void printDecreasing(int num)
	{
		//Base case
		if(num==1)
		{
			System.out.println(num);
			return;
		}
		//sm
		System.out.println(num);
		printDecreasing(num-1);
		
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		printDecreasing(num);

	}

}
