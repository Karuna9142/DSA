package com.recursion;

public class SubsetSum {

	static void subsetSum(int[]a, int n, int idx, int sum)
	{
		if(idx>=n) {
			System.out.println(sum);
			return;
		}
		//curr= idx+sum
		subsetSum(a,n, idx+1, sum+a[idx]);
		subsetSum(a,n, idx+1, sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,4,5};
		subsetSum(a,a.length,0,0);

	}

}
