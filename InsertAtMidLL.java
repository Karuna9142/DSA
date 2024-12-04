package com.linkedlist;

import com.linkedlist.InsertAtFirstLL.Node;

public class InsertAtMidLL {
	
	public static class Node{
		int data;
		Node next;
		
		Node(int data) {
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
		void insertAtEnd(int val)
		{
			Node temp = new Node(val);
			if(head==null) { //list is empty
				head = temp;
				
			}
			else
			{
				tail.next = temp;
			}
			tail = temp;
		}
		void insertAt(int idx, int val)
		{
			Node t = new Node(val);
			Node temp = head;
			
			if(idx==size()) {
				insertAtEnd(val);
				return;
			}
			else if(idx==0){
				insertAtFirst(val);
				return;
			}
			else if(idx<0 || idx>size()) {
				System.out.println("Wrong index");
				return;
			}
			
			
			for(int i = 1; i<=idx-1; i++)
			{
				temp = temp.next;
			}
			t.next = temp.next;
			temp.next = t;
			
		}
		int get(int idx)
		{
			Node temp  = head;
			for(int i = 1; i<=idx; i++) {
				temp = temp.next;
			}
			return temp.data;
		}
		void deleteAt(int idx) {
			Node temp = head;
			for(int i = 1;i<idx-1;i++) {
				temp =temp.next ;
			}
			temp.next = temp.next.next;
			size--;// yha edit krnah
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
		ll.insertAtFirst(3);
		ll.insertAtFirst(5);
		ll.insertAtFirst(7);
		ll.insertAtFirst(9);
		ll.display();
		//ll.display();
		
		System.out.println();
		ll.insertAt(1, 2);
		ll.insertAtEnd(11);
		ll.display();
		
		System.out.println();
		ll.insertAt(0, 16);
		ll.display();

		System.out.println();
		System.out.println(ll.get(1));
	}

}
