package com.practise;

public class MoveZeros {
	static void move(int arr[])
	{
		int n = arr.length;
		for(int i = 0; i<n-1; i++)
		{
			for(int j = 0; j<n-i-1; j++)
			{
				if(arr[j]==0 && arr[j+1]!=0)
				{
					//swap arr[j], arr[j+1]
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]arr = {0,5,0,3,4,2};
		System.out.println("Before Sorting");
		for(int i:arr)
		{
			System.out.println(i);
		}
		System.out.println("After Sorting");
		move(arr);
		for(int i:arr)
		{
			System.out.println(i);
		}
		
		
	}

}
