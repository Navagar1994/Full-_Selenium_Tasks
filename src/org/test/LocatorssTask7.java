package org.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorssTask7 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver",
				"C:\\Users\\Administrator\\eclipse-workspace\\SeleniumDay1\\Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.navigate().to("https://www.cleartrip.com/trains");
		
		WebElement txtfrom = driver.findElement(By.xpath("//input[@name='from_station']"));
		txtfrom.sendKeys("chennai");
		
		WebElement txtcity = driver.findElement(By.xpath("//input[@title='To station']"));
		txtcity.sendKeys("hurur");
		
		WebElement coach = driver.findElement(By.xpath("//Select[@id='trainClass']"));
		
		Select s = new Select(coach);
		
		s.selectByIndex(7);
		
		WebElement date = driver.findElement(By.xpath("//input[@size='14']"));
		date.click();
		
		WebElement date1 = driver.findElement(By.xpath("//a[text()='11']"));
		date1.click();
		
        WebElement acount = driver.findElement(By.name("adults"));
		
		Select s1 = new Select(acount);
		
		s1.selectByIndex(2);
		
		WebElement ccount = driver.findElement(By.name("children"));
		
		Select s2 = new Select(ccount);
		
		s2.selectByVisibleText("2");
		
		WebElement smen = driver.findElement(By.name("male_seniors"));
		
		Select s3 = new Select(smen);
		
		s3.selectByIndex(1);
		
		WebElement swomen = driver.findElement(By.name("female_seniors"));
		
		Select s4 = new Select(swomen);
		
		s4.selectByVisibleText("1");
	
		WebElement btn1 = driver.findElement(By.xpath("//button[@id='trainFormButton']"));
		btn1.click();
		
		WebElement clbtn = driver.findElement(By.xpath("//a[@id='close']"));
		clbtn.click();
		
	}

}
