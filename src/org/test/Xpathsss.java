package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathsss {
	
	public static void main(String[] args) {
		System.setProperty("webdriver",
				"C:\\Users\\Administrator\\eclipse-workspace\\SeleniumDay1\\Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
//		
//		WebElement txtid = driver.findElement(By.id("email"));
//		txtid.sendKeys("vijayaragavan");
//		
//		WebElement txtpass = driver.findElement(By.id("pass"));
//		txtpass.sendKeys("756432");
		
//		WebElement txtbtn = driver.findElement(By.xpath("(html/body/div/div/div/div/div/div/div/div)[2]"));
//		txtbtn.click();
		
//XPATH-- if id,name,classname is not presented we go for XPATH
		
//ABSOLUTE XPATH-1)IT DON'T HAVE ANY METHOD 
		
		WebElement txtid = driver.findElement(By.xpath("//input[@id='email']"));
		txtid.sendKeys("vijayaragavan");
		
	    WebElement txtpass = driver.findElement(By.xpath("//input[@name='pass']"));
	    txtpass.sendKeys("9876540980");
	    
	    //by using position
	    WebElement txtbtn = driver.findElement(By.xpath("(//button[@name='login'])[1]"));
	    txtbtn.click();
	    
//	    //by using findElements
//	    List<WebElement> txtbtn1 = driver.findElements(By.xpath("//button[@name='login']"));
//	    
//	    WebElement btn = txtbtn1.get();
//	    btn.click();
		
	}

}
