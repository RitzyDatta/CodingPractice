package com.others;
import java.util.*;

public class StringTweet {
	
	static String tweet;
	static ArrayList<String> division;
	static int count;
	
	StringTweet(){
		
	}
	
	static int divide() {
		//int count=0;
		if(tweet.length()<=30) {
			return 1;
		}
		else {
			int start = 0;
			int end=31;
			while(end <= tweet.length()) {
				if(end != tweet.length()) {
					while(tweet.charAt(end) != ' ')
						end--;
					division.add(tweet.substring(start,end+1));
				}
				else {
					division.add(tweet.substring(start,end));
				}
				count++;
				
				start = end;
				if((end+30) <= tweet.length())
					end = end + 30;
				else {
					//System.out.println("ELSE");
					int temp = tweet.length() - end;
					if(temp != 0)
						end = end + temp;
					else
						end = end +1; // random number adding
				}
			}
			
		}
		return 0;
	}
	
	public static void main(String[] args) {
		tweet = new String();
		division = new ArrayList<String>();
		count = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your message: ");
		tweet = sc.nextLine();
		
		System.out.println("Your message: " + tweet);
		
		divide();
		System.out.println("total division " + count);
		for( String i : division) {
			System.out.println(i);
			System.out.println("");
			
		}
		

	}

}
