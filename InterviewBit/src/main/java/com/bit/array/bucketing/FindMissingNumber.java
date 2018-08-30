package com.bit.array.bucketing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingNumber {
	
	
	public ArrayList<Integer> repeatedNumber(final List<Integer> a) {
	    int arraySize = a.size();
	    long sumOfNumbers = getSumOfNumbers(arraySize);
	    long sumOfSquares = getSumOfSquares(arraySize);
	    long differenceNumber =  getDifferenceofNumbers(a,sumOfNumbers);
	    long differenceSquare = getDifferenceofSquares(a,sumOfSquares);
	    long sumNumber =  differenceSquare/differenceNumber;
	    int repeatedNumber = (int)((sumNumber+differenceNumber)/2);
	    int missingNumber = (int)(sumNumber-repeatedNumber);
	    ArrayList<Integer> result = new ArrayList<>();
	    result.add(repeatedNumber);
	    result.add(missingNumber);
	    return result;
	}
	
	private long getDifferenceofNumbers(List<Integer> a,long sumOfNumbers){
	    long sum = sumOfNumbers*-1;
	    for(Integer number:a){
	        long num = (long)number;
	        sum+=num;;
	    }
	    return sum;
	}
	
	private long getDifferenceofSquares(List<Integer> a, long sumOfSquares){
	    long sumSquares = sumOfSquares*-1;
	    for(Integer number:a){
	         long num = (long)number;
	        sumSquares+=(num*num);
	    }
	    return sumSquares;
	}
	
	private long getSumOfNumbers(double n){
	    return (long)(n*(n-1)/2+n);
	}
	
	private long getSumOfSquares(double n){
	    return (long)(n*(n+1)*(2*n+1)/6);
	}

}













//
//long n = A.size();
//
//long sum = 0;//repeated
//long diff = 0;//missing
//
//
//long expectedSum = (n * (n+1))/2;
//long expectedSqSum = (n*(n+1)*(2*n+1))/6;
//
//long actualSum = 0;
//long actualSqSum = 0;
//
//for(int i:A) {
//    actualSum = actualSum + i;
//    actualSqSum  = actualSqSum + (i*i);
//}
//
//diff = actualSum - expectedSum;
//sum = (actualSqSum  - expectedSqSum )/diff;
//
//long a = (diff + sum)/2;
//long b = a- diff;
//
//ArrayList<Integer> result = new ArrayList<>();
//result.add((int) a);
//result.add((int) b);
//return result;


