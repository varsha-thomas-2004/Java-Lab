/*
Name : Varsha Thomas
Class : CS3B

To create a doubly linked list and delete an element from the list, then the display of the list after deletion
*/

import java.util.Scanner;

class Node
{
	public int data;
	public Node prev;
	public Node next;
	public Node head;
	public Node tail;
	
	public void Node(int data)
	{
		this.data = data;
	}
	
	public void DLL(int data)
	{
		this.head = null;
		this.tail = null;
	}
}

public class Doubly extends Node
{	
	public void Insert_End(int data) 
	{ 
		Node temp = new Node(); 
		temp.data = data;
		if (tail == null) 
		{ 
			head = temp; 
			tail = temp; 
		} 
		else 
		{ 
			tail.next = temp; 
			temp.prev = tail; 
			tail = temp;
			tail.next = null; 
		}	 
	} 
	
	public void deleteAtBeginning() 
	{ 
		if (head == null) 
		{ 
			return; 
		} 

		if (head == tail) 
		{ 
			head = null; 
			tail = null; 
			return; 
		} 

		Node temp = head; 
		head = head.next; 
		head.prev = null; 
		temp.next = null; 
	}
	
	public void deleteAtEnd() 
	{ 
		if (tail == null) 
		{ 
			return; 
		} 

		if (head == tail) 
		{ 
			head = null; 
			tail = null; 
			return; 
		} 

		Node temp = tail; 
		tail = tail.prev; 
		tail.next = null; 
		temp.prev = null; 
	}

	public void Delete(int pos) 
	{ 
		if (head == null)
		{ 
			return; 
		} 

		if (pos == 1) 
		{ 
			deleteAtBeginning(); 
			return; 
		} 

		Node current = head; 
		int count = 1; 

			while (current != null && count != pos) 
			{ 
				current = current.next; 
				count++; 
		} 

		if (current == null) 
		{ 
			System.out.println("Position wrong"); 
			return; 
		} 

		if (current == tail) 
		{ 
			deleteAtEnd(); 
			return; 
		} 

		current.prev.next = current.next; 
		current.next.prev = current.prev; 
		current.prev = null; 
		current.next = null; 
	} 

	
	public void Display(Node head)
	{
		Node ptr = head; 
    		while (ptr.next != null) 
    		{ 
        		System.out.print(ptr.data + " "); 
        		ptr = ptr.next; 
    		} 
	}
	
	public static void main(String args[])
	{
		int ch = 0, data, pos;
		Node head = new Node();
		Scanner sc = new Scanner(System.in);
		Doubly d = new Doubly();
		System.out.println("DOUBLY LINKED LIST");
		System.out.print("Enter first element: ");
		data = sc.nextInt();
		head.data = data;
		System.out.println("1. Insert\n2. Delete\n3. Display\nPress any other number to exit.");
		while (ch < 4)
		{
			System.out.print("Enter your choice: ");
			ch = sc.nextInt();
			switch (ch)
			{
				case 1:
					System.out.print("Enter the element: ");
					data = sc.nextInt();
					d.Insert_End(data);
					break;
				case 2:
					System.out.print("Enter position: ");
					pos = sc.nextInt();
					d.Delete(pos);
					break;
				case 3:
					d.Display(head);
					break;
				default:
					System.out.println("EXITTING...");
			}
		}
	}
}
