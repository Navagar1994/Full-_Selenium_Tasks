  package org.test;

public class StringTypess {
	
	public static void main(String[] args) {
		
//LITERAL STRING
		 
		String s= "welcome";
		String s1="welcome";
		System.out.println(s);
		System.out.println(s1);
	
//identityHashCode--------> To find the String memory address// it is a static method it is presented in class of "system"(Abstract class)
		
	   int a = System.identityHashCode(s);
	   System.out.println(a);
		int b = System.identityHashCode(s1);
		System.out.println(b);
	   
//NON LITERAL STRING
	   
	   String s2 = new String("welcome");
	   String s3 = new String("welcome");
	   System.out.println(s2);
	   System.out.println(s3);
	  
//identityHashCode
	   
	   int c = System.identityHashCode(s2);
	   System.out.println(c);
	   int d = System.identityHashCode(s3);
	   System.out.println(d);
	   
                               //IMMUTABLE(NON CHANGEABLE)// 
	   //---->we can't do any change if we try to join or merge it stored new memory address separetely.
	   
	   String s4 ="welcome";
	   String s5 ="welcome";
	   System.out.println("brfore s4----->"+System.identityHashCode(s4));
	   System.out.println("before s5----->"+System.identityHashCode(s5));
	   String concat = s4.concat(s5);
	   System.out.println(concat);
	   System.out.println("after s4------>"+System.identityHashCode(s4));
	   System.out.println("after s5------>"+System.identityHashCode(s5));
	   System.out.println(System.identityHashCode(concat));
	   
                          //MUTABLE(CHANGEABLE)//
	   //---->we can abel to change using StringBuffer -- it is predefined class
	   
	   StringBuffer s6 =new StringBuffer();
	   StringBuffer s7  = new StringBuffer("welcome");
	   
//	   int e = System.identityHashCode(s6); 
//	   int f = System.identityHashCode(s7);
//	   System.out.println(e);
//	   System.out.println(f);
	   ////or
	   System.out.println("before s6------->"+System.identityHashCode(s6));
	   System.out.println("before s7------->"+System.identityHashCode(s7));
//append-------> 
	   //To merge 2 string// it is  presented in StringBuffer
	   
	   StringBuffer append = s6.append(s7);
	   System.out.println(append);
	   
	   System.out.println("after s6------>"+System.identityHashCode(s6));
	   System.out.println("after s7------>"+System.identityHashCode(s7));
	   
	   System.out.println(System.identityHashCode(append));
	   //changes happen only in s6 so it shares s6 memory address
	   
//To cheack 2 different  string values is equal
	   
	   String x="jurassic";
	   String y =new String("jurassic");
	   
	   boolean equals = x.equals(y);
	   System.out.println(equals);//true
	   //or another way
	   System.out.println(x==y);//false --> bcz we compared literal and non literal String 
	}

}
