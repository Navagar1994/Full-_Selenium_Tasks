package org.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDownDay2 {

	public static void main(String[] args) {
	
//Question---13
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\eclipse-workspace\\SeleniumDay1\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		
		driver.get("http://output.jsbin.com/osebed/2");
	
		WebElement fruit = driver.findElement(By.id("fruits"));
		
		Select s = new Select(fruit);
		
		s.selectByIndex(0);// it is used to find particular option in dropdown using index position
		
		s.selectByValue("banana");// it is used to find particular option in dropdown using value
		
		s.selectByVisibleText("Banana");// it is use to find 
		
		boolean a = s.isMultiple();
		System.out.println(a);
		
		List<WebElement> options = s.getOptions();
		
		for(int i=0;i<options.size();i++) {
		WebElement single = options.get(i);
//		String text = single.getText();
//		System.out.println(text);
		//or 
		System.out.println(single.getText());
		}
		          System.out.println("..........getAllSelectedOptions...........");
//getAllSelectedOptions-----> it is used to get which option is we select but it gets all options as a list of webelement
		
		List<WebElement> list = s.getAllSelectedOptions();
		
		for(int i=0;i<list.size();i++) {
		WebElement single = list.get(i);
		System.out.println(single.getText());
		}
		         System.out.println(".........getFirstSelectedOptions..........");
//getFirstSelectedOption-----> it is used to get which option is we selected first
		
		WebElement single = s.getFirstSelectedOption();
		System.out.println(single.getText());
		
                 System.out.println(".........deSelectAll.........");
                 
//deselectAll--------> it is used to deselect all options which is alreay selected
                 
//deselectByIndex
       s.deselectByIndex(3);
       
//deSelectByValue
       s.deselectByValue("orange");
 
//deselectByVisibleText
       s.deselectByVisibleText("Apple");
        
      //           List<WebElement> options = s.getOptions();
        
        for(int i=0;i<options.size();i++) {
        	s.selectByIndex(2);
        }
        
        s.deselectAll();       
                 
         // Enhance for using getAttribute("value")
        for(WebElement x:options) {
        	String attribute = x.getAttribute("value");
        	s.deselectByValue(attribute);
        }     
        
       
        s.deselectAll();
        
         // deselectAll- Enhance for using getText
        for(WebElement y:options) {
        	String text = y.getText();
        	s.deselectByVisibleText(text);
        }
        
	}
}
       
                 

                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
	               

