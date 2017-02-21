package com.prahalad.junit;

public class HighArray {
	
	private double[] array ;
	int nElem ;

	public HighArray(int size) {
		
		array = new double[size];
	}
	
	
	public void insert(double value, int index) {
		
		array[index] = value;
		nElem++;
	}
	
	public void insertOrdered(double value){
		
		int i;
		for(i=0;i<nElem;i++){
			if(array[i] > value) break;
		}
		for(int k=nElem;k>i;k--)
			array[k] = array[k-1];
			
		array[i] = value;
		nElem++;
		
	}
	
	
	public boolean find(double key){
		
		int i=0;
	try{	
		for(i=0;i<nElem;i++){
			if(array[i] ==  key)
				break;
		}
	}catch(ArrayIndexOutOfBoundsException e){
		 
		e.printStackTrace();
	}
			if(i==nElem){
				return false;
			}else{
				return true;
			}		
		
	}
	public boolean delete(double key){
		int i =0;
		for(i=0;i<nElem;i++){
			if(array[i] == key)
				break;
		}
		if(i==nElem){
			return false;
		}else
			for(int k=i;k<nElem;k++)
				array[k] = array[k+1];
				nElem--;
			return true;
	}
	
	public boolean findBinary(double key){
		
		int curIn =0;
		int upperBound = nElem-1;
		int lowerBound = 0;
		
		while(true){
			 curIn = (lowerBound+upperBound)/2;
			if(array[curIn] == key) return true;
			else if(lowerBound > upperBound) return false;
			else {
				if(array[curIn] < key) lowerBound = curIn + 1;
				else upperBound = curIn -1;
			}
		}
		
	}
	
	public void displayAll(){
		
		for(int i=0;i<nElem;i++){
			
			System.out.print(array[i] + " ");
			
		}
	}

}
