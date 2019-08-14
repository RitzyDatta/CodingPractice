/**
 * Level order traversal of binary tree and BST
 * 
 */

package com.others;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.LinkedList; 
import java.util.Queue;
import java.util.Random; 

public class LevelOrderTraversal {
	Queue<Node> queueObj;
	List <Node> levelTravers;
	
	class Node { 
        int data; 
        Node left, right; 
  
        public Node(int item) { 
            data = item; 
            left = right = null; 
        }
        public Node () {
        	data = 0;
        	left = right = null;
        }
        public Node (Node n) {
        	this.data = n.data;
        	this.left=n.left;
        	this.right=n.right;
        }
    }
 
// Root of BST 
    Node root;
    Node root1;
  
	// Constructor
    LevelOrderTraversal(){
		queueObj = new LinkedList<Node>();
		root = null;
		root1=null;
		levelTravers = new ArrayList<Node>();
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
	
	void traverse(Node root1) {
		List<Node> visited = new ArrayList<Node>();
		System.out.println("root1: " +root1.data);
		queueObj.add(root1);

		while(!queueObj.isEmpty()) {
			Node temp = queueObj.remove();
			System.out.println("temp.data" +temp.data);
			levelTravers.add(temp);
			visited.add(temp);
			if(!visited.contains(temp.left) && temp.left !=null) {
				queueObj.add(temp.left);
			}
			if(!visited.contains(temp.right) && temp.right !=null) {
				queueObj.add(temp.right);
			}
		}
		
		System.out.println("After traversal: ");
		for(Node n : visited) {
			System.out.print(n.data + "  ");
		}
	}
	
	
	public static void main(String[] args) {
		int num, temp;
		LevelOrderTraversal obj = new LevelOrderTraversal();
		
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
		
		obj.traverse(obj.root);
		
		obj.createBinary();
		System.out.println("This is Binary Tree after creation ");
		obj.display(obj.root1);
		System.out.println("");
		
		obj.traverse(obj.root1);

	}

}
