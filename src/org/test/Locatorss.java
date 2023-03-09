package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorss {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\eclipse-workspace\\SeleniumDay1\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(" https://www.facebook.com/ ");
		
		WebElement txtid = driver.findElement(By.id("email"));
		txtid.sendKeys("vijayaragavan");
		
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("123456");
		
		WebElement txtlogin = driver.findElement(By.name("login"));
		txtlogin.click();
		
	}

}

