package test;

import org.testng.annotations.Test;

public class FifthTest
	{
		
		
		@Test
		public void FacebookTestCase()
		{
			
			System.out.println("  FifthTest class : This is facebook Test Case ");
			
		}
		
		@Test
		public void FacebookLoginTestCase()
		{
			
			System.out.println("  FifthTest class : This is facebook Login Test Case ");
			
		}
		
		@Test
		public void SecondTestCase()
		{
			
			System.out.println(" FifthTest class : This is Second Test Case ");
			
		}
		
		@Test (groups= {"smoke"})
		public void ThirdTestCase()
		{
			
			System.out.println("  Smoke Test Example FifthTest class :");
			
		}
		
		
		
		
	}
