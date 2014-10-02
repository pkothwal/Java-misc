package com.prahalad.stack;

public class List {
	
	private Node first;
	
	class Node{
		
		private int id;
		private String name;
		private Node next;
		
		public Node(int id, String name){
			this.id = id;
			this.name = name;
			
			
		}
	}
	
	public void insertFirst(int id, String name){
		
		Node newfirst = new Node(id, name);
		newfirst.next = first;
		first = newfirst;
		
	}
	
	public String removeFirst(){
		
		Node temp = first;
		first = first.next;
		return temp.name;
		
	}
	
	
	public String find(int id) throws NullPointerException{
		
		Node current=first;
		while(current.id != id){
			if(current.next == null) return null;
			else current = current.next;
			}
		return current.name;
	}
	
	public String delete(int id ){
		
		Node current = first;
		Node previous = first;
		
		while(current.id != id){
			if(current.next == null) return "Not Found";
			else{
				previous = current;
				current = current.next;
			}	
		}
		  if(current==first) first = first.next;
		  else previous.next = current.next;	
		  
		  return "Deleted !";
	}
		
		
		
	}


