package com.prahalad.junit;

import junit.framework.TestCase;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
    

    
	@Test
	public void test_returnEuro(){
		System.out.println("Test if price per month returns euros");
		Subscription s = new Subscription(200, 2);
		assertTrue(s.pricePerMonth() == 100);	
	}
	
	@Test
	public void test_roundUp(){
		System.out.println("Test price per month rounds up correctly");
		Subscription S = new Subscription(200,3);
		assertTrue(S.pricePerMonth() == 0.67);
		
	}
}
