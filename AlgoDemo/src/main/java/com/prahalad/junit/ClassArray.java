package com.prahalad.junit;

public class ClassArray {
	
	private Person[] p;
	private int nElem;
	
	
	public ClassArray(int maxsize) {
		
		p = new Person[maxsize];
		
	}
	
	public void insert(String lname, String fname, int age){
		
		p[nElem] = new Person(fname, lname, age);
		nElem++;
		
	}
	
	public Person find(String lname){
		
		int i;
		for(i=0;i<nElem;i++){
			if(p[i].getLast().equals(lname)) break;
		}
		if (i==nElem) return null;
		else return p[i];
		
	}
	
	public void delete(String lname){
		
		int i;
		for(i=0;i<nElem;i++){
			if(p[i].getLast().equals(lname)) break;
		}
		for(int j=i;j<nElem;j++){
			p[j] = p[j+1];
			nElem--;
		}
		
	}
	public void displayAll(){
		
		for(int i=0;i<nElem;i++){
			
			p[i].displayPerson();
		}
	}

}
