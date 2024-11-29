package com.searching;

import java.util.Arrays;

public class BinarySearchEx {

	public static void main(String[] args) {
		
		int arr[] = {3,2,4,5,6,7,8,1};
		
		Arrays.sort(arr);
		System.out.println("The given array is");
		
		for(int i = 0; i<arr.length; i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		
		int len = Arrays.binarySearch(arr, 7);
		System.out.println("Element is found at index "+len);
		
		

	}

}
