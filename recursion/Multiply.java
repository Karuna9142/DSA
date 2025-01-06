package com.recursion;

import java.util.Scanner;

public class Multiply {

	//Time Complexity = O(k)
	static void printMulti(int n, int k)
	{
		if(k==1)
		{
			System.out.println(n);
			return;
		}
		printMulti(n, k-1);
		System.out.println(n*k);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers");
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		printMulti(n,k);

	}

}
