package com.linkedlist;

public class BasicLL {
	
	
	public static void insertAtEnd(Node head, int val) {
		Node temp = new Node(val);
		Node t = head;
		
		while(t.next!=null) {
			t = t.next;
		}
		t.next = temp;
	}
	//we make temprory node so that we can preserve the head if will traverse using head then we will lose our head
	//method
	
	public static void display(Node head)
	{
	  Node temp = head;
	  while(temp!=null)
	  {
		  System.out.println(temp.data+ " ");
		  temp = temp.next;
	  }
	}
	
	//Dislay recursively(with the help of recursion)
	public static void displayRecursively(Node head) 
	{
		if(head==null) {
			return;
		}
		System.out.println(head.data);
		displayRecursively(head.next);
	}
	//Dislay recursively(with the help of recursion)
		public static void displayReverse(Node head) 
		{
			if(head==null) 
				return;
			displayReverse(head.next);
			System.out.println(head.data);
			
		}
	
	public static class Node{
		int data; //value
		Node next; // address of the next value
		
		
		Node(int data)
		{
			this.data = data;
		}
	}

	public static void main(String[] args) {
		Node a = new Node(5); //head
		Node b = new Node(6);
		Node c = new Node(2);
		Node d = new Node(9);
		Node e = new Node(8);
		
		a.next = b;
		b.next = c;  
		c.next = d;
		d.next = e;
		
		System.out.println("Displayed with the help of method");
		display(a);
		
		System.out.println("Printing recursively");
		displayRecursively(a);
		
		System.out.println("Printing Reverse");
		displayReverse(a);
		
		System.out.println();
		insertAtEnd(a,87);
		display(a);
		/*
		Node temp = a;
		while(temp!=null) //printing the list
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
		/*
		//using for loop
		Node temp = a;
		for(int i = 1; i<=5; i++)
		{
			System.out.print(temp.data+ " , ");
			temp = temp.next;
		}
		*/
		
		/*
		//with the help of a we can print all data
		System.out.println(a.data);//a
		System.out.println(a.next.data); //b
		System.out.println(a.next.next.data); //c
		System.out.println(a.next.next.next.data); //d
		System.out.println(a.next.next.next.next.data); //e
	    */
		
		//System.out.println(a.data+" , "+b.data+ " , " +c.data+ " , " +d.data+ " , " +e.data);
		
		
		
	}

}
