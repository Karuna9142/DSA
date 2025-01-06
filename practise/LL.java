package com.practise;

public class LL
{
	public static class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
		}
    }
	public static void insertAtFirst(Node head, int val)
	{
		Node temp = new Node(val);
		Node t = head;
		
		while(t.next!=null)
		{
			t = t.next;
		}
		t.next = temp;
	}
	public static void display(Node head)
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data+ " ");
			temp = temp.next;
		}
		
	}
  public static void main(String[]args) 
  {
	  Node a= new Node(5);
	  Node b = new Node(6);
	  Node c= new Node(2);
	  Node d = new Node(3);
	  
	  a.next = b;
	  b.next = c;
	  c.next = d;
	  
	  System.out.print(a.data+ " , "+b.data);
	  System.out.print(" , "+c.data+ " , "+d.data);
	  System.out.println();
	  display(a);
	  
  }
}
