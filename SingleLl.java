package com.linkedlist;

public class SingleLl {
	Node head;
	private int size;
	
	SingleLl() {
		this.size = 0;
	}
	
	class Node{
		String data;
		Node next;
		
		Node(String data){
			this.data =data;
			this.next = null;
			size++;
		}
	}
	//add  - first, last
	public void addFirst(String data) {
		Node newNode = new Node(data);
		if(head==null)
		{
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}
	
	//add last
	public void addLast(String data) {
		Node newNode = new Node(data);
		if(head==null)
		{
			head = newNode;
			return;
		}
		Node currNode = head;
		while(currNode.next !=null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;
	}
	
	//print
	public void printList()
	{
		if(head==null)
		{
			System.out.println("list is empty");
		}
	  Node currNode = head;
	  while(currNode!=  null) {
		  System.out.print(currNode.data + " -> ");
		  currNode = currNode.next;
	  }
	  System.out.println("Null");
	}
	
	//delete first
	public void deleteFirst() {
		if(head == null) {
			System.out.println("The list is empty");
			return;
		}
		//to delete first head
		size--;
		head = head.next;
	}
	
	//delete last
	public void deleteLast() {
		if(head==null) {
			System.out.println("The list is empty");
			return;
		}
		size--;
		if(head.next == null) {
			head = null;
			return;
		}
		Node secondLast = head;
		Node lastNode = head.next;
		while(lastNode.next!=null) {
			lastNode = lastNode.next;
			secondLast = secondLast.next;
			
		}
		secondLast = secondLast.next;
	}
	public int getSize() {
		return size;
	}

	public static void main(String[] args) {
		SingleLl l1 = new SingleLl();
		l1.addFirst("a");
		l1.addFirst("is");
		l1.printList();
		
		l1.addLast("list");
		l1.printList();
		
		
		l1.addFirst("This");
		l1.printList();
		
		l1.deleteFirst();
		l1.printList();
		
		l1.deleteLast();
		l1.printList();
		
		l1.getSize();
		System.out.println(l1.getSize());
		
		l1.addFirst("This");
		System.out.println(l1.getSize());
		
		
		
		
	}

}
