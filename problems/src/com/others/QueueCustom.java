/* front is facing to the right side and rear is facing to left side */

package com.others;

public class QueueCustom<T> {
	T data;
	QueueCustom <T> rear;
	QueueCustom <T> front;
	QueueCustom <T> link;
	
	public QueueCustom()
	{
		rear=null;
		front=null;
		link=null;
	}
	
	public boolean enqueue(T item) {
		QueueCustom <T> temp;
		try {
			temp=new QueueCustom <T>();
		}
		catch(Exception e) {
			return false;
		}
		
		
		temp.data = item;
		
		if(this.front==null)
		{
			front=temp;
			rear=temp;
			front.link=null;
			rear.link=null;
		}
		else {
			if(front==rear)
				front.link=temp;
			rear.link=temp;
			rear=temp;
			temp=null;
		}
		
		return false;
	}
	
	public T dequeue() {
		if(front==null)
			return null;
		else {
			QueueCustom<T> temp= front;
			front=front.link;
			
			if(front==null) {
				rear=null;
				return null;
			}
			else
				return  (T) temp.data;
		}
	}
	
	public void display() {
		QueueCustom <T> temp = new QueueCustom <T>();
		temp=front;
		while(temp != null) {
			System.out.println(temp.data);
			temp=temp.link;
		}
	}

}
