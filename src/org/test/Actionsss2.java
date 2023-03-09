package org.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.interactions.Actions;

public class Actionsss2 {

	public static void main(String[] args) {
	
//Q---2
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\Administrator\\eclipse-workspace\\SeleniumDay1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		WebElement prime = driver.findElement(By.xpath("//span[text()='Prime']"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(prime).perform();
		
		WebElement ffd = driver.findElement(By.xpath("//img[contains(@src,'https://m.media-amazon.com/images/G/31/prime/NavFlyout/TryPrime/2018/Apr/IN-Prime-PIN-TryPrime-MultiBen-Apr18-400x400._CB442254244_.jpg')]"));
		a.click(ffd).perform();
		

		
		
	}	
	
}
