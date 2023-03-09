package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorssTask3 {
	
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Administrator\\eclipse-workspace\\SeleniumDay1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Navigation a = driver.navigate();
		a.to("http://demo.automationtesting.in/Register.html");
		//or
//		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement fstname = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		fstname.sendKeys("vijaya");
		
		WebElement lstname = driver.findElement(By.xpath("(//input[contains(@class,'form')])[2]"));
		lstname.sendKeys("ragavan");
		
		WebElement txtadd = driver.findElement(By.xpath("//textarea[@rows='3']"));
		txtadd.sendKeys("hurur dharmapuri");
		
		WebElement mail = driver.findElement(By.xpath("//input[@type='email']"));
		mail.sendKeys("arnold@gmail.com");
		
		WebElement phno = driver.findElement(By.xpath("//input[@type='tel']"));
		phno.sendKeys("9876543210");
		
		WebElement ckbox= driver.findElement(By.xpath("//input[@type='radio']"));
		ckbox.click();
		
//isEnable--->>> To verify or cheack whether the button or cheackbox is enable or editable
		boolean b = ckbox.isEnabled();
		System.out.println(b);
		
		WebElement ckbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		ckbox1.click();
		
//		WebElement selbox = driver.findElement(By.xpath("(//select[@type='text'])[2]"));
//		selbox.click();
				
		WebElement box = driver.findElement(By.xpath("//div[@id='msdd']"));
		box.click();
		
		WebElement btn = driver.findElement(By.xpath("//a[text()='English']"));
		btn.click();
		
		WebElement skill = driver.findElement(By.id("Skills"));
		
		Select s = new Select(skill);
		
		s.selectByVisibleText("Analytics");
		skill.click();
		
		WebElement btn1 = driver.findElement(By.xpath("(//span[contains(@class,'select2')])[2]"));
		btn1.click();
		
		Robot r = new Robot();
//		
		for(int i=0;i<5;i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
//		WebElement country = driver.findElement(By.id("countries"));
//		
//		Select s1 = new Select(country);
//		
//		s1.selectByIndex(4);
		
		WebElement year = driver.findElement(By.id("yearbox"));
		
		Select s2  = new Select(year);
		
		s2.selectByValue("1970");
		
		WebElement month = driver.findElement(By.xpath("(//select[contains(@class,'form')])[4]"));
		
		Select s3 = new Select(month);
		
		s3.selectByIndex(5);
		
		WebElement day = driver.findElement(By.id("daybox"));
		
		Select s4 = new Select(day);
		
		s4.selectByVisibleText("31");
		
		WebElement fstpass = driver.findElement(By.xpath("//input[@id='firstpassword']"));
		fstpass.sendKeys("9876543");
		
		WebElement scndpass = driver.findElement(By.xpath("//input[@id='secondpassword']"));
		scndpass.sendKeys("123456");
		
		WebElement sbtn = driver.findElement(By.xpath("//button[@name='signup']"));
		sbtn.click();
		
		
		
		
		
		
		
		
	}

}
