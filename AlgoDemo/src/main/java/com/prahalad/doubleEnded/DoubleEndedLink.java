package com.prahalad.doubleEnded;

import com.prahalad.junit.Person;

public class DoubleEndedLink {
	
	private Node first;
	private Node last;
	
	class Node{
		
		private Node next;
		private Person p;
		
	 public Node(String fname,String lname, int age){
		 
		 p=new Person(fname, lname, age);
		 
	 }
	}
	
	public boolean isEmpty(){
		
		return ( first==null);
	}
	
	public void insertFirst(String fname, String lname, int age){
		
		Node newfirst = new Node(fname, lname, age);
		
		if(isEmpty()) 
			last=newfirst;
		newfirst.next = first;
		first = newfirst;
		
		
	}
	
	public void insertLsat(String fname, String lname, int age){
		
		Node newfirst = new Node(fname, lname,age);
		
		if(isEmpty()){
			first=newfirst;
		}else{	
		last.next = newfirst;
		last = newfirst;
		}
	}
	
	public Person find(String lname){
		
		Node current = first;
	
		
		while(current.p.getLast() != lname){
			if(current.next == null) return null;
			else current = current.next;
			    
			    }
		     return current.p;
	}
	
	
	public Person deleteFirst(){
		
		
			if(!isEmpty())
				first = first.next;
		     return first.p;
	}
	
	public Person delete(String lname){
		
		Node current = first;
		Node previous = first;
		
		while(current.p.getLast() != lname){
			if(current.next == null) return null;
			else{
				
				previous = current;
				current = current.next;	
			}	
		}
			if(current==first) first=first.next;
			else{
				previous.next = current.next;
			}
			
		return current.p;
	}
	
	public void displayAll(){
		
		Node current = first;
		while(current.next != null){
			
			current.p.displayPerson();
			current =current.next;
		}
		if(last.next == null)
			last.p.displayPerson();
		
		
	}
	public static void main(String...OMSHIV){
		
		DoubleEndedLink dl = new DoubleEndedLink();
		dl.insertFirst("Prahalad", "Kothwal", 33);
		dl.insertFirst("Apurva", "Jaswal", 27);
		dl.insertFirst("James", "Gosling", 55);
		dl.insertLsat("jimi", "Hendrix", 66);
		dl.insertLsat("jim", "Morrison", 86);
		dl.insertLsat("David", "Gilmour", 67);
		
		//dl.find("Jaswal").displayPerson();
		dl.displayAll();
	//	dl.deleteFirst().displayPerson();
		//dl.find("Gosling").displayPerson();
	//	dl.delete("Hendrix").displayPerson();
	}

}
