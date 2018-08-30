package com.bit.array.bucketing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NextPermutation {

	
	public static void nextPermutation(ArrayList<Integer> a) {
		int i = -1;
		int j=-1;
		
		for(int k=a.size()-1;k > 0;k--) {
			if(a.get(k) > a.get(k-1)) {
				i = k-1;
				break;
			}
		}
		extract(a, i, j);
		if(i == -1) {
			Collections.sort(a);
		}
		
		
	}

	private static void extract(ArrayList<Integer> a, int i, int j) {
		if(i != -1) {
			for(int k=a.size()-1;k > i;k--) {
				if(a.get(k) > a.get(i)) {
					j = k;
					break;
				}
			}
		}
		
		if(i >=0 && j>=0) {
			swap(a, i,j);
		}
		
		int m = i+1;
		int n = a.size()-1;
		
		while(m<=n) {
			swap(a,m,n);
			m++;
			n--;
		}
	}
	
	private static void swap(ArrayList<Integer> a, int i, int j) {
		int iVal = a.get(i);
		a.set(i, a.get(j));
		a.set(j, iVal);
	}

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(2);
		l.add(3);
		l.add(1);
		
//		319, 695, 52
		nextPermutation(l);
		System.out.println(l);
	}

}
