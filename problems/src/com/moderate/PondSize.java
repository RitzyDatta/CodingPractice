package com.moderate;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Pond Sizes: You have an integer matrix representing a plot of land, where the value at that location
	represents the height above sea level. A value of zero indicates water. A pond is a region of
	water connected vertically, horizontally, or diagonally. The size of the pond is the total number of
	connected water cells. Write a method to compute the sizes of all ponds in the matrix.
	
	EXAMPLE
	Input:
	0 2 1 0
	0 1 0 1
	1 1 0 1
	0 1 0 1
	Output: 2, 4, 1 (in any order)
 * @author Ritzy
 *
 */

public class PondSize {
	static int arr[][]= {{0,2,1,0},{0,1,0,1},{1,1,0,1},{0,1,0,1}};
	static int ponds=0;
	//static int countSize;
	static List<Integer> size = new ArrayList<Integer>();
	
	public static void sizeOfAllPonds(int copyArr[][]) {
		int x=-1, y=-1;
		int countSize=0;
		
		//find 0 in the matrix -
		for(int i=0;i<4;i++){  
			 for(int j=0;j<4;j++){  
			   if(copyArr[i][j]==0) {
				   x=i;y=j;
				   copyArr[i][j]=1;
				   // countSize++;
				   countSize= onePondSize(copyArr,x,y);
				   size.add(countSize);
				  // break;
			   }
			   
			 }
			// if(x != -1 && y != -1)
				//   break;
			}
		
			
	}
	
	public static int onePondSize(int copyArr[][], int x, int y) {
		int arrX[]= new int[8];
		int arrY[]= new int[8];
		int countSize=1;
		//calculating the coordinate of all adjacent cells
		
		arrX[0]=x-1; arrY[0]=y-1;
		arrX[1]=x-1; arrY[1]=y;
		arrX[2]=x-1; arrY[2]=y+1;
		arrX[3]=x;   arrY[3]=y-1;
		arrX[4]=x;   arrY[4]=y+1;
		arrX[5]=x+1; arrY[5]=y-1;
		arrX[6]=x+1; arrY[6]=y;
		arrX[7]=x+1; arrY[7]=y+1;
		
		for(int i=0;i<8;i++) {
			if(arrX[i] >= 0 && arrX[i] <4 && arrY[i] >=0 && arrY[i] <4) {
				if(copyArr[arrX[i]][arrY[i]]==0) {
					copyArr[arrX[i]][arrY[i]]=1;
					countSize+=onePondSize(copyArr,arrX[i],arrY[i]);
				}
					
			}
		}
		
		return countSize;
	}

	public static void main(String[] args) {
		int copyArr[][]=arr;
		sizeOfAllPonds(copyArr);
		
		
		//printing array
		for(int i=0;i<4;i++){  
			 for(int j=0;j<4;j++){  
			   System.out.print(copyArr[i][j]+" ");  
			 }  
			 System.out.println();  
			}
		
		
		for(Integer i: size) {
			 System.out.print(i);
		}
		

	}

}
