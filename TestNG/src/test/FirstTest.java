package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest
	{
		
		
		@Test
		public void FirtTestCase()
		{
			
			System.out.println("  FirstTest class : This is first Test Case ");
			
		}
		
		
		@Test
		public void SecondTestCase()
		{
			
			System.out.println(" FirstTest class : This is Second Test Case ");
			
		}
		
		
		@Test (groups= {"smoke"})
		public void FourthTestCase()
		{
			
			System.out.println("  Smoke Test Example FirstTest class :");
			
		}
		
		
		
		@BeforeTest
		@Test
		public void ThirdTestCase()
		{
			
			System.out.println("  Before Test Example FirstTest class : ");
			
		}
		
		
	}
