package org.test;

public class StringTask9 {
	
	public static void main(String[]args) {
		
//QUES---9
		
//Q---9.1
		
		String s = new String("Welcome to class java");
		
		boolean a = s.startsWith("Welcome");
		System.out.println(a);
		
//Q---9.2
		
		String  s1 ="Hai i am nisha";
		
		boolean b = s1.startsWith("welcome");
		System.out.println(b);
		
//Q---9.3
		
		String s2 =  "Welcome to java class";
		
		System.out.println(s2.endsWith("class"));
		
//Q---9.4
		
		String s3 = "Welcome to java class";
		
		System.out.println(s3.endsWith("java"));
		
//Q---9.5
		
		String s4 = new String("Welcome to java class");
		
		System.out.println(s4.isEmpty());
		
//Q---9.6
		
		String s5 = "";
		boolean c = s5.isEmpty();
		System.out.println(c);
		
		
		
		
	}

}
