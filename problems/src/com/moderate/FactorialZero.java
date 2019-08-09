/**
 * Write an algorithm which computes the number of trailing zeros in n factorial
 */

package com.moderate;

import java.util.Scanner;

public class FactorialZero {
	
	static int countZero(int num){
		int countFive = 0;
		int countTwo = 0;
		//divide all the factors with 5, to find multiple of 5
		for(int i=2; i<=num; i++) {
			if(i%5 == 0)
				countFive++;
		}
		
		for(int i=2; i<=num; i++) {
			if(i%2 == 0)
				countTwo++;
		}
		
		if(countFive != 0 && countTwo != 0) {
			if(countFive < countTwo || countFive == countTwo) {
				return countFive;
			}
			else if (countFive > countTwo) {
				return countTwo;
			}
		}
		else {
			return 0;
		}
		return 0;
	}

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find: ");
		num=sc.nextInt();
		
		int numZero= countZero(num);
		System.out.println("Occurance of zero: " +numZero );
		

	}

}
