package com.recursion;

public class Multiplication {
	 static int multipliOfNum(int n1, int n2)
	{
		if(n2!=0)
			return n1*n2;
		return multipliOfNum(n1, n1*n2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 5;
		int n2 = 5;
		 int ans = multipliOfNum(n1, n2);
		 System.out.println(ans);

	}

}
