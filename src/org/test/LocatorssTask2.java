package org.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorssTask2{
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\eclipse-workspace\\SeleniumDay1\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		driver.get("https://www.facebook.com/");
		//or
		driver.navigate().to("https://www.facebook.com/");
		
		WebElement txtuser = driver.findElement(By.xpath("//input[contains(@id,'email')]"));
		txtuser.sendKeys("navagar");
		
		WebElement txtpass = driver.findElement(By.xpath("//input[@name='pass']"));
		txtpass.sendKeys("987654");
		
		WebElement btn = driver.findElement(By.xpath("//button[@name='login']"));
		btn.click();
		
	}
	

}
