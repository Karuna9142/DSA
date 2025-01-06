package com.recursion;

import java.util.Scanner;

public class RemoveOccurrences {

	static String removea(String s, int idx) {
		//base case
		if(idx==s.length()) return "";
		
		//recursive work
		String smallAns = removea(s, idx+1);
		char currChar = s.charAt(idx);
		
		//self work
		if(currChar!='a') {
			return currChar +smallAns;
		}
		else {
			return smallAns;
		}
		
		}
	static String removea2(String s) {
		if(s.length()==0) return "";
		String smallAns = removea2(s.substring(1));
		char currChar = s.charAt(0);
		if(currChar!='a') {
			return currChar +smallAns;
		}
		else {
			return smallAns;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String:-");
		String s = sc.nextLine();
		
		
		System.out.println(removea(s,0));
		

	}

}
