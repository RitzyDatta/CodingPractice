package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromePermuntation {

	public static void main(String[] args) {
		String original;
		int arr[]= new int[128];
		int originalLength, count=0;
		Arrays.fill(arr, 0); // Initialize array with 0
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the original string");
		original = sc.nextLine();
		originalLength=original.length();
		
		for(int i=0;i<original.length(); i++) { // count the number of occurrence of that letter in the array
			int temp=original.charAt(i);
			arr[temp]++;
		}
		originalLength=originalLength-arr[32];
		
		for(int i=0;i<original.length(); i++) {
			int temp=original.charAt(i);
			if(temp != 32) {
				if(arr[temp]==2)
					count++;
			}
		}
		if((originalLength % 2 == 0 && count == originalLength) || (originalLength % 2 != 0 && count == originalLength-1))
			System.out.println("true");
		else
			System.out.println("false");
	}

}
