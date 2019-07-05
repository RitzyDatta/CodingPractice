package com.array;

import java.util.Scanner;

public class URLify {

	public static void main(String[] args) {
		String url,urlEdit;
		char urlChar[];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter url with space");
		url = sc.nextLine();
		
		urlEdit=url.trim();
		urlEdit=urlEdit.replaceAll(" ", "%20");
		System.out.println("After edit: " + urlEdit);
		
	}

}
