package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;



/*
 * 
 * 
 * 1. Parallel Test Execution   with (Seven And Nine Class)  at Class Level
 *
 * 
 * */

public class Nine
	{
		
		@Test
		public void MyPortfolioVerifyTitle() throws InterruptedException
		{
			
			// Must Download The Stable CHROME DRIVER .exe Compatible WIth Browser	
			 System.setProperty("webdriver.chrome.driver","D:/Selenium-Drivers/chro/chromedriver.exe"); 
			 
			 
			 WebDriver driver = new ChromeDriver ();
			 driver.manage().window().maximize();
			 
			 
			 
			 	driver.get("https://www.rushitpatel.com/");
			 	String title=driver.getTitle();
			 	System.out.println(title);
			 
				assertEquals(title,"Rushit Patel- QA Tester");
			 
				Thread.sleep(2000);
				driver.quit();
			
			
		}
		
		
		
		
		
		@Test
		public void FacebookVerifyTitle() throws InterruptedException
		{
			
			// Must Download The Stable CHROME DRIVER .exe Compatible WIth Browser	
			 System.setProperty("webdriver.chrome.driver","D:/Selenium-Drivers/chro/chromedriver.exe"); 
			 
			 
			 WebDriver driver = new ChromeDriver ();
			 driver.manage().window().maximize();
			 
			 driver.get("https://www.facebook.com/");
			 String title=driver.getTitle();
			 System.out.println(title);
			 
			assertEquals(title,"Log into Facebook | Facebook");
			Thread.sleep(2000);
			driver.quit();
			
			
		}
		
		
		
		
		
		
	}
