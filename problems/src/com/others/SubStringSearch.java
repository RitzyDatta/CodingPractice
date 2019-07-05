package com.others;

import java.util.Scanner;


public class SubStringSearch {
	String original,subString;
	
	public boolean isSubString() {
		int count=0;
		char temp=subString.charAt(0);
		
		for(int i=0; i<original.length(); i++) {
			if(Character.toLowerCase(temp) == Character.toLowerCase(original.charAt(i))) {
				int k=i, j=0;
				boolean bool=true;
				count=0;
				while(j<subString.length() && bool==true) {
					if(Character.toLowerCase(original.charAt(k)) == Character.toLowerCase(subString.charAt(j))) {
						count++;
						k++;
						j++;
					}
						
					else 
						bool=false;
				}
				
				if(count== subString.length())
					break;
					
				
			}
		}
		
		if(count == subString.length())
			return true;
		else
			return false;
	}
	

	public static void main(String[] args) {
		SubStringSearch obj = new SubStringSearch();
		Boolean result;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the original string");
		obj.original = sc.nextLine();
		System.out.println("Enter the sub string");
		obj.subString = sc.nextLine();
		
		result = obj.isSubString();
		System.out.println(result);

	}

}
