package com.others;

import java.util.HashMap;
import java.util.Map;

public class WordstoNumber {
	Map <String, Integer> map;
	Map<String, Integer> units;
	String arr[] = new String[10];
	
	WordstoNumber(){
		map = new HashMap<String,Integer>();
		units = new HashMap<String,Integer>();
		map.put("ONE", 1);
		map.put("TWO", 2);
		map.put("THREE", 3);
		map.put("FOUR", 4);
		map.put("FIVE", 5);
		map.put("SIX", 6);
		map.put("SEVEN", 7);
		map.put("EIGHT", 8);
		map.put("NINE", 9);
		map.put("TEN", 10);
		map.put("ELEVEN", 11);
		map.put("TWELVE", 12);
		map.put("THIRTEEN", 13);
		map.put("FOURTEEN", 14);
		map.put("FIFTEEN", 15);
		map.put("SIXTEEN", 16);
		map.put("SEVENTEEN", 17);
		map.put("EIGHTEEN", 18);
		map.put("NINTEEN", 19);
		map.put("TWEENTY", 20);
		map.put("THIRTY", 30);
		map.put("FOURTY", 40);
		map.put("FIFTY", 50);
		map.put("SIXTY", 60);
		map.put("SEVENTY", 70);
		map.put("EIGHTY", 80);
		map.put("NINTY", 90);
		
		units.put("MILLION", 1000000);
		units.put("THOUSAND", 1000);
		units.put("HUNDRED", 100);
		
	}
	
	void createMap() {
		
		
	}
	
	void convert(String str) {
		String wordLists[] = str.split(" ");
		
		Integer temp =0;
		Integer temp1=0;
		Integer UnitValue=0;
		for(String s : wordLists) {
			//System.out.println(s);
			if(map.containsKey(s)) {
			//	System.out.println(map.get(s));
				if(temp != 0) {
					UnitValue=UnitValue/10;
				}
				temp=temp+map.get(s);
			//	System.out.println("temp:" +temp);
			}
			else {
				if(UnitValue ==0) {
					UnitValue = units.get(s);
				}
				if(UnitValue < units.get(s)) {
					UnitValue = units.get(s);
					temp1=temp1*UnitValue;
				}
				//Integer j = units.get(s);
				temp=temp*UnitValue;
				temp1=temp1+temp;
			//	System.out.println("temp1:" +temp1);
				temp=0;
				UnitValue=UnitValue/10;
			}
		}
		if(temp!=0) {
			temp1=temp1+temp;
		}
		System.out.println(temp1); 
	}

	public static void main(String[] args) {
		WordstoNumber obj = new WordstoNumber();
	
	//	obj.convert("THREE MILLION EIGHT HUNDRED NINTY SEVEN THOUSAND TWO HUNDRED SIXTY THREE");
		obj.convert("EIGHT HUNDRED NINTY SEVEN THOUSAND THREE");

	}

}
