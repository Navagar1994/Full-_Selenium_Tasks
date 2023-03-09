package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Sleeper;

public class Robotsss {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\eclipse-workspace\\SeleniumDay1\\Driver\\chromedriver.exe");
		
	 WebDriver driver = new ChromeDriver();
	    
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	 driver.get("https://www.facebook.com/");
// 
//	 WebElement txtuser = driver.findElement(By.id("email"));
//	 txtuser.sendKeys("vijayaragavan");	
//	 
	 Actions a = new Actions(driver);
//	 
////doubleClick---->it is used to double click the element or text in the webpage
//	 
//	 a.doubleClick(txtuser).perform();
//		
////contextClick----> it used to right click to already found element
//	 
//	 a.contextClick(txtuser).perform();
//	
//	 Robot r = new Robot();
//	 
////keyPress------> it is used to press the key
//
//	 r.keyPress(KeyEvent.VK_DOWN);
//	r.keyRelease(KeyEvent.VK_DOWN);
//	
//	r.keyPress(KeyEvent.VK_DOWN);
//	r.keyRelease(KeyEvent.VK_DOWN);
//	
//	r.keyPress(KeyEvent.VK_DOWN);
//	r.keyRelease(KeyEvent.VK_DOWN);
//	
//	r.keyPress(KeyEvent.VK_DOWN);
//	r.keyRelease(KeyEvent.VK_DOWN);
//	
//	r.keyPress(KeyEvent.VK_DOWN);
//	r.keyRelease(KeyEvent.VK_DOWN);
//	
//	r.keyPress(KeyEvent.VK_ENTER);
//	r.keyPress(KeyEvent.VK_ENTER);
//	
//	 WebElement txtpass = driver.findElement(By.id("pass"));
//	
//	  a.contextClick(txtpass).perform();
//	 
//	 for(int i=0;i<5;i++) {
//		 r.keyPress(KeyEvent.VK_DOWN);
//		 r.keyRelease(KeyEvent.VK_DOWN); 
//	 }
//	  r.keyPress(KeyEvent.VK_ENTER);
//	  r.keyRelease(KeyEvent.VK_ENTER);
	  
	 //////  USING ONLY KEYBOARD ACTION  //////
	 
	 WebElement txtuser= driver.findElement(By.id("email"));
	 txtuser.sendKeys("vijayaragavan");
	 
	Robot r = new Robot();
	
	
//TO SELECT THE ELEMENT ----> Ctrl+A
	 Thread.sleep(5000);
	 r.keyPress(KeyEvent.VK_CONTROL);
	 r.keyPress(KeyEvent.VK_A);
	 
	 r.keyRelease(KeyEvent.VK_CONTROL);
	 r.keyRelease(KeyEvent.VK_A);
	 
//TO COPY THE SELECTED ELEMENT----> Ctrl+C
	 
	 r.keyPress(KeyEvent.VK_CONTROL);
	 r.keyPress(KeyEvent.VK_C);
	 
	 r.keyRelease(KeyEvent.VK_CONTROL);
	 r.keyRelease(KeyEvent.VK_C);
	 
//TO MOVE NEXT----> Tab
	  r.keyPress(KeyEvent.VK_TAB);
	  r.keyRelease(KeyEvent.VK_TAB);
	  
//TO PASTE THE COPIED ELEMENT----> Ctrl+V
	  
	  r.keyPress(KeyEvent.VK_CONTROL);
	  r.keyPress(KeyEvent.VK_V);
	  
	  r.keyRelease(KeyEvent.VK_CONTROL);
	  r.keyRelease(KeyEvent.VK_V);
	 
	 
	 
	   
	 
	 
	 
	 
	 
	 
	 
	 
	 
	   
	 
	 
	 
	}

}
