package com.bit.array.bucketing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicate
{
	 public static int repeatedNumber(final List<Integer> a) {
		List<Integer> arr = new ArrayList<>(a); 
        int size = arr.size();
        for (int i = 0; i < size; i++){
        	int val = Math.abs(arr.get(i));
			if (arr.get(val) >= 0)
                arr.set(val ,  -arr.get(val));
            else
                return val;
        }
		return -1;         
    } 
 
    // Driver program 
    public static void main(String[] args) 
    {
 
    	int n =repeatedNumber(Arrays.asList(1, 2, 3, 4, 3, 6, 6));
    	System.out.println(n);
    }
}