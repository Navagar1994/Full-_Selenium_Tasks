package org.test;

public class StringTask7 {
	
	public static void main(String[]args) {
		
//QUES--7
		
//Q---7.1
		
		String s ="Welcome to class java";
		
		String a = s.replace("java", "sql");
		System.out.println(a);
		
//Q---7.2
		
		String s1 =  "Greens Adayar";
		
		String b = s1.replace("Adayar", "Omr");
		System.out.println(b);
		
//Q---7.3
		
		String s2 = "Welcome to java class";
		
		String c = s2.replace("Welcome to java class", "Welcome#to#java#class");
		System.out.println(c);
		
//QUES---7.4
		
		String s3 = "Nishakerala24@gmail.com";
		
		boolean d = s3.contains("gmail");
		System.out.println(d);
		
		String e = s3.replace("gmail", "yahoo");
		System.out.println(e);
		
//Q---7.5
		
		String s4 =  "5-35-2a,venkatesh nivas,Aruppukottai,pincode-626101";
		
		boolean f = s4.contains("pincode");
		System.out.println(f);
		
		String g = s4.replace("pincode", " ");
		System.out.println(g);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
