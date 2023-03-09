package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrlLaunch {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\eclipse-workspace\\SeleniumDay1\\Driver\\chromedriver.exe");	

	WebDriver driver = new ChromeDriver();
	
	 driver.get("http://www.greenstechnologys.com/");
	 
	 String url = driver.getCurrentUrl();
	 System.out.println(url);
	
}
}
