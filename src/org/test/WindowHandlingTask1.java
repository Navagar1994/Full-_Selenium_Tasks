package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.service.DriverCommandExecutor;

public class WindowHandlingTask1 {
	
	public static void main(String[] args) throws AWTException  {
		
		System.setProperty("webdriver",
				"C:\\Users\\Administrator\\eclipse-workspace\\SeleniumDay1\\Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.navigate().to("https://www.amazon.com/");
		
		WebElement close = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
		close.click();
		
		WebElement txtbox = driver.findElement(By.xpath("//input[@type='text']"));
		txtbox.sendKeys("iphonesx");
		
		WebElement srbtn = driver.findElement(By.xpath("//input[@value='Go']"));
		srbtn.click();
		
		WebElement iphone = driver.findElement(By.xpath("(//h2[contains(@class,'a')])[1]"));
		
		Actions a = new Actions(driver);
		
		a.contextClick(iphone).perform();
		
		String w = driver.getWindowHandle();
		System.out.println(w);
		
		Set<String> x = driver.getWindowHandles();
		System.out.println(x);
		
		// switchTo window way-3 
//		List <String>l = new ArrayList();
//		
//		l.addAll(x);
//		
//		String y = l.get(1);
//		System.out.println(y);
		
		//  switchTo window way -1
		for(String y:x) {
			if(!y.equals(w)) {
				driver.switchTo().window(y);
			}
		}
		
		Robot r = new Robot();
		for(int i=0;i<1;i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);	
		
		WebElement d = driver.findElement(By.xpath("(//table[contains(@class,'a')])[2]"));
		System.out.println(d.getText());
	}
	   

}
