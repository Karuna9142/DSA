package com.recursion.array;

public class SumOfArray {

	static int sumArray(int arr[], int idx)
	{
		//base case
		if(idx==arr.length-1)
		{
			return arr[idx];
		}
		//small problem
		int ans = sumArray(arr,idx+1);
		//self work
		return(arr[idx]+ans);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,4,5,6};
		int idx = 0;
		
		int ans = sumArray(arr,idx);
		System.out.println("Sum of array is:- "+ans);
		

	}

}
