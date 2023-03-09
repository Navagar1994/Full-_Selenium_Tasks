package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	
	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver",
	         "C:\\Users\\Administrator\\eclipse-workspace\\SeleniumDay1\\Driver\\chromedriver.exe");//set.property is a static method 
		                                                                                            //it presented in class of system.
		WebDriver driver = new ChromeDriver();// WebDriver is a pre defined interface
		
		driver.get("https://www.facebook.com/");
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.quit();
		}
}
