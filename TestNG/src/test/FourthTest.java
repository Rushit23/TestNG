package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FourthTest
	{
		
		
		
		@Test
		public void FirtTestCase()
		{
			
			System.out.println("   FourthTest class : This Test Has Been Excluded ");
			
		}
		
		
		@BeforeClass
		public void ThirdTestCase()
		{
			
			System.out.println("  Before Class Example FourthTest class :  ");
			
		}
		
		
		
		@AfterClass
		public void FourthTestCase()
		{
			
			System.out.println("  After Class Example FourthTest class : ");
			
		}
		
		
		@Test
		public void SecondTestCase()
		{
			
			System.out.println("   FourthTest class : This Test Has Been Included ");
			
		}
		
		
		@Test (groups= {"smoke"})
		public void SixthTestCase()
		{
			
			System.out.println("  Smoke Test Example FourthTest class :");
			
		}
		
		
		
		
		

	}
