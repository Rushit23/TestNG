package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SecondTest
	{
		
		
		
		@Test
		public void FirtTestCase()
		{
			
			System.out.println("   SecondTest class : This is first Test Case ");
			
		}
		
		
		@AfterTest
		@Test
		public void SecondTestCase()
		{
			
			System.out.println("   After Test Example SecondTest class ");
			
		}
		
		
		
		@BeforeSuite
		public void ThirdTestCase()
		{
			
			System.out.println(" Before Suite Example  SecondTest class : ");
			
		}
		
		
		@AfterSuite
		public void FourthTestCase()
		{
			
			System.out.println(" After Suite Example  SecondTest class : ");
			
		}
		
		
		@BeforeMethod
		public void FifthTestCase()
		{
			
			System.out.println(" Before Method Example  SecondTest class : ");
			
		}

		@AfterMethod
		public void SixthTestCase()
		{
			
			System.out.println(" After Method Example  SecondTest class : ");
			
		}
		
		@Test (groups= {"smoke"})
		public void SevenTestCase()
		{
			
			System.out.println("  Smoke Test Example SecondTest class :");
			
		}
		
		

	}
