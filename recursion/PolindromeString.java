package com.recursion;

import java.util.Scanner;

public class PolindromeString {
	
	static String checkPolindrome(String str, int idx)
	{
		if(idx==str.length()) return"";
		String smallans = checkPolindrome(str,idx+1);
		return smallans+str.charAt(idx);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		
		String str  = sc.nextLine();
		String rev = checkPolindrome(str,0);
		if(rev.equals(str))
		{
			System.out.println("It is polindrome");
		}
		else
		{
			System.out.println("not polindrome");
		}
		
	}

}
