package com.obsqura.TestNGproject;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class NavigationCommands extends Base {
	@Test
	public void verifyTourl()
	{
		String expectedurl="https://www.flipkart.com/";
		driver.navigate().to("https://www.flipkart.com/");
		String actualurl=driver.getCurrentUrl();
		assertEquals(expectedurl,actualurl,"URLs are not same");
	}
	@Test
	public void verifyBack()
	{
		String expectedurl="https://www.amazon.in/";
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().back();
		String actaulurl=driver.getCurrentUrl();
		assertEquals(expectedurl,actaulurl,"Backward URLs are not same");
	}
	@Test
	public void verifyForward()
	{
		String expectedurl="https://www.flipkart.com/";
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().back();
		driver.navigate().forward();
		String actualurl=driver.getCurrentUrl();
		assertEquals(expectedurl,actualurl,"Forward URLs are not same");
	}
	@Test
	public void verifyRefresh()
	{
		String expectedurl="https://www.flipkart.com/";
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().refresh();
		String actualurl=driver.getCurrentUrl();
		assertEquals(expectedurl,actualurl,"Refresh URLs are not same");
	}

}
