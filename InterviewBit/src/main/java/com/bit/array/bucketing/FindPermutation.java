package com.bit.array.bucketing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class FindPermutation {

	
	
	public static ArrayList<Integer> findPerm(final String A, int B) {
    
		ArrayList<Integer> al = new ArrayList<>();
		Stack<Integer> statck = new Stack<>();
		for(int  i=0;i<=A.length();i++) {
			statck.push(i+1);
			
			if(i==A.length() || A.charAt(i) == 'I' ) {
				while(!statck.isEmpty()) {
					al.add(statck.pop());
				}
			}
		}
		return al;
	}
	
	
	public static void main(String[] args) {
		int n=3;
		
		System.out.println(findPerm("ID", n));
		System.out.println(findPerm("IDD", n));
		System.out.println(findPerm("DDD", n));

	}

}
