package com.searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	
	 public static int binarySearch(int[] array,int start,int end,int target) {
	        
	        while(start<=end) {
	            
	            int mid= start+ (end-start)/2;
	            
	            if(array[mid]==target) {
	                return mid;
	            }
	            
	            if(array[mid]<target) {
	                start=mid+1;
	            }
	            
	            if(array[mid]>target) {
	                end=mid;
	            }
	        }
	        
	    return -1;
	        
	    }

	    public static void main(String[] args) {
	        
	        int[] array= {3,4,5,6,7,8,9};
	        
	        int start=0;
	        
	        int end=array.length-1;
	        
	        int target=5;
	        
	        int res=binarySearch(array,start,end,target);
	        
	        System.out.println("Element 5 is present at:"+res);
	    }
}