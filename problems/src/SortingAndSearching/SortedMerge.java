/**
 * You are given two sorted arrays, A and B, where A has a large enough buffer at the end to hold B. Write a method to merge B into A in sorted order
 */

package SortingAndSearching;

public class SortedMerge {
	int arrA[], arrB[];
	
	SortedMerge(){
		arrA= new int[20];
		arrB= new int[10];
		
		int j=1;
		for(int i=0; i<5;i++) {
			arrB[i] = j++;
			
		}
		for(int i=0; i<5;i++) {
			arrA[i] = j++;
		}
		for(int i=5; i<10;i++) {
			arrB[i] = j++;
			
		}
		
		for(int i=5; i<10;i++) {
			arrA[i] = j++;
		}
		
	}
	void mergeArray() {
		int indexToPlace= arrA.length-1;
		int indexB=arrB.length - 1;
		int indexA=9; // as we entered manually in the array
		
		System.out.println(indexToPlace + " =>indexToPlace ");
		System.out.print(indexB + "=>indexB ");
		System.out.print(indexA + "=>indexA ");
		
		while(indexB >=0 && indexA>=0) {
			
			if(arrA[indexA] > arrB[indexB]) {
				System.out.println("A big");
				arrA[indexToPlace]= arrA[indexA];
				arrA[indexA]= arrB[indexB];
				indexA--;
				indexToPlace--;
			}
			else {
				System.out.println("B big");
				arrA[indexToPlace]= arrB[indexB];
				indexB--;
				indexToPlace--;
			}
		}
		while(indexB >=0) {
			arrA[indexB] = arrB[indexB];
			indexB--;
		}
			
		System.out.println("indexA" +indexA);
		System.out.println("indexB" +indexB);
		
	}

	public static void main(String[] args) {
		SortedMerge obj = new SortedMerge();
		
		for(int i :obj.arrA) {
			System.out.print(i + " ");
		}
		System.out.println("");
		
		for(int i :obj.arrB) {
			System.out.print(i + " ");
		}
		System.out.println("");
		obj.mergeArray();
		
		System.out.println("After merge: ");
		for(int i :obj.arrA) {
			System.out.print(i + " ");
		}

	}

}
