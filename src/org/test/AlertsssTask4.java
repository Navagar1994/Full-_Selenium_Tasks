package org.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsssTask4 {

	public static void main(String[] args) {

//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\Administrator\\eclipse-workspace\\SeleniumDay1\\Driver\\chromedriver.exe");

       WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");

		// To find frame count

		List<WebElement> a = driver.findElements(By.tagName("frameset"));
		int b = a.size();
		System.out.println(b);

		driver.switchTo().frame("login_page");

		WebElement c = driver.findElement(By.xpath("//a[contains(@class,'btn')]"));
		c.click();

		Alert d = driver.switchTo().alert();

		d.accept();
		

	}

}
