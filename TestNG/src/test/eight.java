package test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



/*
 * 	TestNG  Listeners Example
 * 
 * 
 * 
 * 
 */






public class eight
	{
		
		
		@Test
		public void FirtTestCase()
		{
			
			Assert.assertTrue(false);
			System.out.println("Eight Class Listners Fail Example");
			
		}
		
		@Test
		public void SecondTestCase()
		{
			
			System.out.println("Eight Class Listners Pass Example");
			
		}

		
		
	}
