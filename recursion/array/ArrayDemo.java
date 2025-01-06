package com.recursion.array;

public class ArrayDemo {
	static void printArray(int arr[], int idx)
	{
		// base case
		if(idx==arr.length)
		{
			return;
		}
		//self work
		System.out.println(arr[idx]);
		//
		printArray(arr,idx+1);
	}

	public static void main(String[] args) {
	 
		int arr[] = {2,4,5,6,7,8};
		
		int idx = 0;
		printArray(arr,idx);

	}

}
