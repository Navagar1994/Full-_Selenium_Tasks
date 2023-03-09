package org.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorssTask1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver",
				"C:\\Users\\Administrator\\eclipse-workspace\\SeleniumDay1\\Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		driver.navigate().to("https://www.amazon.in/");	
		//or
		driver.get("https://www.amazon.in/");
		
		WebElement a = driver.findElement(By.xpath("//input[@type='text']"));
		a.sendKeys("iphone");
		
		WebElement btn = driver.findElement(By.xpath("//input[contains(@id,'nav')]"));
		btn.click();
	}
}
