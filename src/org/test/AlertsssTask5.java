package org.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsssTask5 {     // incomplete
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\eclipse-workspace\\SeleniumDay1\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		
		WebElement link = driver.findElement(By.xpath("//a[contains(text(),'https:')]"));
		link.click();
		
		WebElement btn = driver.findElement(By.xpath("//span[text()='LOGIN']"));
		btn.click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
