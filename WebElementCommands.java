package com.obsqura.TestNGproject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebElementCommands extends Base{
	@Test
	public void sendKeysmethod()
	{
		
		  //driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
			
	    WebElement searchBar=driver.findElement(By.id("twotabsearchtextbox"));
	    searchBar.sendKeys("iphone"); 
	    searchBar.clear();
	    searchBar.sendKeys("iphone");
	     WebElement searchButton=driver.findElement(By.id("nav-search-submit-button"));
		searchButton.click();
	    WebElement entermessage=driver.findElement(By.xpath("//input[@id='single-input-field']"));
	    String tagname=entermessage.getTagName();//using geTagname command
	    String type= entermessage.getAttribute("type");//using getAttribute command
	    String placeHolder= entermessage.getAttribute("placeholder");
	    
	}
	@Test
	public void verifySingleInputField()
	{
		WebElement entermessage=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		entermessage.sendKeys("Haii");
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		showMessageButton.click();
		boolean isShowMessageButton=showMessageButton.isEnabled();
		assertTrue(isShowMessageButton,"Show message button is not enable");
		boolean isTextboxDisplayed=entermessage.isDisplayed();
		String buttonName=showMessageButton.getText();
		WebElement yourMessage=driver.findElement(By.xpath("//div[@id='message-one']"));
		String actualMessageshow=yourMessage.getText();
		String showmessageButtonBackgndcolor=showMessageButton.getCssValue("background-color");
		Point location=showMessageButton.getLocation();
		int showMessageButtonX=location.getX();
		int showMessageButtonY=location.getY();
		int entermessageX=entermessage.getLocation().getX();
		int entermessageY=entermessage.getLocation().getY();
		int height=showMessageButton.getSize().getHeight();	//getSize command
		Dimension width=showMessageButton.getSize();
		int showmessageWidth=width.getWidth();
	}
	


}
