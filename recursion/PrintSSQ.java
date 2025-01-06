package com.recursion;

import java.util.Scanner;

public class PrintSSQ {

	static void printSSQ(String s, String currAns) {
		if(s.length()==0) {
			System.out.println(currAns);
		    return;
		}
		char curr = s.charAt(0);
		String remString = s.substring(1);
		
		//Curr char --> chooses to be a part of currAns
		printSSQ(remString, currAns+curr); //add curr
		printSSQ(remString, currAns); //do not add curr
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string");
		String str = sc.nextLine();
		
		printSSQ(str, "");

	}

}
