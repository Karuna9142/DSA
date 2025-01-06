package com.recursion;

/* Recursion spell - 
1 Identify the smaller problem - Let recursion solve it
2.Self Work = do your work
3.Base Case = idntify problem for which answer is obvious
*/

import java.util.Scanner;

public class NaturalNumber {
	public static void printNum(int num)
	{
		if(num==1)
		{
			System.out.println(num);
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
