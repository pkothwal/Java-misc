package com.prahalad.junit;

import static org.junit.Assert.assertTrue;






/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    /*	
       HighArray ha = new HighArray(20);
       
       
       ha.insert(10, 0);
		ha.insert(20, 1);
		ha.insert(30, 2);
	//	ha.insert(40, 3);
		ha.insert(50, 3);
		ha.insert(60, 4);
		ha.insert(70, 5);
		ha.insert(80, 6);	
		ha.displayAll();
		System.out.println("\n");
		
		ha.insertOrdered(40);
	System.out.println(ha.find(50)); 
		
		System.out.println(ha.findBinary(70));
		System.out.println(ha.find(70));
		
		System.out.println(ha.delete(50));
		//ha.displayAll();
		
		ClassArray ca = new ClassArray(20);
		ca.insert("Kothwal", "Prahalad", 33);
		ca.insert("Jaswal", "Apurva", 28);
		ca.insert("Henry","Ford" , 100);
		ca.insert("Gates", "Bill", 67);
		ca.insert("Gosling", "James", 65);
		ca.insert("Cutting", "Doug", 45);
		ca.insert("McManus", "Bill", 59);
		
		ca.find("Cutting").displayPerson();
		ca.delete("Henry");
		ca.displayAll();
		
    */
		
		ArrayBubble ab = new ArrayBubble(10);
		ab.insert(50);
		ab.insert(90);
		ab.insert(30);
		ab.insert(10);
		ab.insert(40);
		ab.display();
		System.out.println("\n");
		ab.bubbleSort();
		ab.display();
		System.out.println("Selection Sort");
		
		SelectSort ss = new SelectSort(10);
		ss.insert(90);
		ss.insert(20);
		ss.insert(80);
		ss.insert(40);
		ss.insert(50);
		System.out.println("select Sort below \n");
		ss.display();
		System.out.println("\n");
		ss.sort();
		ss.display();
    
    
}
}
