package org.test;

public class StringTask11 {
	
	public static void main(String[]args) {
		
//QUES---11
		
//Q---11.1
		
		String s = "Nisha";
		
		String  s1 = "Nisha";
		
		int a = System.identityHashCode(s);
		System.out.println(a);
		
		int b = System.identityHashCode(s1);
		System.out.println(b);
		
//Q---1.2
		
		String s2 = new String("Nisha");
		
		String s3 = new String("Nisha");
		
		int c = System.identityHashCode(s2);
		System.out.println(c);
		
		int d = System.identityHashCode(s3);
		System.out.println(d);
		
//Q---11.3
		
		String s4 = new String("Nisha");
		
		String s5 = new String("Rengan");
		
		String s6 = new String("NishaRengan");
		
		System.out.println(System.identityHashCode(s4));
		System.out.println(System.identityHashCode(s5));
		System.out.println(System.identityHashCode(s6));
		
//Q---11.4
		
		String s7 = "Nisha";
		
		String s8 = "Rengan";
		
		String s9 ="NishaRengan";
		
		System.out.println(System.identityHashCode(s7));
		System.out.println(System.identityHashCode(s8));
		System.out.println(System.identityHashCode(s9));
		
		
		
	}

}
