package com.recursion;

import java.util.ArrayList;

public class FindIndices {
	static void findAllIndices(int[]arr, int target, int idx)
	{
		if(idx>=arr.length) {
			return ;
		}
		if(arr[idx]==target) {
			System.out.print(idx+ ",");
		}
		findAllIndices(arr, target, idx+1);
	}
	//printing using arraylist
	static ArrayList<Integer> allIndices(int[]ar, int target, int idx)
	{
		//base case
		if(idx>=ar.length) {
			return new ArrayList<Integer> (); //return empty arraylist
		}
		ArrayList<Integer> ans =new ArrayList<>();
		if(ar[idx]==target) {
			ans.add(idx);
		}
		ArrayList<Integer>smallans =  allIndices(ar,target,idx+1);
			ans.addAll(smallans);
			return ans;
	}
	public static void main(String[] args) {
		
		int arr[] = {2,3,4,2,2,5};
		int target = 2;
		
		//findAllIndices(arr, target, 0);
		ArrayList<Integer> ans = allIndices(arr,target,0);
		for(Integer i:ans)
			System.out.println(i);
		

	}

}
