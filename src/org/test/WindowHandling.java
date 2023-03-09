package org.test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	public static void main(String[] args) {
	
	System.setProperty("webdriver",
			"C:\\Users\\Administrator\\eclipse-workspace\\SeleniumDay1\\Driver\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.navigate().to("https://www.flipkart.com/");
	
	WebElement clbtn= driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
    clbtn.click();
	
	WebElement txtbox = driver.findElement(By.xpath("//input[@name='q']"));
	txtbox.sendKeys("vivo");
	
	WebElement sbtn = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
	sbtn.click();
	
	WebElement mobile = driver.findElement(By.xpath("(//div[contains(text(),'GB')])[1]"));
	mobile.click();
	
//To handle window
	
//getWindowHandle---->> it is used get parent window id only 
	String a = driver.getWindowHandle();//parent window//10
	System.out.println(a);

//getWindowHandles---->> it is used to get all window id's (both parent and child)
	
	Set<String> b = driver.getWindowHandles();// both parent & child window//10,20
	System.out.println(b);
	
//  THERE ARE THREE WAYS TO SWITCH INTO THE PARTICULAR WINDOW USING WINDOW ID 
	
	        System.out.println("...........way 1........");
	        
// using enhance for	        
	 for(String x:b) {
		 if(!x.equals(a)) {//10=10,10=20   --->>>> the use of not operator is if the condition is satisfied it gives true
			 driver.switchTo().window(x);//--->>>> if condition is not satisfied it gives true
			 
		 }
	 }
	 
		WebElement cartbtn = driver.findElement(By.xpath("//button[contains(@class,'-ww')]"));
		cartbtn.click();
	 
	 WebElement contact = driver.findElement(By.xpath("(//a[@class='_3hfHKJ'])[1]"));
	 contact.click();
	 
	 Set<String> c = driver.getWindowHandles();
	 System.out.println(c);
	 
	 
//to handle above 2 windows 
	       System.out.println("..........way 2............");
	     int i  = 3;  
     for( String y:c) {            // it pick the value one by one and stored in new variable
    	 if(i==3) {//1==3,2==3,3==3
    		 driver.switchTo().window(y);
    	 }
    	 
     }
     WebElement post = driver.findElement(By.xpath("//span[@class='_3qHGu7']"));
     post.click();
   
	      System.out.println(".............way 3...............");
	      
	     Set<String> d = driver.getWindowHandles();
	      System.out.println(d);
	
//to covert the set of string into list
	      
	      List <String>l = new ArrayList();
	      
//addAll
	      l.addAll(d);
	      
	      String e = l.get(2);
	      driver.switchTo().window(e);
	    	
}
}