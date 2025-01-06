package com.recursion;

import java.util.ArrayList;

public class Subsequences {
	
	static ArrayList<String> getSSQ(String s) {
		ArrayList<String> ans = new ArrayList<>();
		
		if(s.length()==0) {
			ans.add("");
			return ans;
		}
		char curr = s.charAt(0);
		ArrayList<String> smallans = getSSQ(s.substring(1)); // ['bc','b','c']
		
		//ans = {'bc','b','c','','abc',
		for(String ss:smallans) {
			ans.add(ss);
			ans.add(curr+ss);
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ans = getSSQ("abc");
		for(String ss:ans) {
			System.out.println(ss);
		}

	}

}
