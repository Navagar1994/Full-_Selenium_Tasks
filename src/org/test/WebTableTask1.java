package org.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTask1 {
	
	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Administrator\\eclipse-workspace\\SeleniumDay1\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.navigate().to("http://demo.guru99.com/test/write-xpath-table.html");
		 
		 List<WebElement> table = driver.findElements(By.tagName("table"));
		 
//to get all values in table
		 
		 WebElement table1 = table.get(1);
		 System.out.println(table1.getText());
	
	}
}


