package org.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorssTask6 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\eclipse-workspace\\SeleniumDay1\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.navigate().to("https://www.redbus.in/");
		//or
		driver.get("https://www.redbus.in/");
		
//alert handle
//		Alert a = driver.switchTo().alert();
//		
//		a.accept();
		
	    WebElement txtfrom = driver.findElement(By.xpath("//input[@id='src']"));
		txtfrom.sendKeys("thambaram chennai");
		
		WebElement txtto = driver.findElement(By.xpath("//input[@id='dest']"));
		txtto.sendKeys("hurur");
		
		WebElement date = driver.findElement(By.xpath("(//input[@class='db'])[3]"));
        date.click();
        
        WebElement dbtn = driver.findElement(By.xpath("(//td[@class='we day'])[2]"));
        dbtn.click();
        
        WebElement sbtn = driver.findElement(By.xpath("//button[@class='fl button']"));
        sbtn.click(); 
        
        
       
        
        
		
		
		
		
		
		
	}

}
