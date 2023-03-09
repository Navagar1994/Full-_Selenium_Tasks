package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsss {
	
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\Administrator\\eclipse-workspace\\SeleniumDay1\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("http://demo.guru99.com/test/drag_drop.html");
//		
//		WebElement drag = driver.findElement(By.xpath("//a[contains(text(),' 5000')]"));
//		
//		WebElement drop = driver.findElement(By.id("amt7"));
//		
//		Actions a = new Actions(driver);
//		
//		a.dragAndDrop(drag,drop).perform();
//		// or another method
//		a.clickAndHold(drag).moveToElement(drop).release(drop).perform();		
		
		
		WebElement drag = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		
		WebElement drop = driver.findElement(By.xpath("(//h3[contains(@align,'center')])[6]"));
		 
		Actions a = new Actions(driver);
		
		a.dragAndDrop(drag,drop).perform();
		//or
		a.clickAndHold(drag).moveToElement(drag).release(drop).perform();
		
		             ///// incomplete/////
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
}
