package com.automation.practice.selenium;

import java.io.File;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.sun.jna.platform.FileUtils;

public class ElementLocators {

	public static WebDriver driver;
	public static JavascriptExecutor jse;
	
	
	public static void main(String...string) throws Exception
	{
		search();
	}

	
	public static By openNewTab = By.id("Open New Tab");
	public static By openWindow= By.id("Open New Window");
	public static By iframe = By.id("iFrame");
	
   public static void search() throws Exception
   {
		
	   try{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		jse = (JavascriptExecutor) driver;
		driver = new ChromeDriver();
		driver.get("http://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		driver.manage().window().maximize();
		
		jse.executeScript("build.scroll",250);
	   
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		Dimension d = new Dimension(1024,760);
		driver.manage().window().setSize(d);
		WebElement wb = driver.findElement(By.xpath(""));
	
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("id"), "text"));
		
		Thread.sleep(1000);

		driver.switchTo().window("text");
		driver.findElement(By.id("x")).click();
		driver.close();
		driver.quit();
		driver.switchTo().defaultContent();
		Set<String> abc = driver.getWindowHandles();
		for(String window:abc) {
			if(window.equalsIgnoreCase("mywindow"))
				driver.switchTo().window(window);
						
		}
		
	File f  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
		//frame
		driver.switchTo().parentFrame();
		WebElement x = null;
		jse.executeScript("return document.getElementByid('test');",x);
		
		
		Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
				.withTimeout(10, TimeUnit.SECONDS)
				.pollingEvery(1, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
				;
		Actions act = new Actions(driver);
		act.contextClick();
		Alert alt = driver.switchTo().alert();
		alt.accept();
		alt.dismiss();
		
		act.clickAndHold().release();
	
		
		
		Select s = new Select(driver.findElement(By.id("x")));
		s.selectByIndex(0);
		
		
		driver.switchTo().window("abc");
		
		Wait w = new FluentWait(driver)
				.withTimeout(10, TimeUnit.SECONDS)
				.pollingEvery(1, TimeUnit.SECONDS)
				.ignoring(StaleElementReferenceException.class);
				
		
		String w1 = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for(String h:handles)
			System.out.println(h);
		
	
	
	
	//driver.findElement(By.linkText("Learning Numbers | Counting 123 | 1 to 10 | Fun and Creative ...")).click();
	   }catch(Exception e) {
		   System.out.println("Inside Catch");
		   throw e;
	   }
	   finally {
		   //driver.close();
	   }
	   
	   
	   
	   
   }
   

   public void setSystemProperty() {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	   
   }
   
   public void initialiseChrome() {
	   String downloadFilepath = "C:\\Users\\IBM_ADMIN\\Practice\\automationpractice\\ChromeDownload";
	   HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
	   chromePrefs.put("profile.default_content_settings.popups", 0);
	   chromePrefs.put("download.default_directory", downloadFilepath);
	   ChromeOptions options = new ChromeOptions();
	   options.setExperimentalOption("prefs", chromePrefs);
	   DesiredCapabilities cap = DesiredCapabilities.chrome();
	   cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	   cap.setCapability(ChromeOptions.CAPABILITY, options);
	    driver = new ChromeDriver(cap);
	      	   
   }
   
   public void getUrl(String url) {
	   driver.get(url);
   }
   
   @Test(priority=1)
   public void downloadFileTest() {
	   setSystemProperty();
	   initialiseChrome();
	   getUrl("https://cerc.blackboard.com/Page/1189");
	   driver.findElement(By.xpath("//a[contains(text(),'Cal')]")).click();
	   	   
   }
   
   public void testme() {
	    final int a = 7;
   }
		
	}
