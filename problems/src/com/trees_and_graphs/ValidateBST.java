/**
 * Implement a function to check if a binary tree is a binary search tree.
 */

package com.trees_and_graphs;

import java.util.Random;
import java.util.Scanner;



public class ValidateBST {
	
	 class Node { 
	        int data; 
	        Node left, right; 
	  
	        public Node(int item) { 
	            data = item; 
	            left = right = null; 
	        } 
	    }
	 
	// Root of BST 
	    Node root,root1; 
	  
	// Constructor 
	ValidateBST() {  
		root = null;
		root1=null;
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
	
	//Create Binary Tree using random number function
	void createBinary() {
		Random rand = new Random();
		
		root1=new Node(rand.nextInt(100));
		root1.left = new Node(rand.nextInt(100));
		root1.right = new Node(rand.nextInt(100));
		root1.left.left = new Node(rand.nextInt(100));
		root1.left.right = new Node(rand.nextInt(100));
		root1.right.left = new Node(rand.nextInt(100));
		root1.right.right = new Node(rand.nextInt(100));
		root1.right.left.left = new Node(rand.nextInt(100));
		root1.right.left.right = new Node(rand.nextInt(100));
	}
	
	
	void display(Node root) {
		
		
		if(root!=null) {
			
			display(root.left);
			System.out.print("  " +root.data);
			display(root.right);
		}
	}
	
	Boolean isBST(Node tempRoot) {
		Boolean bool = true;
		if(tempRoot != null) {
			if(tempRoot.left != null) {
				if(tempRoot.data < tempRoot.left.data) {
					bool = false;
					return bool;
				}
				else {
					isBST(tempRoot.left);
				}
			}
			if(tempRoot.right != null) {
				if(tempRoot.data > tempRoot.right.data) {
					bool = false;
					return bool;
				}
				else {
					isBST(tempRoot.right);
				}
			}				
		}
		
		return bool;
	}
	

	public static void main(String[] args) {
		int arr[]=new int[20];
		int num, temp;
		Boolean bool;
		ValidateBST obj = new ValidateBST();
		
		
		obj.createBinary();
		System.out.println("AFTER CREATING BINARY TREE ");
		obj.display(obj.root1);
		bool = obj.isBST(obj.root1);
		System.out.println("is BST? " + bool);
		
		System.out.println("");
		System.out.println("FOR bINARY SEARCH TREE ");
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
		bool=false;
		
		bool = obj.isBST(obj.root);
		System.out.println("is BST? " + bool);
	}

}
