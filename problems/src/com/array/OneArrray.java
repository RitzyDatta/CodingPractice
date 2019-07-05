package com.array;

import java.util.*;

public class OneArrray {

	public static void main(String[] args) {
		String original, comp;
		Boolean result=false;;
		int count=0, originalLength;
		char c;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the original string");
		original = sc.nextLine();
		System.out.println("Enter the edited string");
		comp = sc.nextLine();
		
		for(int i=0;i<comp.length(); i++) {
			c=comp.charAt(i);
			result=original.contains(Character.toString(c));
			
			if(result==true) {
				count++;
				result=false;
			}
		}
		originalLength=original.length();
		
		if(count == (originalLength-1) || count == originalLength) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}
