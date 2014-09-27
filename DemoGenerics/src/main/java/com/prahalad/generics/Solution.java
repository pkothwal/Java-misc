package com.prahalad.generics;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    	   Scanner in = new Scanner(System.in);
           int _a;
           _a = in.nextInt();
           String _b;
           
           
           int count = 0; 
           
       for(int j=0; j<=_a+1;j++)
          {
    	
        	  
        	  count = 0;
        	try{  _b = in.next();
        	
        	 for (int i=0;i<_b.length();i++){
                	
             	Character ch = _b.charAt(i);
        	 
             	Integer denom = Character.getNumericValue(ch);
        	 
        	
             	Integer nuem = Integer.parseInt(_b);
        	       if(denom !=0)
                 	if( nuem%denom == 0){
        		 
             		count++;
            
        	 }     	
        }
              
        	}catch(NoSuchElementException e){
        		System.exit(0);
        		
        	}
               
                
               
           
           System.out.println(count);
      }
      }
  }
     