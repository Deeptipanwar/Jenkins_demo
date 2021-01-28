package com.testng.utility;




import java.util.NoSuchElementException;


import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;


import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeSuite;

public class Set_utility {
	

	public static WebDriver driver;
	
	@BeforeSuite
	public static void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver","/Users/deeptipanwar/eclipse-workspace/demo_maven/chromedriver");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void goToUrl() {
		driver.get("https://login.salesforce.com/");
		//driver.get("https://qa-tekarch.firebaseapp.com");
	}
	
	public static void loginToSalesForce()throws Exception  {
		WebElement ele= driver.findElement(By.xpath("//input[@id='username']"));
		waitExplicitly(5, ele);
		ele.clear();
		ele.sendKeys("qadeep1234@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).click();
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Deep@2202");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		Thread.sleep(3000);
		waitExplicitly(5, driver.findElement(By.xpath("//span[@id='userNavLabel']")));
	}
	
	@AfterSuite
	public static void quitBrowser() {
		driver.quit();
	}
	
	
	
	public static void waitExplicitly(int sec, WebElement el) {
		WebDriverWait wait=new WebDriverWait(driver, sec);
		wait.ignoring(NoSuchElementException.class, ElementNotVisibleException.class);
		wait.until(ExpectedConditions.visibilityOf(el));
		
	}
	
}
