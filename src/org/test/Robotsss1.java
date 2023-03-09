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

public class Robotsss1 {
	
	public static void main(String[] args) throws AWTException   {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\eclipse-workspace\\SeleniumDay1\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
	    
//Q-1
//		driver.get("https://www.facebook.com/");
		
		
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		Robot r  = new Robot();
//
//		WebElement txtemail = driver.findElement(By.id("email"));
//		txtemail.sendKeys("arnold@gmail.com");
//		
//		
////To select the element----Ctrl+a
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_A);
//		
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_A);
//	
////To cut selected element---Ctrl+X
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_X);
//		
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_0);
//		
////To move next step---Ctrl+tab
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_TAB);
//      
//        r.keyRelease(KeyEvent.VK_CONTROL);
//        r.keyRelease(KeyEvent.VK_TAB);
//		
////To paste the copied element--Ctrl+V
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_V);
//		
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_V);
		
		
		
		
//Q-2
//		driver.get("https://www.google.co.in/webhp ");
//		
//		WebElement txtname = driver.findElement(By.name("q"));
//		txtname.sendKeys("velmurugan");
//		
//		Actions a = new Actions(driver);
//		
////doubleClick
//		a.doubleClick(txtname).perform();
//		
////To cut the webElement using shortCut----> ctrl+x
//		
//		Robot r = new Robot();
//		
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_X);
//		
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_X);
//		
		
//Q-3
//		driver.get("http://greenstech.in/selenium-course-content.html");
//		
//		WebElement btn = driver.findElement(By.id("heading20"));
//		btn.click();
//		
//		Robot r  = new Robot();
//		
//		Actions a = new Actions(driver);
//		
//		for(int i=0;i<6;i++) {
//			r.keyPress(KeyEvent.VK_DOWN);
//			r.keyRelease(KeyEvent.VK_DOWN);
//		}
//		WebElement btn1 = driver.findElement(By.xpath("(//a[contains(text(),'Interview')])[6]"));
////contextClick--it is used to double click
//		
//		a.contextClick(btn1).perform();
//		
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
////		
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		
//	    r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
		
		
//Q-4
//		driver.get("http://greenstech.in/selenium-course-content.html");
//		
//		WebElement btn= driver.findElement(By.xpath("(//h2[contains(@class,'mb-0')])[8]"));
//		
//		Actions a = new Actions(driver);
//		
////To right click----contextClick
//		a.contextClick(btn).perform();
//		
//		Robot r = new Robot();
//		
//  		for(int i=0;i<10;i++) {
//  			r.keyPress(KeyEvent.VK_DOWN);
//  			r.keyRelease(KeyEvent.VK_DOWN);
//  		}
//  		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);

//Q-5
//		driver.get("http://greenstech.in/selenium-course-content.html");
//		
//		WebElement btn = driver.findElement(By.xpath("(//h2[contains(@class,'mb-0')])[3]"));
//		btn.click();
//		
//		Actions a = new Actions(driver);
//		
//		WebElement btn1 = driver.findElement(By.id("heading201"));
//		
////contextClick-- to Right click
//		
//		a.contextClick(btn1).perform();
//		
//		Robot r = new Robot();
//		
//		for(int i=0;i<4;i++) {
//			r.keyPress(KeyEvent.VK_DOWN);
//			r.keyRelease(KeyEvent.VK_DOWN);
//		}
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
		
//Q-6
//		driver.get("http://greenstech.in/selenium-course-content.html");
//		
//		WebElement btn = driver.findElement(By.xpath("(//a[contains(@title,'c')])[79]"));
//		
//		Actions a = new Actions(driver);
//		
//		a.contextClick(btn).perform();
//		
//		Robot r = new Robot();
//		
//	    for(int i=0;i<6;i++) {
//	    	r.keyPress(KeyEvent.VK_DOWN);
//	    	r.keyRelease(KeyEvent.VK_DOWN);
//	    }
//	    r.keyPress(KeyEvent.VK_ENTER);
//	    r.keyRelease(KeyEvent.VK_ENTER);
	    
//Q-7
//		driver.get("http://greenstech.in/selenium-course-content.html");
//		
//		WebElement btn = driver.findElement(By.xpath("(//h2[contains(text(),'Selenium')])[5]"));
//		btn.click();
//		
//		WebElement ritclick= driver.findElement(By.xpath("//a[text()=' DAY 6 TASK']"));
//		
//		Actions a = new Actions(driver);
//		
//		a.contextClick(ritclick).perform();
//		
//		Robot  r = new Robot();
//		
//		for(int i=0; i<10;i++) {
//			r.keyPress(KeyEvent.VK_DOWN);
//			r.keyRelease(KeyEvent.VK_DOWN);
//		}
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
		
//Q-8
		driver.get(" https://www.flipkart.com/");
		
//		WebElement btn = driver.findElement(By.xpath("(//button[contains(@type,'submit')])[2]"));
//		btn.click();
		
		WebElement txtname = driver.findElement(By.id("(//input[contains(@autocomplete,'off')])[2]"));
		txtname.sendKeys("vijayaragavan");
		
		
		
		
	}
}

