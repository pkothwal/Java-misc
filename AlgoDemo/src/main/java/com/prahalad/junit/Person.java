package com.prahalad.junit;

public class Person {
	
	private String fname;
	private String lname;
	private int age;
	
	
	public Person(String fname, String lname, int age) {
		
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}
	
	public void displayPerson(){
		
		System.out.println("Last name " + lname);
		System.out.println("First name " + fname);
		System.out.println("Age " + age);
	}
	
	public String getLast(){
		
		return lname;
	}
	
	

}
