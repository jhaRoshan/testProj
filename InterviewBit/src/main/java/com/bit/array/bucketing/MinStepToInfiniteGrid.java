package com.bit.array.bucketing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinStepToInfiniteGrid {
	
	public static int coverPoints(List<Integer> A, List<Integer> B) {
	
		int count = 0;
		for(int i=0;i<A.size()-1;i++) {
			int a = Math.abs(A.get(i+1) - A.get(i));
			int b = Math.abs(B.get(i+1) - B.get(i));
			int max = Math.max(a, b);
			count+=max;
		}
		return count;
	}
	
	public static void main(String[] args) {
    	List<Integer> a = Arrays.asList( -7, -13);
    	List<Integer> b = Arrays.asList(1, -5);
    	
    	int s = coverPoints(a, b);
    	System.out.println(s);
    	
    }
	
	
}