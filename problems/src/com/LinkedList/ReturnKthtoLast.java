package com.LinkedList;

import java.util.Scanner;

public class ReturnKthtoLast {
	
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
		return true;
		}
		else {
			end.next=newNode;
			end=newNode;
			return true;
		}
		
		} // end of insertNodeatEnd
	
	public void displayList() {  // this function will display the entire list
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
	
	public int ktoLast (int index) {
		int count=1, size=0, indexFromFirst;
		Node temp =head;
		
		if(head != null) {
			while(temp != null) {
				size++;
				temp=temp.next;
			}
			indexFromFirst= size-index+1;
			
			System.out.println("size is: " +size);
			System.out.println("indexFromFirst is: " +indexFromFirst);
			
			temp=head;
			while(count< indexFromFirst) {
				temp=temp.next;
				count ++;
			}
		}
		else
			return 0;
		
		return temp.data;
	}
			

	public static void main(String[] args) {
		ReturnKthtoLast obj = new ReturnKthtoLast();
		int size,count=1, data =0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many elements: ");
		size=sc.nextInt();
		for(int i=0;i<size;i++) 
			obj.insertNodeatEnd(count++);
		
		data=obj.ktoLast(4);
		
		System.out.println("data is: " +data);
		
		

	}

}
