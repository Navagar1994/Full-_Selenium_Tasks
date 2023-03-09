package org.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorssTask4 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Administrator\\eclipse-workspace\\SeleniumDay1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		driver.navigate().to("http://toolsqa.com/automation-practice-form/");
		//or
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		WebElement click = driver.findElement(By.xpath("(//a[text()='Selenium Training'])[1]"));
		click.click();
		
		WebElement btn = driver.findElement(By.xpath("//a[contains(text(),'Go')]"));
		btn.click();
		
		WebElement fstname = driver.findElement(By.xpath("//input[@name='firstName']"));
		fstname.sendKeys("vijaya");
		
		WebElement lstname = driver.findElement(By.xpath("//input[@name='lastName']"));
		lstname.sendKeys("ragavan");
		
		WebElement txtmail = driver.findElement(By.xpath("//input[@name='email']"));
		txtmail.sendKeys("arnold@gmail.com");
		
		WebElement mobileno = driver.findElement(By.xpath("//input[@name='mobile']"));
		mobileno.sendKeys("9876543210");
		
		WebElement a = driver.findElement(By.id("country"));
		
		Select s = new Select(a);
		
		s.selectByValue("4");
		
		WebElement city = driver.findElement(By.xpath("//input[@id='city']"));
		city.sendKeys("hurur");
		
		WebElement text = driver.findElement(By.xpath("//textarea[@name='message']"));
		text.sendKeys("hello this is vijayaragavan");
		
		WebElement captcha = driver.findElement(By.xpath("//input[@id='code']"));
		captcha.sendKeys("VfXm");
		
		WebElement btn1 = driver.findElement(By.xpath("//button[text()='Send']"));
		btn1.click();
		
		
		
		
	}

}
