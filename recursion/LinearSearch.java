package com.recursion;

public class LinearSearch {
	
	static boolean search(int[]arr, int target,int idx)
	{
		//base case
		if(idx>=arr.length)
			return false;
		
		//self work
		if(arr[idx]==target) return true;
		//recursive work
		return search(arr, target, idx+1);
	}
	static int findIdx(int[]arr, int target,int idx)
	{
		if(idx>=arr.length)
		{
			return -1;
		}
		//self work
		if(arr[idx]==target) return idx;
		return findIdx(arr, target, idx+1);
	}
	public static void main(String[] args) {
		
		int arr[] = {2,4,5,6,7,8,9,3};
		int target = 6;
		
		System.out.println("Is element found??" +search(arr,target,0));
		System.out.println(target+ " found at index:- "+findIdx(arr,target, 0));
		
		

	}

}
