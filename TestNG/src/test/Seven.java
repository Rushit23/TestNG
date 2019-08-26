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
 * 1. Parallel Test Execution
 * 
 * 2. Using DataProvider Annotation Running The Test Multiple times
 * 
 * 3.
 * 
 * 
 * */

public class Seven
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
			 
			assertEquals(title,"Facebook - Log In or Sign Up");
			Thread.sleep(2000);
			driver.quit();
			
			
		}
		
		
		
		
		
		
		
		
		
		@Test(dataProvider="getData")
		public void FacebookLogIN(String Username,String Password) throws InterruptedException
		{
			
			boolean result = false;
			
			// Must Download The Stable CHROME DRIVER .exe Compatible WIth Browser	
			 System.setProperty("webdriver.chrome.driver","D:/Selenium-Drivers/chro/chromedriver.exe"); 
			 
			 
			 WebDriver driver = new ChromeDriver ();
			 driver.manage().window().maximize();
			 
			 
			 
			 driver.get("https://www.facebook.com/");
			 String title=driver.getTitle();
			 
			 WebElement UName = driver.findElement(By.id("email")); 
			 WebElement Pass = driver.findElement(By.id("pass")); 
			 WebElement LIN = driver.findElement(By.id("loginbutton")); 
			 Thread.sleep(5000);
			 
			 
			 UName.sendKeys(Username);
			 Pass.sendKeys(Password);
			 LIN.click();
			 Thread.sleep(3000);
			 
		
			 if(title.equals("Facebook - Log In or Sign Up"))
				 {
					 result=true;
				 }
			 
			 assertTrue(result);
			 
			Thread.sleep(2000);
			driver.quit();
			
			
		}
		
	
		
		@DataProvider
		public Object[][] getData()
		{
			Object [] [] data = new Object [3][2];

			// 1st Set

			data [0][0]="FirstUsername ";
			data [0][1]="FirstPassword ";

			// 2nd Set 

			data [1][0]="Second Username ";
			data [1][1]="Second Password ";


			// 3rd Set 
			
			data [2][0]="Third Username";
			data [2][1]=" Third Password";
			
			return data;

		}
		
		
		
		
	}
