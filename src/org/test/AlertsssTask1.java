package org.test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsssTask1 {

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\Administrator\\eclipse-workspace\\SeleniumDay1\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement btn = driver.findElement(By.xpath("(//button[contains(text(),'click')])[1]"));
		btn.click();
		
		TargetLocator s = driver.switchTo();
		Alert a = s.alert();
		
		a.accept();
	}
}
