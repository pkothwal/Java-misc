package com.prahalad.doubleEnded;


//import com.prahalad.doublelinked.DoubleLinked.Node;
import com.prahalad.junit.Person;

public class SortedList {
	
	private Node first;
	//private Node last;
	
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
	
	public void insertSorted(String fname,String lname, int age){
		
		Node previous = null;
		Node current = first;
		
		Node newlink = new Node(fname, lname, age);
		
		while(current != null && current.p.getLast().compareTo(lname) < 0){
			
			previous = current;
			current = current.next;
			
		}
		if( previous == null) first = newlink; 
		else previous.next = newlink; 
		
		newlink.next = current;
		
	}
	
	public void displayAll(){
		
		Node current = first;
		while(current.next != null){
			
			current.p.displayPerson();
			current =current.next;
		}

}
	
	public static void main(String...SHIVA){
		
		SortedList dl = new SortedList();
		dl.insertSorted("Prahalad", "Kothwal", 33);
		dl.insertSorted("Apurva", "Jaswal", 27);
		dl.insertSorted("James", "Gosling", 55);
		dl.insertSorted("jimi", "Hendrix", 66);
		dl.insertSorted("jim", "Morrison", 86);
		dl.insertSorted("David", "Gilmour", 67);
		
		dl.displayAll();
	}
	
	
	

}
