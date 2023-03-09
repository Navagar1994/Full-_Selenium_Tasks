package org.test;

public class StringMethodss {
	public static void main(String[] args) {
		
		String s = "welcome";
		
//length-----> To find the size -- it works based on value
		int a = s.length();
		System.out.println(a);
		
//charAt----->To find the particular index value of String
		char b = s.charAt(5);
		System.out.println(b);
		
//indexOf()-----> it is used to find the index position of the particular value
		int c = s.indexOf("e");//top to bottom
		System.out.println(c);
		
//lastIndexOf()----> it is used to find the index position of the particular value
		int d = s.lastIndexOf("e");
		System.out.println(d);
		
//isEmpty()-----> to cheack whether the string is empty or not
		boolean e = s.isEmpty();
		System.out.println(e);
		
//contains----> To cheack whether the string contains the particular value or not(case sensitive)
		boolean f = s.contains("o");
		System.out.println(f);
		
//equals----> To compare  2 strings(it is case sensitive)
		String s1 ="welcome home";
     	String s2 ="Welcome home";
		
     	boolean g = s.equals(s2);
       System.out.println(g);
//     OR ANOTHER METHOD      //
//       System.out.println(s1==s2);
     	
//equalIgnoreCase------> To compare 2 strings(it is not case sensitive)
       boolean h = s1.equalsIgnoreCase(s2);
       System.out.println(h);
       
//concat------> To merge 2 string values
       String i = s1.concat(s2);
       System.out.println(i);
       
//startsWith-----> To cheack the String starts with particular value
       boolean j = s1.startsWith("welcome");
       System.out.println(j);
      //  or another way
       System.out.println(s1.startsWith("we"));
       
//endsWith-------> To cheack the String ends with the particular value
       boolean k = s1.endsWith("home");
       System.out.println(k);
     // or another method
       System.out.println(s1.endsWith("ho")); // but ans false
      
//toUpperCase-----> To  the String into its uppercase
       String l = s1.toUpperCase();
       System.out.println(l);
       
//toLowerCase-----> To covert the String into its lowercase
       String m = s1.toLowerCase();
       System.out.println(m);
       
       String s3=" i am a tester "  ;// even string considered empty as a value
       System.out.println(s3);
       
//trim------> To remove unwanted spaces present before and after words but ignores inbetween spaces
       String n = s3.trim();
       System.out.println(n);
       
//split-----> To split the String based on the argument
       String[] o = s3.split(" ");
       
       for(String x:o) {
    	   System.out.println(x);
	}
      String[] split = s3.split("e");// it cut the letter fist and then split the string
      
      for(String y:split) { 
    	  System.out.println(y);
      }
       
//substring(start index)----> To start with particular index value
      String q = s3.substring(5);
      System.out.println(q);
      
//substring(start index,end index)--->>>> To start with particular start index & end with particular index
       System.out.println(s3.substring(3, 9));
       
//compareTo------> To compare 2 strings based on ASCII values
       String s5="a";
       String s6 ="A";
       
       int r = s5.compareTo(s6);
       System.out.println(r);
       
//Replace-----> To replace one char or word into another char or word	
       String s7="i got a job";
  
       String replace = s7.replace("i", "I");
       System.out.println(replace);
       
//replaceAll------> To replace all occurence of the one char or word into another char or word
       String replaceAll = s7.replaceAll("job", "bike");
       System.out.println(replaceAll);
       
       }

}
