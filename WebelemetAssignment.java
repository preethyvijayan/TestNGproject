package com.obsqura.TestNGproject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebelemetAssignment extends Base {
	@Test
	public void webelement()
	{
		driver.navigate().to("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		WebElement firstname=driver.findElement(By.name("firstname"));
		WebElement lastname=driver.findElement(By.name("lastname"));
		firstname.sendKeys("Preethy");
		lastname.sendKeys("Vijayan");
		//WebElement button=driver.findElement(By.cssSelector("button[name=submit]"));
		//button.click();//produce a pop up window
	}
	@Test
	public void Verifyconcat()
	{
		String message="Hello";
		String expectedMessage="Your Message : ".concat(message);
		WebElement enterMessage=driver.findElement(By.cssSelector("input#single-input-field")); 
		boolean isTextboxDisplayed=enterMessage.isDisplayed();
		assertTrue(isTextboxDisplayed, "No Displayed");
		enterMessage.sendKeys(message);
		WebElement showmessagebutton=driver.findElement(By.cssSelector("button#button-one"));
		showmessagebutton.click();
		boolean isShowMessageButton=showmessagebutton.isEnabled();
		assertTrue(isShowMessageButton,"Show message button is not enable");
		WebElement yourMessage=driver.findElement(By.xpath("//div[@id='message-one']"));
		String actualMessage=yourMessage.getText();
		assertEquals(actualMessage, expectedMessage,"Messages are not same");
	}
	@Test
	public void verifyTwoInputfield1()
	{
		int a=6,b=4;
		String expectResult="Total A + B : "+(a+b);
		WebElement firstValue=driver.findElement(By.cssSelector("input#value-a"));
		boolean valueA=firstValue.isDisplayed();
		firstValue.sendKeys(Integer.toString(a));
		WebElement secondValue=driver.findElement(By.cssSelector("input#value-b"));
		boolean valueB=secondValue.isDisplayed();
		secondValue.sendKeys(Integer.toString(b));
		secondValue.isDisplayed();
		WebElement getTotalbtn=driver.findElement(By.cssSelector("button#button-two"));
		boolean btn=getTotalbtn.isEnabled();
		getTotalbtn.click();
		assertTrue(btn, "Get total button is not enabled");
		WebElement display=driver.findElement(By.cssSelector("div#message-two"));
		boolean dispayValue=display.isDisplayed();
		String actualResult=display.getText();
		assertEquals(actualResult, expectResult, "Expected result and acutal result are not same");
	}

}
