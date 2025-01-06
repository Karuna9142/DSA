package com.recursion;

public class OptimizedBubbleSort {
	
	static void bubbleSort(int a[]) {
		int n = a.length; //length of the array
		
		for(int i = 0; i<n-1; i++)
		{
			boolean swapped = false; // if array is sorted then no swapping required
			for(int j = 0; j<n-i-1; j++)
			{
				//comparing the pair of elements
				if(a[j]>a[j+1]) {
					//swapping a[j+1] and a[j]
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					//swapping happened so change to true
					swapped = true;
					
					//if no swaps happened in any of the iteration
					//array has become sorted so stop with the passes
					if(swapped==false)
						break;
					
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,8,7};
		bubbleSort(arr);
		
		for(int i:arr) {
			System.out.println(i);
		}

	}

}
