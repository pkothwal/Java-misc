package com.prahalad.stack;

public class Stack {
	
	private List ls;
	
	public Stack(){
		
		ls = new List();
	}
	
	
	public void push(int id, String name){
		
		
		ls.insertFirst(id, name);
		
	}
	
	
	public String pop(){
		
		
		return ls.removeFirst();
		
	}
	
	public String search(int id){
		
		return ls.find(id);
	}
	
	public String delete(int id){
		
		return ls.delete(id);
	}
	
public static void main(String...OMSHIV){
		
		Stack stk = new Stack();
		stk.push(1, "Prahalad");
		stk.push(2, "Apurva");
		stk.push(3, "Vatsala");
		stk.push(4, "Vasudeva");
		stk.push(5, "James");
		stk.push(6, "Morrison");
		stk.push(7, "Paige");
		
		System.out.println(stk.pop());
	    System.out.println(stk.search(8));
	    
	    System.out.println(stk.delete(0));
	    
	    System.out.println(stk.delete(6));
	    
	    
}
}