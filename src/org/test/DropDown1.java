package org.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 {

	public static void main(String[]args) {
		
//Question-3
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\Administrator\\eclipse-workspace\\SeleniumDay1\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
//		driver.get("https://www.facebook.com/");
//		
//		WebElement btn = driver.findElement(By.xpath("//a[text()='Create New Account']"));
//		btn.click();
//		
//		WebElement year = driver.findElement(By.id("year"));
//		
//		Select s = new Select(year);
//		
//		s.selectByVisibleText("1994");
//	
//		List<WebElement> x = s.getOptions();
//		
//		for(int i=0;i<x.size();i++) {
//			WebElement y = x.get(i);
//		    String z = y.getAttribute("value");
//		    System.out.println(z);
    	
  

//Qustion-4
//		WebElement btn = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
//		btn.click();
//		
//		WebElement month = driver.findElement(By.id("month"));
//		
//		Select s = new Select(month);
//		
//		s.selectByValue("5");
//		
//		List<WebElement> single = s.getOptions();
//		
//		for(int i=0;i<single.size();i++) {
//			WebElement x = single.get(i);
//			String y = x.getText();
//			System.out.println(y);
//		}
		
//Q---6
//		driver.get("http://demo.guru99.com/test/newtours/register.php");
//		
//		
//		WebElement box = driver.findElement(By.xpath("//select[@name='country']"));
//		
//		Select s = new Select(box);
//		
//		s.selectByValue("INDIA");
//		
//		List<WebElement> group = s.getOptions();
//		
//		for(int i=0;i<group.size();i++) {
//			WebElement x = group.get(i);
//			String y = x.getText();
//			System.out.println(y);
//		}
		
//Q---7
//		driver.get("http://demo.guru99.com/test/newtours/register.php");
//		
//		WebElement box = driver.findElement(By.xpath("//select[@size='1']"));
//		
//		Select s = new Select(box);
//		
//		s.selectByValue("INDIA");
//		
//		List<WebElement> group = s.getOptions();
//		
//		for(int i=0;i<group.size();i++) {
//			WebElement x = group.get(i);
//			String y = x.getAttribute("value");
//			System.out.println(y);
//		}

//Q---8  -->INCOMPLETE
//		driver.get("http://adactinhotelapp.com/");
//		
//		WebElement txtuser = driver.findElement(By.id("username"));
//		txtuser.sendKeys("arnold");
//		
//		WebElement txtpass = driver.findElement(By.id("password"));
//		txtpass.sendKeys("987650");
//		
//		WebElement btn= driver.findElement(By.id("login"));
//		btn.click();
		
		
//Q---13
		
	driver.get("http://adactin.com/HotelApp/");
	

	
	 
	
	
	
	
	}
}
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

