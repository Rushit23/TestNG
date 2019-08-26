package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


/*
 * Helper Attributes 
 * 
 * 1. dependsOnMethods
 * 
 * 2. enabled= false
 * 
 * 3. timeOut=4000
 * 
 * 
 * */

public class SixthTest
	{
		
		
		@Test(dependsOnMethods={"Depen1TestCase","Depen2TestCase"})
		public void FacebookTestCase()
		{
			
			System.out.println("  SixthTest class : This is facebook Test Case ");
			
		}
		
		@Test
		public void Depen1TestCase()
		{
			
			System.out.println("  SixthTest class : This is facebook Login Test Case ");
			
		}
		
		@Test
		public void Depen2TestCase()
		{
			
			System.out.println(" SixthTest class : This is Second Test Case ");
			
		}
		
		@Test (enabled= false)
		public void ThirdTestCase()
		{
			
			System.out.println("  SKIP Test Example SixthTest class :");
			
		}
		
		@Test (timeOut=4000)
		public void FourthTestCase()
		{
			
			System.out.println("  TimeOut Test Example SixthTest class :");
			
		}
		
		
		
		@Parameters({"URL","APIKEY"})
		@Test
		public void Parametrization(String url,String Website )
		{
			
			System.out.println(url);
			System.out.println(Website);
			
		}


		@Test(priority=2)
		public void TestCase()
		{
			
			System.out.println("  SixthTest class : This is facebook Login Test Case ");
			
		}
		
		
		@Test(priority=1)
		public void TestCase2()
		{
			
			System.out.println("  SixthTest class : This is facebook Login Test Case ");
			
		}
		
		
		
	}
