package com.others;

import java.util.*;

public class FibonacciRecursion {
	int range,temp=0;
	int first=0, second=1;
	int sum=0;
	
	public int fibonacci(int term) {
		if(term == 1 || term == 2)
			return 1;
		else
			return fibonacci(term-1)+fibonacci(term-2);
	}
	
	 

	public static void main(String[] args) {
		int result;
		FibonacciRecursion obj= new FibonacciRecursion();
		
		long startTime = System.nanoTime();
		result=obj.fibonacci(8);
		long endTime = System.nanoTime();
		System.out.println(result);
		System.out.println("Time taken: " + (endTime-startTime)); // time is showing in nano second 
	}

}
