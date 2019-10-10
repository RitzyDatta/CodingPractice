package SortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class GroupAnagrams {
	
	String arr[];
	GroupAnagrams(){
		arr = new String[5];
	}
	

	public static void main(String[] args) {
		GroupAnagrams obj = new GroupAnagrams();
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("Enter a String: ");
			obj.arr[i]= sc.nextLine();
		}
		System.out.println("After sort: ");
		Arrays.sort(obj.arr);
		for(int i=0;i<5;i++) {
			System.out.print(obj.arr[i]+" ");
		}
	}

}
