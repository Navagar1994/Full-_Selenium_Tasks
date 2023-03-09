package org.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsssTask6 {    // incomplete
	
	public static void main(String[] args) {
	
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\Administrator\\eclipse-workspace\\SeleniumDay1\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
