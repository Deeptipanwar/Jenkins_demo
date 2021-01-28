package com.testngproject.Demo_testing;

import com.testng.utility.Set_utility;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Day2_Scenarios extends Set_utility {

	@BeforeTest
	public void settingdependency() throws Exception {
		goToUrl();
		loginToSalesForce();
	}
	
	@Test(priority=1)
	public void TC_01() throws Exception{
		waitExplicitly(20,driver.findElement(By.id("tabBar")));
		WebElement em= driver.findElement(By.id("tabBar"));
		Assert.assertEquals(driver.findElement(By.xpath("//ul[@id='tabBar']/li[@id='Account_Tab']")).isSelected(), false);
		
	}
	
	@Test(priority=2)
	public void TC_02() throws Exception{
		waitExplicitly(20,driver.findElement(By.id("tabBar")));
		WebElement em= driver.findElement(By.id("tabBar"));
		driver.findElement(By.xpath("//ul[@id='tabBar']/li[@id='Account_Tab']")).click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.findElement(By.xpath("//ul[@id='tabBar']/li[@id='Account_Tab']")).isEnabled(), true);
		
	}
	
	
	
	
}
