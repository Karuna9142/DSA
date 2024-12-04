package com.linkedlist;

import com.linkedlist.LinkedListInsertEnd.Node;

public class InsertAtFirstLL {
	
	public static class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
		}
	}
	public static class linkedlist
	{
		Node head = null;
		Node tail = null;
		
		void insertAtFirst(int val)
		{
			Node temp = new Node(val);
			if(head==null) //empty list
			{
				head = tail = temp;
			}
			else // non empty list
			{
				temp.next = head;
				head = temp;
			}
		}
		void insertAt(int idx, int val)
		{
			Node t = new Node(val);
			Node temp = head;
			for(int i = 1; i<=idx-1; i++)
			{
				temp = temp.next;
			}
			t.next = temp.next;
			temp.next = t;
			
		}
	
		void display() 
		{
			Node temp = head;
			while(temp!=null) {
				System.out.print(temp.data+ " ");
				temp = temp.next;
			}
		}
		int size() 
		{
			int count = 0;
			Node temp = head;
			while(temp!=null) {
				count++;
				temp = temp.next;
			}
			return count;
		}
	}
	public static void main(String[] args) {
		
		linkedlist ll = new linkedlist();
		ll.insertAtFirst(4);
		ll.insertAtFirst(3);
		ll.insertAtFirst(8);
		ll.insertAtFirst(1);
		
		ll.display();
		
		System.out.println();
		ll.insertAt(2, 10);
		ll.display();

	}

}
