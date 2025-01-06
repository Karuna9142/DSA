package com.practise;

public class LexographicOrder {
	
	static void sortFruits(String str[])
	{
		int n = str.length;
		for(int i = 0; i<n-1; i++)
		{
			int min_idx = i;
			for(int j = i+1; j<n; j++)
			{
				if(str[j].compareTo(str[min_idx])<0)
				{
					min_idx = j;
				}
			}
			//swap
			String temp = str[i];
			str[i] = str[min_idx];
			str[min_idx] = temp;
		}
	}

	public static void main(String[] args) {
		String str[] = {"kiwi", "apple", "papaya","mango"};
		sortFruits(str);
		
		for(String i:str)
		{
			System.out.println(i);
		}

	}

}
