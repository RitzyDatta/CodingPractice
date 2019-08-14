/**
 * Given a sorted array of n integers that has been rotated an unknown
number of times, write code to find an element in the array. You may assume that the array was
originally sorted in increasing order.
EXAMPLE
lnput:findSin{lS, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14}
Output: 8 (the index of 5 in the array)
 */

package SortingAndSearching;

import java.util.Scanner;

public class SearchInRotatedArray {
	int arr[];
	
	SearchInRotatedArray(){
		arr=new int[8];
	}
	
	/**
	 * This function rotate the array from left to right
	 * @param len
	 */
	
	void rotate(int len) {
		int temp = arr[len-1];
		for (int i=len-1; i>0;i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=temp;
	}
	
	int search(int key, int start, int end) {
		
		while(start <= end) {
			int mid = (start + end)/2;
			if(arr[mid] == key)
				return mid;
			else if(key < arr[mid] ) {
				if((mid-1)>=0 && key<=arr[mid-1])
					end = mid;
			}
			else if(key > arr[mid]) {
				if((mid+1)<=end && key>=arr[mid+1])
					start = mid;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		
		SearchInRotatedArray obj = new SearchInRotatedArray();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER IN SORTED WAY(INCREASING ORDER ");
		for(int i=0; i<8; i++) {
			System.out.println("Enter: ");
			obj.arr[i]=sc.nextInt();
			
		}
		for(int i=0; i<8; i++) {
			System.out.print(obj.arr[i]+" ");
			
		}
		System.out.println("");
		System.out.println("After Three roration: ");
		obj.rotate(8);
		obj.rotate(8);
		obj.rotate(8);
		
		for(int i=0; i<8; i++) {
			System.out.print(obj.arr[i]+" ");	
		}
		
		int temp = obj.search(4, 0, 7);
		
		if(temp==-1) {
			System.out.println("NOT PRESENT ");
		}
		else {
			System.out.println("FOUND AT: " +temp+1);
		}
		
		
	}
}
