package com.prahalad.junit;

import org.junit.*;
import static org.junit.Assert.*;


public class TestHighArray {
	
	HighArray ha;
	
	@Before
	public void instHighArray(){
		
		 ha = new HighArray(10);
		    ha.insert(10, 0);
			ha.insert(20, 1);
			ha.insert(30, 2);
			ha.insert(40, 3);
			ha.insert(50, 4);
			ha.insert(60, 5);
			ha.insert(70, 6);
			ha.insert(80, 7);	
	}
	
	
	
	@Test 
	public void testInsert(){
		
		System.out.println("Insert test");
		
		assertTrue(ha.find(50)); 		
		
	}
	
	@Test 
	
	public void testDelete(){
		
		
		ha.delete(50);
		assertFalse(ha.find(50));
		
	}

	
	@Test
	
	public void testBinaryFind(){
		assertTrue(ha.findBinary(70));
		
	}
	
	@Test
	
	public void testFind(){
		assertTrue(ha.find(70));
	}
	
	
}
