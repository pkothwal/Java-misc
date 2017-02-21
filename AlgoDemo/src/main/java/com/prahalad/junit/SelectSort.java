package com.prahalad.junit;

public class SelectSort {

	private double[] d;
	private int nElem;
	
	
	public SelectSort(int maxsize) {
	
		d = new double[maxsize];
	}
	
	
	public void insert(double value){
		
		d[nElem] = value;
		nElem++;
		
	}
	
	public void sort(){
		
		int out, in, min;
		
		for(out=0;out<nElem-1;out++){
			
			min=out;
			for(in=out+1;in<nElem;in++)
				if(d[in] < d[min])
					min = in;
			   swap(out,min);
		
		}
		
	}
	public void swap(int one, int two){
		double temp = d[one];
		d[one] = d[two];
		d[two] = temp;
		
		
		
	}
	
	public void display(){
		
		for(int i=0;i<nElem;i++){
			System.out.print(d[i] + " ");
		}
	}
	
	
}
