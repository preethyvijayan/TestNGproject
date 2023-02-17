package com.obsqura.TestNGproject;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNull;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class HardAssertSample extends Base
{
	@Test
	public void verfiyUrl()
	{
		String expectedurl=driver.getCurrentUrl();
		driver.navigate().to("https://www.flipkart.com");
		String actualurl=driver.getCurrentUrl();
		assertNotEquals(expectedurl, actualurl, "Not showing the URL of Amazon");
	}
	@Test
	public void verfiyPagesource()
	{
		String expectedpagesource="amazon";
		driver.navigate().to("https://www.flipkart.com");
		String actualpagesource=driver.getPageSource();
		assertFalse(actualpagesource.contains(expectedpagesource), "Not finding the word amazon in flipkart url");
	}
	@Test
	public void verfiyCount()
	{
		String count=null;
		String amazon="amazon";
		driver.navigate().to("https://www.flipkart.com");
		driver.getPageSource().contains(amazon);
		assertFalse(amazon.equals(count), "Word amazon is not found in current url");
		assertNull(count, "Count is null");	
	}
	@Test
	public void softAssertTest()
	{
		String expectedpagesource="amazon";
		String count=null;
		String amazon="amazon";
		SoftAssert softassert=new SoftAssert();
		String expectedurl=driver.getCurrentUrl();
		driver.navigate().to("https://www.flipkart.com");
		String actualurl=driver.getCurrentUrl();
		softassert.assertNotEquals(expectedurl, actualurl, "Not showing the URL of Amazon");
		String actualpagesource=driver.getPageSource();
		softassert.assertFalse(actualpagesource.contains(expectedpagesource), "Not finding the word amazon in flipkart url");
		driver.getPageSource().contains(amazon);
		softassert.assertFalse(amazon.equals(count), "Word amazon is not found in current url");
		softassert.assertNull(count, "Count is null");
		softassert.assertAll();
	}
	
}
