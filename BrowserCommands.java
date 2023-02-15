package com.obsqura.TestNGproject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class BrowserCommands extends Base{
	@Test
	public void verifyTitle()
	{
		String expectedtitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualtitle=driver.getTitle();
		assertEquals(expectedtitle,actualtitle,"Titles are not same");
	}
	@Test
	public void verifyUrl()
	{
		String expectedurl="https://www.amazon.in/";
		String actualurl=driver.getCurrentUrl();
		assertEquals(expectedurl,actualurl,"URLs are not same");
	}
}
