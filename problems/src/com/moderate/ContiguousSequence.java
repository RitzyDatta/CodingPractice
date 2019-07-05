package com.moderate;

public class ContiguousSequence {
	
	static int arr[]={2,-8,3,-2,4,-10};
	
	public static int largestSum() {
		int max=0;
		int sum=0;
		
		for(int i=0;i<arr.length; i++) {
			sum=0;
			for(int j=i; j<arr.length;j++) {
				sum+=arr[j];
				
				if(max<sum)
					max=sum;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int result;
		result = largestSum();
		
		System.out.println(result);

	}

}
