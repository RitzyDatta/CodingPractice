package com.trees_and_graphs;

public class MinimalTree {
	
	class Node{
		int data;
		Node right, left;
		
		Node(int item){
			data=item;
			right = left = null;
		}
	}
	
	int arr[];
	Node root;
	
	MinimalTree() {
		root=null;
		arr= new int[20];
	}
	
	public Node findMinimal(int low, int up) {
		Node temp=null;
		if(low==up || low> up) {
			if(low==up) {
				temp = new Node(arr[low]);
				return temp;
			}
			
		}
		else {
			int median = (low+up)/2;
		/*	System.out.println("low"+ low);
			System.out.println("up"+ up);
			System.out.println("meidan"+ median); */
			try {
				temp =new Node(arr[median]);
				temp.left =findMinimal(low,median-1);
				temp.right = findMinimal(median+1,up);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		return temp;
	}
	
	public int getTreeDepth(Node root)
	{
		if(root == null || root.left == null && root.right == null)
			return 0;
		else
			return Math.max(getTreeDepth(root.left), getTreeDepth(root.right)) + 1;
	}
	
	
	
	public void display(Node root) {
		if(root!=null) {
			int count = getTreeDepth(root);
			for(int i = 0; i < count; i++)
				System.out.println();
			display(root.left);
			System.out.print("  " +root.data);
			display(root.right);
		}
	}

	public static void main(String[] args) {
		
		MinimalTree obj = new MinimalTree();
		
		for(int i=0;i<10;i++) {
			obj.arr[i]=i+1;
		}
		obj.root=obj.findMinimal(0,9);
		obj.display(obj.root);
		

	}

}
