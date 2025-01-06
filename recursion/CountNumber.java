package com.recursion;

import java.util.Scanner;

public class CountNumber {
	
	static int countnum(int num)
	{
		
		if(num==0)
		{
			return 0;
		}
		
		return 1+countnum(num/10);
		
		
	}

	public static void main(String[] args) {
    
		//5683 - 4
		//534 = 3
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:- ");
		int num = sc.nextInt();
		
		System.out.println(countnum(num));
	}

}
