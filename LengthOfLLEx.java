package com.linkedlist;

public class LengthOfLLEx {
	
	public static class Node{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
		}
	}
	public static int length(Node head) {
		int count = 0;
		while(head!=null) {
			count++;
			head = head.next;
		}
		return count;
	}

	public static void main(String[] args) {
	 Node a = new Node(2);
	 Node b = new Node(5);
	 Node c = new Node(8);
	 Node d = new Node(6);
	 Node e = new Node(7);
	// Node f = new Node(3);
	 
	 a.next = b;
	 b.next = c;
	 c.next = d;
	 d.next = e;
	 //e.next = f;
	 
	 System.out.println(length(a));
	 


	}

}
