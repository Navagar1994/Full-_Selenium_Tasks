package org.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDay1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Administrator\\eclipse-workspace\\SeleniumDay1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
		
		WebElement btn = driver.findElement(By.xpath("(//a[contains(@role,'button')])[2]"));
		btn.click();
		
		WebElement date = driver.findElement(By.id("day"));
		
		Select s = new Select(date);
		
//selectByIndex----> To select particular position, presented in class of Select
		
		s.selectByIndex(21);
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select s1 = new Select(month);
		
//selectByIndex-->Mention index position as a argument
		//or selectByValue---> Mention the month value within double codes
		
//		s1.selectByIndex(0);
		 //OR
		s1.selectByValue("5");
		
		WebElement year = driver.findElement(By.id("year"));
		
		Select s2 = new Select(year);
		
//selectByVisibleText---> to select the particular position
		s2.selectByVisibleText("1994");
		
//isMultiple----->To cheack whether we select multiple options  or not
		boolean a = s2.isMultiple();
		System.out.println(a);
		
//getOptions----> To get all options and find its list of webelement 
		
		List<WebElement> b = s1.getOptions();
		
		for(int i=0;i<b.size();i++) {
			WebElement c = b.get(i);
			String text = c.getText();
			System.out.println(text);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
