package com.bit.array.bucketing;

import java.util.Arrays;
import java.util.List;



public class MaxSumContSubArray {
	
    public static int maxSubArray(final List<Integer> A) {

    	int maxSumTillNow = A.get(0);
    	int currentSum = A.get(0);
    	
		for (int i = 1; i < A.size(); i++) {
			currentSum = Math.max(A.get(i), currentSum+A.get(i));
			maxSumTillNow = Math.max(maxSumTillNow, currentSum);
		}
    	return maxSumTillNow;
    }
    
    
    public static void main(String[] args) {
    	int s = maxSubArray(Arrays.asList(2,5,-1,-3,5));
    	System.out.println(s);
    }
}