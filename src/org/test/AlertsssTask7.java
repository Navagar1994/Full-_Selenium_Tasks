package org.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsssTask7 {
		
		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Administrator\\eclipse-workspace\\SeleniumDay1\\Driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get(" https://netbanking.hdfcbank.com/netbanking/");
			
			List<WebElement> a = driver.findElements(By.tagName("frameset"));
			System.out.println(a.size());
			
			driver.switchTo().frame(0);
		
			WebElement txtuser = driver.findElement(By.xpath("//input[@type='text']"));
			txtuser.sendKeys("9876543210");
			
			WebElement btn = driver.findElement(By.xpath("//a[contains(@class,'btn')]"));
			btn.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
