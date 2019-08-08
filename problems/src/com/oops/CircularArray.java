package com.oops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CircularArray {

	class Node{
		int data;
		Node next;
		
		Node(int item){
			data=item;
			next=null;
		}
	}
	
	public Node head=null;
	public Node end=null;
	
	List <Node> arr = new ArrayList<Node>();
	
	
	public boolean insertNodeatEnd(int item) { // this will add node in linked list in any position.
		// Here item will contain data value of the node.
		Node newNode;
		try {
			newNode =new Node(item);
		}
		catch(Exception e) {
			return false;
		}
		if (head == null) {
			head=end=newNode;
			arr.add(newNode);
			return true;
		}
		else {
			end.next=newNode;
			end=newNode;
			arr.add(newNode);
			return true;
		}
		
		} // end of insertNodeatEnd
	
	public void displayList() { // this function will display the entire list
		Node temp=head;
		
		if(head==null)
			System.out.println("List is empty");
		else {
			System.out.println("Full list is : ");
			while(temp!= null) {
				System.out.print(temp.data + "\t");
				temp=temp.next;
			}
			System.out.print("\n");
		}
		
	} //end of displayList
	
	public void rotation(int index) {
		
		if(head != null) {
			while(index > arr.size()) {
				index=index-arr.size();
			}
			if(index>0) {
				arr.get(index-1).next=null;
				end.next=head;
				end=arr.get(index-1);
				head=arr.get(index);
			}
			//redefine array to store the new order
			arr= new ArrayList<Node>();
			Node temp=head;
			while(temp!= null) {
				arr.add(temp);
				temp=temp.next;
			}
		}
		else {
			System.out.println("Linked list is empty");
		}
		
		
	}
	
	public static void main(String[] args) {
		
		int ch;
		Boolean bool = true;
		Scanner sc = new Scanner(System.in);
		CircularArray obj= new CircularArray(); 
		while(bool) {
			System.out.println("Enter your choice");
			System.out.println("1. Create node for linked list");
			System.out.println("2. Display Linked list");
			System.out.println("3. Rotation");
			System.out.println("4. Exit");
			
			ch= sc.nextInt();
			
			switch(ch){
				
			case 1:
				System.out.println("Enter data to insert: ");
				int data = sc.nextInt();
				
				obj.insertNodeatEnd(data);
				break;
			
			case 2:
				obj.displayList();
				break;
				
			case 3:
				System.out.println("How many bit of rotation?: ");
				int temp = sc.nextInt();
				obj.rotation(temp);
				break;
				
			case 4:
				bool=false;
				break;
			
			default:
				System.out.println("Please choose from the option above");
				break;
			}
			
		}
	}

}
