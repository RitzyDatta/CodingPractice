package com.hard;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Shuffle {
	int arr[]= new int[3];
	
	public Shuffle() {
		Arrays.fill(arr, 0); // Initialize array with 0		
	}
	
	public void shuffleArray() {
		Random rand = new Random();
		int temp,index;
		
		int j=0;
		for(int i=arr.length-1; i> 0;i--) {
			index=rand.nextInt(arr.length -j);
			temp = arr[i];
			arr[i] = arr[index];
			arr[index]=temp;
			j++;
		}
		
	/*	for(int i=0; i<arr.length;i++) {
			index=rand.nextInt(arr.length);
			temp = arr[i];
			arr[i] = arr[index];
			arr[index]=temp;
		} */
		
	}

	public static void main(String[] args) {
		
		Shuffle obj= new Shuffle();
		Scanner sc = new Scanner(System.in);
		int num=0;
		
		for(int i=0; i<obj.arr.length;i++)
			obj.arr[i]=i+1;
		
		
		System.out.println("How many times you want to print? ");
		num = sc.nextInt();
		
		System.out.println("Before Shuffling Array is: ");
		for(int i=0; i<obj.arr.length;i++)
			System.out.print(obj.arr[i] + " ");
		System.out.println("");
		
		System.out.println("After Shuffling: ");
		
		
		while(num > 0) {
			num --;
			obj.shuffleArray();
			for(int i=0; i<obj.arr.length;i++)
				System.out.print(obj.arr[i] + " ");
			System.out.println("");			
		}
		
		
		
	}

}
