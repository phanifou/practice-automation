package com.automation.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ElementLocators {

	public static WebDriver driver;
	public static JavascriptExecutor jse;
	
	
	public static void main(String...string) throws Exception
	{
		search();
	}

	
	
   public static void search() throws Exception
   {
		
	   try{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		jse = (JavascriptExecutor) driver;
		driver = new ChromeDriver();
		driver.get("https:///");
		driver.manage().window().maximize();
	   
	driver.findElement(By.id("lst-ib")).sendKeys("123");
	Thread.sleep(3000);
	
	WebElement wb = driver.findElement(By.name("btnK"));
	jse.executeScript("arguments[0].click();", wb);
	
	//driver.findElement(By.linkText("Learning Numbers | Counting 123 | 1 to 10 | Fun and Creative ...")).click();
	   }catch(Exception e) {
		   System.out.println("Inside Catch");
		   throw e;
	   }
	   finally {
		   driver.close();
	   }
	   
   }
		
	}
