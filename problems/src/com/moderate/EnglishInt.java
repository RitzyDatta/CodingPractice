
/**
 *  Given any integer, print an English phrase that describes the integer (e.g., "One Thousand,Two Hundred Thirty Four").
 */

package com.moderate;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * This program can print numbers between 1-999,999 
 * @author Ritzy
 *
 */

public class EnglishInt {
	Map <Integer, ArrayList<String>> listOfInteger;
	Map <Integer, String> listOfOens;
	ArrayList<String> units;
	ArrayList <String> totalSpell;
	
	EnglishInt(){
		listOfInteger = new HashMap<Integer, ArrayList<String>>();
		listOfOens = new HashMap<Integer, String>();
		units = new ArrayList<String>();
		totalSpell = new ArrayList<String>();
		createMap();
		
	}
	
	void createMap() {
		ArrayList <String> temp;
		
		temp = new ArrayList<String>();
		temp.add("ONE");
		temp.add("TEN");
		temp.add("ONE HUNDRED");
		temp.add("ONE THOUSAND");
		listOfInteger.put(1, temp);
		
		temp = new ArrayList<String>();
		temp.add("TWO");
		temp.add("TWENTY");
		temp.add("TWO HUNDRED");
		temp.add("TWO THOUSAND");		
		listOfInteger.put(2,temp);
		
		temp = new ArrayList<String>();
		temp.add("THREE");
		temp.add("THIRTY");
		temp.add("THREE HUNDRED");
		temp.add("THREE THOUSAND");
		listOfInteger.put(3,temp);
		
		temp = new ArrayList<String>();
		temp.add("FOUR");
		temp.add("FOURTY");
		temp.add("FOUR HUNDRED");
		temp.add("FOUR THOUSAND");
		listOfInteger.put(4,temp);
		
		temp = new ArrayList<String>();
		temp.add("FIVE");
		temp.add("FIFTY");
		temp.add("FIVE HUNDRED");
		temp.add("FIVE THOUSAND");
		listOfInteger.put(5,temp);
		
		temp = new ArrayList<String>();
		temp.add("SIX");
		temp.add("SIXTY");
		temp.add("SIX HUNDRED");
		temp.add("SIX THOUSAND");
		listOfInteger.put(6,temp);
		
		temp = new ArrayList<String>();
		temp.add("SEVEN");
		temp.add("SEVENTY");
		temp.add("SEVEN HUNDRED");
		temp.add("SEVEN THOUSAND");
		listOfInteger.put(7,temp);
		
		temp = new ArrayList<String>();
		temp.add("EIGHT");
		temp.add("EIGHTY");
		temp.add("EIGHT HUNDRED");
		temp.add("EIGHT THOUSAND");
		listOfInteger.put(8,temp);
		
		temp = new ArrayList<String>();
		temp.add("NINE");
		temp.add("NINETY");
		temp.add("NINE HUNDRED");
		temp.add("NINE THOUSAND");
		listOfInteger.put(9,temp);
		
		listOfOens.put(1,"ELEVEN");
		listOfOens.put(2,"TWELVE");
		listOfOens.put(3,"THIRTEEN");
		listOfOens.put(4,"FOURTEEN");
		listOfOens.put(5,"FIFTEEN");
		listOfOens.put(6,"SIXTEEN");
		listOfOens.put(7,"SEVENTEEN");
		listOfOens.put(8,"EIGHTEEN");
		listOfOens.put(9,"NINETEEN");
		
		units.add("HUNDRED");
		units.add("THOUSAND");
		units.add("MILLION");
	}
	
	void spellNumber(Integer num) {
		
		ArrayList <String> digitSpell = new ArrayList <String>();
		ArrayList <Integer> numberList = new ArrayList <Integer>();
		
		int len,div;
		Integer temp;
		int digit;
	
		
		temp=num;
		
		
		while(temp>0) {
			len = temp.toString().length();
			div = (int) Math.pow(10,len-1);
			digit= temp/div;
			
			if(len>4 && len <=6) {
				int templen = len-3;				
				
				if(templen == 2 && digit ==1) {
					temp=temp%div;
					len = temp.toString().length();
					div = (int) Math.pow(10,len-1);
					int nextdigit= temp/div;
					temp=temp%div;
					totalSpell.add(listOfOens.get(nextdigit));
					totalSpell.add("THOUSAND");
				}
				else {
					digitSpell = listOfInteger.get(digit);
					totalSpell.add(digitSpell.get(templen-1));
					temp=temp%div;
				}
				
				
			}
			else {
				
				if(len == 2 && digit ==1) {
					temp=temp%div;
					len = temp.toString().length();
					div = (int) Math.pow(10,len-1);
					int nextdigit= temp/div;
					temp=temp%div;
					totalSpell.add(listOfOens.get(nextdigit));
					
				}
				else {
					digitSpell = listOfInteger.get(digit);
					totalSpell.add(digitSpell.get(len-1));
					temp=temp%div;
				}
				
			}
			
			
		}
	}

	
	public static void main(String[] args) {
		 EnglishInt obj = new  EnglishInt();
		 obj.spellNumber(998714);
		 if(obj.totalSpell != null) {
			 System.out.println(obj.totalSpell);
		 }
		 else {
			 System.out.println("empty");
		 }

	}

}
