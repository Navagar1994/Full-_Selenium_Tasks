package org.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTask2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\eclipse-workspace\\SeleniumDay1\\Driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			 driver.manage().window().maximize();
			 
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 
			 driver.navigate().to("http://demo.guru99.com/test/write-xpath-table.html");
			 
			 List<WebElement> table = driver.findElements(By.tagName("table"));
			 
//To get all values in table
			 
			 WebElement table1 = table.get(1);
			 

			 
//			 WebElement table1 = table.get(1);
			 
			 List<WebElement> row = table1.findElements(By.tagName("tr"));

// To get first row values
			 WebElement row2 = row.get(0);
			 System.out.println(row2.getText());
			 
//	To get all row values		 
//			 for(int i=0;i<row.size();i++) {
//				 WebElement row1 = row.get(i);
//				 System.out.println(row1.getText());
//			 }
			
       }
}

	
			 
			 
			 
			  
			 
	
	         
	
			 
			 
			 
			 
			 
			 
			 
			 
	


