package org.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsss1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\eclipse-workspace\\SeleniumDay1\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
//Question---3
		
//		driver.get("http://www.flipkart.com");
		
		driver.manage().window().maximize();	
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		WebElement close = driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2doB4z')]"));
//		close.click();
//		
//		Actions a = new Actions(driver);
//		
//		WebElement home = driver.findElement(By.xpath("//div[text()='Home']"));
//		a.moveToElement(home).perform();
//		
//		WebElement btn = driver.findElement(By.xpath("(//a[contains(text(),'Home')])[1]"));
//		a.click(btn).perform();
//	
//		WebElement home1 = driver.findElement(By.xpath("//span[contains(text(),'Home')]"));
//		a.moveToElement(home1).perform();
//		
//		WebElement btn1 = driver.findElement(By.xpath("//a[contains(@title,'Bath')]"));
//		a.click(btn1).perform();
//		
//		WebElement txtuser = driver.findElement(By.xpath("//input[contains(@name,'q')]"));
//		txtuser.sendKeys("hand towel");
		
//Question---5
		
//		driver.get("https://www.shopclues.com/wholesale.html");
//		
//		Actions a = new Actions(driver);
//		
//		WebElement btn = driver.findElement(By.xpath("//a[text()='Sports & More']"));
//		a.moveToElement(btn).perform();
//		
//		WebElement btn1 = driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
//		a.click(btn1).perform();
	
//Question---6
		
//		driver.get("http://greenstech.in/selenium-course-content.html");
//	
//		Actions a = new Actions(driver);
//		
//		WebElement btn = driver.findElement(By.xpath("//div[text()='Courses ']"));
//		a.moveToElement(btn).perform();
//		
//		WebElement move = driver.findElement(By.xpath("//span[contains(text(),'(12)')]"));
//		a.moveToElement(move).perform();
//	
//		WebElement btn2 = driver.findElement(By.xpath("(//a[@target='_blank'])[52]"));
//		a.click(btn2).perform();
		
//Question---7
//		driver.get("http://greenstech.in/selenium-course-content.html");
//		
//		Actions a = new Actions(driver);
//		
//		WebElement btn = driver.findElement(By.xpath("//div[text()='Courses ']"));
//		a.moveToElement(btn).perform();
//		
//		WebElement move = driver.findElement(By.xpath("//span[contains(text(),'(48)')]"));
//		a.moveToElement(move).perform();
//	
//		WebElement btn1 = driver.findElement(By.xpath("(//span[contains(text(),'SQL')])[2]"));
//		a.click(btn1).perform();
	
//Question--8
//		driver.get("http://greenstech.in/selenium-course-content.html");
//		
//		Actions a = new Actions(driver);
//		
//		WebElement btn = driver.findElement(By.xpath("(//div[contains(text(),'Co')])[1]"));
//		a.moveToElement(btn).perform();
//		
//		WebElement move = driver.findElement(By.xpath("(//span[contains(text(),'Data')])[7]"));
//		a.moveToElement(move).perform();
//		
//		WebElement btn1 = driver.findElement(By.xpath("//span[contains(text(),'DataStage')]"));
//		a.click(btn1).perform();
	
//Question---9
//		driver.get("http://greenstech.in/selenium-course-content.html");
//		
//		Actions a = new Actions(driver);
//		
//		WebElement btn = driver.findElement(By.xpath("(//div[contains(text(),'Co')])[1]"));
//		a.moveToElement(btn).perform();
//		
//		WebElement move = driver.findElement(By.xpath("//span[contains(text(),'(6)')]"));
//		a.moveToElement(move).perform();
//		
//		WebElement btn1 = driver.findElement(By.xpath("//span[contains(text(),'Blue')]"));
//		a.click(btn1).perform();
		
//Question---10
//		driver.get("http://greenstech.in/selenium-course-content.html");
//		
//		Actions a = new Actions(driver);
//		
//		WebElement btn = driver.findElement(By.xpath("(//div[contains(text(),'Co')])[1]"));
//		a.moveToElement(btn).perform();
//		
//		WebElement btn1 = driver.findElement(By.xpath("(//span[contains(text(),'Data')])[7]"));
//		a.moveToElement(btn1).perform();
	
//Question---11
//		driver.get("https://www.homedepot.com/");
//		
//		Actions a = new Actions(driver);
//		
//		WebElement move = driver.findElement(By.xpath("(//a[contains(text(),'All')])[1]"));
//		a.moveToElement(move).perform();
//		
//		WebElement move1 = driver.findElement(By.xpath("(//a[contains(text(),'&')])[17]"));
//		a.moveToElement(move1).perform();
//		
//		WebElement move3 = driver.findElement(By.xpath("(//a[contains(@title,'Air Conditioners')])[1]"));
//		a.moveToElement(move3).perform();
//		
//		WebElement btn = driver.findElement(By.xpath("//a[contains(@title,'Portable Air Conditioners')]"));
//	    a.click(btn).perform();
		
//Question---12
//		driver.get("https://www.homedepot.com/");
//		
//		Actions a = new Actions(driver);	
//	
//		WebElement move = driver.findElement(By.xpath("(//a[contains(text(),'All')])[1]"));
//		a.moveToElement(move).perform();
//		
//		WebElement move1 = driver.findElement(By.xpath("(//a[contains(text(),'Pa')])[4]"));
//		a.moveToElement(move1).perform();
//		
//		WebElement move2 = driver.findElement(By.xpath("(//a[contains(text(),'Interior')])[1]"));
//		a.moveToElement(move2).perform();
//		
//		WebElement btn = driver.findElement(By.xpath("(//a[text()='Ceiling Paint'])[1]"));
//		a.click(btn).perform();
	
//Question--13
//		driver.get("https://www.snapdeal.com/");
	
		
		
//Question---14
//		driver.get("https://www.snapdeal.com/");
//		
//		Actions a = new Actions(driver);
//		
//		WebElement move = driver.findElement(By.xpath("(//span[@class='catText'])[2]"));
//		a.moveToElement(move).perform();
//		
//		WebElement btn = driver.findElement(By.xpath("//span[text()='Heels']"));
//		a.click(btn).perform();
	
//Question---15----------> INCOMPLETE
//		driver.get(" https://www.amazon.in/");
//		
//		Actions a = new Actions(driver);
//		
//		WebElement move = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
//		a.moveToElement(move).perform();
//		
//		WebElement click = driver.findElement(By.xpath("(//a[contains(@rel,'nofollow')])[2]"));
//		a.click(click).perform();
//		
//		WebElement txtuser = driver.findElement(By.id("ap_customer_name"));
//		a.sendKeys("vijayaragavan s").perform();
//		
//		WebElement mobileno = driver.findElement(By.xpath("//input[contains(@type,'tel')]"));
//		a.sendKeys("9876543210").perform();

//Question---16----> INCOMPLETE
//		driver.get(" https://www.amazon.in/");
		
		
		
//Question---17
		driver.get("https://www.flipkart.com/");
		
		Actions a = new Actions(driver);
		
		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		a.click(close).perform();
		
		WebElement move = driver.findElement(By.xpath("(//a[contains(text(),'Women')])[3]"));
		a.moveToElement(move).perform();
		
		WebElement move1 = driver.findElement(By.xpath("(//a[contains(@class,'_6WOcW9 _3YpNQe')])[2]"));
		a.click(move1).perform();
		
		
		
		
		
		
		
		
		
		
		
}
}