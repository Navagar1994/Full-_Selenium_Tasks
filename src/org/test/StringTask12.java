package org.test;

public class StringTask12 {
	
	public static void main(String[]args) {
		
//QUES---12
		
//Q---12.1
		
		String s1 = "Welcome to java class";
		
		String[] c = s1.split(" ");
		
		for(String z:c) {
			System.out.println(z);
		}
		
		System.out.println();
//Q--12.2
		
		String s = "Welcome to java class";
		
		String[] a = s.split(" ");
		
		for(String  x:a) {
			System.out.println(x);
		}
		System.out.println();
		
		String[] b = s.split("l");
		
		for(String  y:b) {
			System.out.println(y);
		}
		
	}

}
