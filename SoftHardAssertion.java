package com.obsqura.TestNGproject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftHardAssertion extends Base {
	@Test
	public void assertEqualsmethod()
	{
		String expectedurl="https://www.flipkat.com/";
		driver.navigate().to("https://www.flipkart.com/");
		String actualurl=driver.getCurrentUrl();
		assertEquals(expectedurl, actualurl, "Urls are not same");
	}
	@Test
	public void assertNotequals()
	{
		String expectedurl=driver.getCurrentUrl();
		String actualurl="https://www.flipkat.com/";
		assertNotEquals(expectedurl, actualurl,"Urls are same");
	}
	
	@Test
	public void assertFalse()
	{
		String expectedpagetitle="MakeMyTrip - #1 Website 50% OFF on Hotels, Flights & Holiday";
		driver.navigate().to("https://www.makemytrip.com/");
		String actualpagetitle=driver.getTitle();
	}

}
