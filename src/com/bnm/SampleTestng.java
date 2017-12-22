package com.bnm;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTestng {
	int x;
	int y;
	
	
	@BeforeTest
	public void setup()
	{
		int x;
		int y;
		}
	
	@Test(priority=1)
	public void testing() {
			x=12;
			y=12;
			Assert.assertEquals(x,y);
		}
	
	@Test(priority=2)
	public void endtest() {
			
			x=0;
			y=0;
			Assert.assertEquals("welcome world","welcome world");
				}
	
	@Test(priority=3)
	public void Sum() {
		int sum=0;
		for(int i=1;i<=10;i++)
		{sum=sum+i;}
	
			}
	
	@Test(dependsOnMethods= {"Sum"})
	public void AddSum(){
		
		int expected= 55;
		int actual= 55;
		Assert.assertEquals(expected, actual);
		}
	
	
	}
	
	
	
	
	


