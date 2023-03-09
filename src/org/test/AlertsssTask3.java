package org.test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsssTask3 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\eclipse-workspace\\SeleniumDay1\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement btn = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		btn.click();
		
		WebElement clbtn = driver.findElement(By.xpath("(//button[contains(text(),'box')])[3]"));
		clbtn.click();
		
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		
		
		
		
		
		
		
		
		
	}

}
