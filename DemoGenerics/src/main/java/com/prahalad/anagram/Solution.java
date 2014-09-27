package com.prahalad.anagram;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
	
	
	static String s ;
	static String abc = "abcdefghijklmnopqrstuvwxyz";
	static int    count=0;
	static String lower;
	static boolean[] abcd = new boolean[26];
	
	public static void main(String...OMSHIVA){
		
		Scanner scn = new Scanner(System.in);
					
			s= scn.nextLine();
			lower = s.toLowerCase();
			
			for(int i=0;i< abc.length();i++){
				for(int j=0;j<lower.length();j++){
					if(lower.charAt(j) != ' '){
					 if(abc.charAt(i)==lower.charAt(j)){
						  	abcd[i] = true;	
						  	
						
					}
					
					}
				}
			}
			for(int k=0;k<abcd.length;k++){
				if(abcd[k] == true) count++;
			}
			
			System.out.println("count is :" + count);
			
				if(count==26){
					System.out.println("pangram");
				}else{
					System.out.println("not Pangram");
				}
		
		
	}

}
