package com.selenium.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "D:\\Selenium-Appium\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.seleniumhq.org");
		System.out.println("The URL is launched successfully");

		String title = driver.getTitle();
		System.out.println("The Window tilte is: " + title);
	}

}
