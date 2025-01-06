package com.recursion.array;

//Time Complexity and Space complexity = o(n)
public class MaxValue {
	
	static int printMax(int arr[], int idx)
	{
		//base case
		if(idx==arr.length-1)
		{
			return arr[idx];
		}
		//small problem --> idx+1
		int smallAns = printMax(arr, idx+1);
		//Self work
		return Math.max(arr[idx], smallAns);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {41,54,6,3,8,12};
		int idx = 0;
		
		int ans = printMax(arr,idx);
		System.out.println("The maximum number is:- "+ans);

	}

}
