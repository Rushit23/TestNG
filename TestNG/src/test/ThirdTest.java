package test;

import org.testng.annotations.Test;

public class ThirdTest
	{
		
		
		
		@Test
		public void FirtTestCase()
		{
			
			System.out.println("   ThirdTest class : This test has been included ");
			
		}

		
		
		
		@Test
		public void SecondTestCase()
		{
			
			System.out.println("   ThirdTest class : This is Second test case ");
			
		}

		
		@Test
		public void ThirdTestCase()
		{
			
			System.out.println("   ThirdTest class : This is third test case ");
			
		}

		
		
		@Test (groups= {"smoke"})
		public void SixthTestCase()
		{
			
			System.out.println("  Smoke Test Example ThirdTest class :");
			
		}
		
		
		
		
		
		
		
	}
