package com.prahalad.doublylinked;

public class DoublyLinked {
	
	private Node first;
	private Node last;
	
	class Node{
		
		private Node next;
		private Node prev;
		
		private double d;
		
		public Node(double d){
			this.d = d;
		}
	}
	
	public boolean isEmpty(){
		
		return first == null;
	}

	public void insertFirst(double d){
		
		Node newlink = new Node(d);
		
		if(isEmpty()) last = newlink;
		else 
			first.prev = newlink;
			newlink.next = first;
		    first = newlink;
		
	}
	
	public void insertLast(double d){
		
		Node newlink = new Node(d);
		
		if(isEmpty()) first = newlink;
		else {
			last.next  = newlink;
		    newlink.prev = last;
		}	
		    last = newlink;
		    	
	
}
	
	public Node deleteFirst(){
		
		Node temp = first;
		if(first.next== null) last = null;
		else first.next.prev = null;
			first = first.next;
			return temp;		
	}
	
	public Node deleteLast(){
		
		Node temp = last;
		if(last.prev == null) first=null;
		else last.prev.next = null;
		     last = last.prev;
		   return temp;  
	}
	
	
	public boolean insertAfter(double value, double key){
		
		Node current = first;
		
		while(current.d != key){
			
			current = current.next;
		  if(current == null) return false;
	}
		Node newlink = new Node(value);
		
		if(current==last){
			newlink.next = null;
			last = newlink;
		}else {
			
			newlink.next = current.next;
			current.next.prev = newlink;
		}
		  newlink.prev = current;
		  current.next = newlink;
		  return true;
				
		
	}
	
	public boolean deleteKey(double d){
		
		Node current = first;
		while(current.d != d){
			current = current.next;
			if(current==null) return false;
		}
		if(current==first){
			first = first.next;
		}else {
			
			current.prev.next = current.next;		
		}
		if(current==last)
			last = last.prev;
		else
			current.next.prev = current.prev;
		
		return true;
	}
	
	public void displayForward(){
		
		Node current = first;
		
		while(current != null){
			
			System.out.println(current.d);
			current = current.next;
		}
	}
	
	public static void main(String...SHIVA){
		
		DoublyLinked dl = new DoublyLinked();
		
		dl.insertFirst(100);
		dl.insertFirst(300);
	//	dl.displayForward();
		dl.insertAfter(200, 300);
		dl.deleteFirst();
		dl.displayForward();
	}
	
}