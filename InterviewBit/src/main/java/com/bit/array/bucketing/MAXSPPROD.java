package com.bit.array.bucketing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class MAXSPPROD {


	public ArrayList<Integer> leftSpValue(ArrayList<Integer> A){
        ArrayList<Integer> result=new ArrayList<>();
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<A.size();i++){
            while(!stack.isEmpty() && A.get(stack.peek())<=A.get(i)){
                stack.pop();
            }
            if(stack.isEmpty())
            result.add(0);
            if(!stack.isEmpty())
            result.add(stack.peek());
            stack.push(i);
        }
        return result;
    }
    public ArrayList<Integer> r8SpValue(ArrayList<Integer> A){
        ArrayList<Integer> result=new ArrayList<>();
        Stack<Integer> stack=new Stack<>();
        for(int i=A.size()-1;i>=0;i--){
            while(!stack.isEmpty() && A.get(stack.peek())<=A.get(i)){
                stack.pop();
            }
            if(stack.isEmpty())
            result.add(0,0);
            if(!stack.isEmpty())
            result.add(0,stack.peek());
            stack.push(i);
        }
        return result;
    }
    public int maxSpecialProduct(ArrayList<Integer> A) {
        ArrayList<Integer> left=leftSpValue(A);
        ArrayList<Integer> r8=r8SpValue(A);
        // System.out.println(left);
        // System.out.println(A);
        // System.out.println(r8);
        long result=0;long pro=0;
        for(int i=0;i<left.size();i++){
            result=((long)left.get(i))*((long)r8.get(i));
            if(pro<result)
            pro=(result);
        }
        return (int)(pro%1000000007);
    }

	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList( 5, 9, 6, 8, 6, 4, 6, 9, 5, 4, 9 );
		ArrayList<Integer> al = new ArrayList<>(asList);
		
		System.out.println(new MAXSPPROD().maxSpecialProduct(al));

	}

}
