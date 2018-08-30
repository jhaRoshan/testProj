package com.bit.array.bucketing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FirstMissingInteger
{   
      
      
    public static int findMissingPositive(List<Integer> arr)
    {
      int i;
      int size = arr.size();
      for(i = 0; i < size; i++){
    	
        int val = Math.abs(arr.get(i)) - 1;
		if(val < size && arr.get(val) > 0)
          arr.set(val,-arr.get(val));
      }
      
      for(i = 0; i < size; i++)
        if (arr.get(i) > 0)
          return i+1;  
      
      return size+1;
    }
      
   
    public static int findMissing(List<Integer> arr)
    {
    	int size = arr.size();
		Iterator<Integer> iterator = arr.iterator();
		while (iterator.hasNext()) {
			int num = iterator.next();
			if(num <=0 || num > size)  {
				iterator.remove();
			}
		}
		
       return findMissingPositive(arr);
    }
    public static void main (String[] args) 
    {
        List<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(3);
        
        int missing = findMissing(li);
        System.out.println("The smallest positive missing number is "+ 
                            missing);
    }
}