package org.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {
	
	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\eclipse-workspace\\SeleniumDay1\\Driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			 driver.manage().window().maximize();
			 
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 
			 driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
			 
			 List<WebElement> table = driver.findElements(By.tagName("table"));
			 
// To get all values in the table
//			 
			 WebElement table1 = table.get(1);
			 System.out.println(table1.getText());
			 
// To get all headers in the table
			 
//			 List<WebElement> header = table1.findElements(By.tagName("hd"));
//			 
//			 for(int i=0;i<header.size();i++) {
//				 WebElement header1 = header.get(i);
//				 System.out.println(header1.getText());
//			 }
//// To get all datas in the table
//			 
//			 List<WebElement> data = table1.findElements(By.tagName("td"));
//			 
//			 for(int i=0;i<data.size();i++) {
//				 WebElement data1 = data.get(i);
//				 System.out.println(data1.getText());
//			 }
			 
// To know row size
			  
			 List<WebElement> row = table1.findElements(By.tagName("tr"));
			 
			 int size = row.size();
			 System.out.println(size);
			 
// To gat all values in row wise 
			 
				
				 
				 for(int i=0;i<row.size();i++) {
					 WebElement value = row.get(i);
					 System.out.println(value.getText());
				 }
				 
// To get all headers in row wise
				 
				 for(int i=0;i<row.size();i++) {
					 WebElement header = row.get(i);
					 List<WebElement> headers = header.findElements(By.tagName("td"));
					 for(int j=0;j<headers.size();) {
						 WebElement header1 = headers.get(j);
						 System.out.println(header1.getText());
					 }
				 }
				 
			 
			 
			 
			 
			 
			 
				 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
	}
}

