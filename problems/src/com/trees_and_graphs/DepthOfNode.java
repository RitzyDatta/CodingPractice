/**
 * Find Depth of a particular node in a tree 
 */


package com.trees_and_graphs;

import java.util.Scanner;

public class DepthOfNode {
	
	class Node { 
        int data; 
        Node left, right; 
  
        public Node(int item) { 
            data = item; 
            left = right = null; 
        } 
    }
 
// Root of BST 
    Node root; 
  
	// Constructor 
	DepthOfNode() {  
		root = null;
	}
	
	//Create BST by user input
	
	Node insertBST(Node tempRoot, int item) {
		
		if(tempRoot == null) { //if the tempRoot is empty
			tempRoot = new Node(item);
			return tempRoot;
		}
		else {
			if(item < tempRoot.data) {
				tempRoot.left = insertBST(tempRoot.left, item);
			}
			else if(item >= tempRoot.data) {
				tempRoot.right = insertBST(tempRoot.right,item);
			}
			
		}
		return tempRoot;
	}

	void display(Node root) {
			
			if(root!=null) {
				
				display(root.left);
				System.out.print("  " +root.data);
				display(root.right);
			}
		}
	
	
	public int getNodeDepth(Node root, int toFind, int depth)
	{
		int temp=0;
		if(root == null) {
			return 0;
		}
		else if(root.data == toFind) {
			depth++;
			System.out.println("Depth is:  " +depth);
			return(depth);
			
			
		}
		else if(root.left != null) {
			temp = getNodeDepth(root.left, toFind, depth+1);
		}
		if(temp ==0 && root.right != null) {
			temp = getNodeDepth(root.right, toFind, depth+1);
		} 
			
		return temp;
	}
	
	
	public static void main(String[] args) {
		int num, temp;
		DepthOfNode obj = new DepthOfNode();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many nodes you want to insert in the BST? ");
		num=sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			System.out.println("Enter value " + i + ":");
			temp= sc.nextInt();
			obj.root = obj.insertBST(obj.root, temp);
		}
		System.out.println("This is BST after creation ");
		obj.display(obj.root);
		System.out.println("");
		
		System.out.println("Node to find depth: ");
		temp = sc.nextInt();
		
		int depth = obj.getNodeDepth(obj.root,temp,0);
		System.out.println("Depth is:  " +depth);

	}

}
