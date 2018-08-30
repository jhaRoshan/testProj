package com.bit.array.bucketing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumAbsolutDifference {

	public static int maxArr(List<Integer> A) {
		
		int max1 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min2 = Integer.MAX_VALUE;
 
        for (int i = 0; i < A.size(); i++)
        {
            max1 = Math.max(max1, A.get(i) + i);
            min1 = Math.min(min1, A.get(i) + i);
            max2 = Math.max(max2, A.get(i) - i);
            min2 = Math.min(min2, A.get(i) - i);
        }
        return Math.max(max1 - min1, max2 - min2);
	}

	public static void main(String[] args) {

		List<Integer> arr = Arrays.asList(55, -8, 43, 52, 8, 59, -91, -79, -18, -94);
		int v = maxArr(arr);
		System.out.println(v);
		
	}

}
