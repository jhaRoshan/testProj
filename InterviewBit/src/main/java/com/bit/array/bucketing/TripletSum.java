package com.bit.array.bucketing;

import java.util.Arrays;
import java.util.List;

public class TripletSum {

	public static int solve(List<String> array) {
		if (array.size() < 3)
			return 0;

		double a = Double.parseDouble(array.get(0));
		double b = Double.parseDouble(array.get(1));
		double c = Double.parseDouble(array.get(2));

		for (int i = 3; i < array.size(); i++) {
			if ((a + b + c) > 1 && (a + b + c) < 2) {
				return 1;
			}
			double n = Double.parseDouble(array.get(i));

			if ((a + b + c) >= 2) {
				if (a > b && a > c) {
					a = n;
				} else if (b > c) {
					b = n;
				} else {
					c = n;
				}
			} else {
				if (a < b && a < c) {
					a = n;
				} else if (b < c) {
					b = n;
				} else {
					c = n;
				}
			}
		}

		if ((a + b + c) > 1 && (a + b + c) < 2) {
			return 1;
		}

		return 0;
	}
	
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList( "0.843965", "0.929296", "1.525570", "1.469064", "1.318529", "1.207967", "1.294448", "1.145449", "1.767975", "1.008212");
		
		System.out.println(solve(list));
	}

}
