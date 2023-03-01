package com.obsqura.TestNGproject;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertCommand extends Base{
	@Test
	public void hardAssert()
	{
		String expectedurl="https://www.amazon.in/";
		String expectedurl1="https://www.flipkart.com.com/";
		driver.navigate().to("https://www.flipkart.com/");
		String actualurl1=driver.getCurrentUrl();
		assertEquals(expectedurl1,actualurl1,"Not navigated to flipkart");
		driver.navigate().back();
		String actaulurl=driver.getCurrentUrl();
		assertEquals(expectedurl,actaulurl,"Not navigated back to Amazon");
	}
	@Test
	public void softAssertTestcase()
	{
		String expectedurl="https://www.amazon.in/";
		String expectedurl1="https://www.flipkart.com.com/";
		SoftAssert softassert=new SoftAssert();//create an object of class SoftAseert
		driver.navigate().to("https://www.flipkart.com/");
		String actualurl1=driver.getCurrentUrl();
		softassert.assertEquals(expectedurl1,actualurl1,"Not navigated to flipkart");
		driver.navigate().back();
		String actaulurl=driver.getCurrentUrl();
		softassert.assertEquals(expectedurl,actaulurl,"Not navigated back to Amazon");
		softassert.assertAll();//for result in soft assert
	}
}
