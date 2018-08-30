package com.bit.array.bucketing;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class LargestNumber {

	
	public static String largestNumber(final List<Integer> A) {

		Collections.sort(A, new Comparator<Integer>() {
			@Override
			public int compare(Integer X, Integer Y) {
				String XY = "" + X + Y;
				String YX = "" + Y + X;
				return XY.compareTo(YX) > 0 ? -1 : 1;
			}
		});

		StringBuilder sb = new StringBuilder();
		
		boolean isstartingZero = true;
		for (Integer i : A) {
			if(i !=0) {
				isstartingZero = false;
			}
			if(!isstartingZero) {
				sb.append(i);
			}
		}
		return sb.toString().isEmpty() ?"0":sb.toString();
	}
	
	
	
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(3, 30, 34, 5, 9);
		String s = largestNumber(l);
		System.out.println(s);
		
		List<Integer> l1 = Arrays.asList(0,0,0);
		String s1 = largestNumber(l1);
		System.out.println(s1);
	}

}
