package org.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {
	
	public static void main(String[] args) {
		
	
//	System.setProperty("webdriver.chrome.driver",
//			"C:\\Users\\Administrator\\eclipse-workspace\\SeleniumDay1\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 driver.get("https://www.w3schools.com/html/html_tables.asp");
		 
		 List<WebElement> table = driver.findElements(By.tagName("table"));		
		 
//To get all values in the table	 
//		 WebElement table1 = table.get(0);
//		 
//		 String text = table1.getText();
//		 System.out.println(text);
////		 
////To get all headers in the table
//		 List<WebElement> header = table1.findElements(By.tagName("th"));
//		 
//		 for(int i=0;i<header.size();i++) {
//			 WebElement a = header.get(i);
//			 System.out.println(a.getText());
//		 }
//	
////To get all datas in the table
//		 List<WebElement> data = table1.findElements(By.tagName("td"));
//		 
//		 for(int i=0;i<data.size();i++) {
//			 WebElement b = data.get(i);
//			 System.out.println(b.getText());
//		 }
		 
//to get all values in row wise
		 WebElement table1 = table.get(0);
		 
		 List<WebElement> row = table1.findElements(By.tagName("tr"));
		 
		 for(int i=0;i<row.size();i++) {
			 WebElement c = row.get(i);
			 System.out.println(c.getText());
		 }
		 
		 System.out.println();
// To get all headers in row wise
		 
		 for(int i=0;i<row.size();i++) {
			 WebElement header = row.get(i);
			 List<WebElement> d = header.findElements(By.tagName("th"));
			 for(int j=0;j<d.size();j++) {
				 WebElement single = d.get(j);
				 System.out.println(single.getText());
			 }
		 }
// To get all datas row wise 
		 
		 for(int i=0; i<row.size();i++) {
			 WebElement data = row.get(i);
			 List<WebElement> datas = data.findElements(By.tagName("td"));
			 for(int j=0;j<datas.size();j++) {
				 WebElement data1 = datas.get(j);
				 System.out.println(data1.getText());
			 }
		 }
		 //to get particular data
			 for(int i=0;i<row.size();i++) {
				 WebElement e = row.get(i);
				 List<WebElement> data = e.findElements(By.tagName("td"));
				 for(int j=0;j<data.size();j++) {
					 WebElement f = data.get(j);
					 String text = f.getText();
					 System.out.println(text);
					 if(text.equals("UK"));{
					 System.out.println(text);
					 
//					 String text2 = e.getText();
//					 System.out.println(text2);
					 }
					 
					 
					 
				 }
			 }
	
				 
				 
			 
// To get last row values
			 int size = row.size();// first find the size then find particular row value
			 System.out.println(size);
			 
			 WebElement lastrow = row.get(row.size()-1);
			 System.out.println(lastrow.getText());
			            //or another way to find last row values
			 List<WebElement> lastrowdata = lastrow.findElements(By.tagName("td"));
			 
			 for(int i=0;i<lastrowdata.size();i++) {
				 WebElement g = lastrowdata.get(i);
				 System.out.println(g.getText());
			 }
			 
		}
		 }
		 
		 
	
		


