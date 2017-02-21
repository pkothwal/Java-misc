package com.prahalad.junit;

public class ArrayBubble {
	
	private double[] d;
	private int nElems;
	
	
	public ArrayBubble(int size) {
	
		d = new double[size];
		
	}
	
	public void insert(double value){
		
		d[nElems] = value;
		nElems++;
	}
	
	
	public void display(){
		for(int i=0;i<nElems;i++){
			System.out.print(d[i] + " ");
			
		}
	}
	
	// O(N2) quadratic 
	
	public void bubbleSort(){
		
		for(int i=nElems-1;i>1;i--)
			for(int j=0;j<i;j++)
				if(d[j] > d[j+1])
					swap(j, j+1);
		
		
		
	}
	public void swap(int i, int j){
		double temp = d[i];
		d[i] = d[j];
		d[j] = temp;
				
		
		
	}

}
