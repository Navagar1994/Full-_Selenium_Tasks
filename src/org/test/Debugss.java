package org.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Debugss {
	
	public static void main(String[] args) throws InterruptedException   {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\eclipse-workspace\\SeleniumDay1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(" https://www.facebook.com/");
		
//		Options manage = driver.manage();//-------DYNAMIC WAIT
//		Timeouts timeouts = manage.timeouts();
//		timeouts.implicitlyWait(Duration.ofSeconds(10));
		//  or    //
		
//		driver.manage().window().maximize();//----IT'S USED TO MAXIMIZE THE WINDOW
		
		WebElement createbtn = driver.findElement(By.xpath("(//a[contains(@role,'button')])[2]"));
		createbtn.click();
		
		Thread.sleep(5000);//-------STATIC WAIT
		
		WebElement fstname = driver.findElement(By.name("firstname"));
		fstname.sendKeys("vijaya");
		
		
		WebElement lstname = driver.findElement(By.name("lastname"));
		lstname.sendKeys("ragavan");
		
		WebElement mobileno= driver.findElement(By.name("reg_email__"));
		mobileno.sendKeys("9876543210"); 	
		
		WebElement pass = driver.findElement(By.id("password_step_input"));
		pass.sendKeys("87654123");	
			
		
	}

}
