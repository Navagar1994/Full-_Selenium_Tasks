package org.test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertsss {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Administrator\\eclipse-workspace\\SeleniumDay1\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("http://demo.automationtesting.in/Alerts.html");
	
                //SIMPLE ALERT------> IT SHOWS ONLY OK BUTTON IN ALERT BOX
	
	WebElement btn = driver.findElement(By.xpath("(//a[contains(text(),'Alert')])[2]"));
	btn.click();
	
	WebElement btn1 = driver.findElement(By.xpath("//button[contains(text(),'click')]"));
	btn1.click();

//switchTo----> first we need switch into the alert button before click the ok button in alert box
//	        -->presente in webdriver interface
	
	TargetLocator switchTo = driver.switchTo();
	Alert alert = switchTo.alert();
//    or
	Alert a = driver.switchTo().alert();
	
//getText-----> It is used to get a text from alert box
	String text = a.getText();
	System.out.println(text);
//accept-----> It is used to click the ok button
	a.accept();
	
//CONFRIM ALERT----> IT SHOWS OK & CANCEL BUTTON IN ALERT BOX
	
	WebElement okbtn = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
	okbtn.click();
	
	 WebElement clbtn = driver.findElement(By.xpath("(//button[contains(text(),'click')])[2]"));
	clbtn.click();
	
	Alert b = driver.switchTo().alert();
	
	String text2 = b.getText();
	System.out.println(text2);
	
	a.dismiss();
	
//PROMPT ALERT---->>> IT SHOWS OK AND CANCEL BUTTON WITH TEXTBOX
	
	WebElement txtbox = driver.findElement(By.xpath("(//a[contains(text(),'Alert')])[4]"));
	txtbox.click();
	
	WebElement probtn = driver.findElement(By.xpath("//button[contains(text(),'prompt')]"));
	probtn.click();
	
	Alert c = driver.switchTo().alert();
	String text3 = c.getText();
	System.out.println(text3);
	c.dismiss();
	
	
	
	
	
	}

	}	

