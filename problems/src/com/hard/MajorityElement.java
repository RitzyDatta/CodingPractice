/**
Majority Element: A majority element is an element that makes up more than half of the items in
an array. Given a positive integers array, find the majority element. If there is no majority element,
return-1. Do this inO(N) time and 0(1) space.
EXAMPLE
Input: 1 2 5 9 5 9 5 5 5
Output:5
 */


package com.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MajorityElement {
	List<Integer> list;
	
	MajorityElement(){
		list = new ArrayList<Integer>();
	}
	
	void takeInput() {
		Scanner sc = new Scanner(System.in);
		int elements, temp;
		System.out.println("How many elements you want to enter");
		elements = sc.nextInt();
		for(int i=1;i<=elements;i++) {
			System.out.println("Enter element");
			temp = sc.nextInt();
			list.add(temp);
		}
	}
	
	int findMajority() {
		int len = list.size();
		int max = -1;
		int count =0;
		int temp=0;
		HashMap<Integer,Integer> num_count = new HashMap<>();
		
		for(int ele : list) {
			if(num_count.containsKey(ele)) {
				count= num_count.get(ele);
				num_count.put(ele, ++count);
			}
			else {
				num_count.put(ele, 1);
			}
		}
		
		 for(int ele : list) {
			 if(num_count.get(ele) >= len/2) {
				 max=ele;
			 }
		 }
		
		return max;
		
	}

	public static void main(String[] args) {
		MajorityElement obj = new MajorityElement();
		obj.takeInput();
		int result = obj.findMajority();
		System.out.println(result);
		

	}

}
