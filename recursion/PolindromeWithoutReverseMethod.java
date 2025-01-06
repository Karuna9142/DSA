package com.recursion;

import java.util.Scanner;

public class PolindromeWithoutReverseMethod {

	static boolean ispalindrome(String s , int l, int r)
	{
		if(l>=r) return true;
		return (s.charAt(l)==s.charAt(r)&& ispalindrome(s, l+1, r+1));
				
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String- ");
		
		String str = sc.nextLine();
		System.out.println(ispalindrome(str,0,0));
		
	}
}
