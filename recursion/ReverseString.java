package com.recursion;

import java.util.Scanner;

public class ReverseString {
	
	static String reverse(String str, int idx) {
		
		if(idx==str.length()) return"";
		String smallans = reverse(str,idx+1);
		return smallans+str.charAt(idx);
	}
 static String reverse1(String str)
 {
	 if(str.length()==0) return "";
	 String ans = reverse1(str.substring(1));
	 return ans+str.charAt(0);
 }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		
		//System.out.println(reverse(str,0));
		System.out.println(reverse1(str));

	}

}
