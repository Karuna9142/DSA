package com.recursion;

import java.util.Scanner;

public class RecursionDemo {
	static String removea(String s, int idx) {
		//constant time
		if(idx==s.length()) return "";
		
		//method call is always constant
		String smallAns = removea(s, idx+1);
		char currChar = s.charAt(idx);
		
		//constant
		if(currChar!='a')
		{
			//this is not constant it is o(n)
			return currChar+smallAns;
		}
		else
		{
			return smallAns;
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		
		System.out.println(removea(str,0));
		

	}

}
