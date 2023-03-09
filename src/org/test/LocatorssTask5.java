package org.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorssTask5 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Administrator\\eclipse-workspace\\SeleniumDay1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.navigate().to("http://greenstech.in/selenium-course-content.html");
		
		WebElement btn = driver.findElement(By.xpath("//div[@id='heading20']"));
		btn.click();
		
		WebElement btn1 = driver.findElement(By.xpath("//a[text()='CTS Interview Question ']"));
		btn1.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
