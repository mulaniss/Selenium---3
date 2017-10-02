package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.gecko.driver", "D:\\Selenium-Appium\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://example.com/doc.html");
		String winHandlebefore=driver.getWindowHandle();
		driver.findElement(By.id("toc-link")).click();
		Thread.sleep(2000);
		for (String winHandle : driver.getWindowHandles()){
			driver.switchTo().window(winHandle);
		}
		driver.findElement(By.id("accept")).click();
		driver.switchTo().window(winHandlebefore);
		driver.findElement(By.id("mydocpdf")).click();
	}
}
