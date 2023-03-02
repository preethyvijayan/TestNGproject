package com.obsqura.TestNGproject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RadioButtonsDemo extends Base{
	@Test
	public void radioButtonDemo()
	{
		SelectCategory obj=new SelectCategory(driver);
		obj.selectCategory("Radio Buttons Demo");
		WebElement femaleRadiobutton=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		femaleRadiobutton.click();
	}
	@Test
	public void maleRadioButton()
	{
		SelectCategory obj=new SelectCategory(driver);
		obj.selectCategory("Radio Buttons Demo");
		String expectedOutput="Radio button 'Male' is checked";
		WebElement maleRadiobutton=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		WebElement femaleRadiobutton=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		WebElement displayResult=driver.findElement(By.cssSelector("div#message-one"));
		//maleRadiobutton.click();
		boolean checkMaleradiobutton=maleRadiobutton.isSelected();
		assertFalse(checkMaleradiobutton, "Male radio button is selected");
		//femaleRadiobutton.click();
		boolean checkFemaleradiobutton=femaleRadiobutton.isSelected();
		assertFalse(checkFemaleradiobutton, "Female radio button is selected");
		
		if((checkMaleradiobutton||checkFemaleradiobutton)==false)
		{
			maleRadiobutton.click();
			if(maleRadiobutton.isEnabled())
			{
				WebElement showSelectedValueButton=driver.findElement(By.xpath("//button[@id='button-one']"));
				showSelectedValueButton.click();
			}
			else
			{
				assertFalse(maleRadiobutton.isEnabled()==false, "Male radio button is not enabled and not go to Show Selected value button");
			}
		}
		else if((checkMaleradiobutton||checkFemaleradiobutton)==true)
		{
			assertTrue((checkMaleradiobutton||checkFemaleradiobutton)==true, "Male or female radio button is selected by default so not go to Show Selected value button");
		}	
		displayResult.isDisplayed();
		String actualOutput=displayResult.getText();
		assertEquals(actualOutput, expectedOutput, "Actual output and expected output are not same for display result");
	}
	@Test
	public void femaleRadioButton()
	{
		SelectCategory obj=new SelectCategory(driver);
		obj.selectCategory("Radio Buttons Demo");
		String expectedOutput="Radio button 'Female' is checked";
		WebElement maleRadiobutton=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		WebElement femaleRadiobutton=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		WebElement displayResult=driver.findElement(By.cssSelector("div#message-one"));
		//maleRadiobutton.click();
		boolean checkMaleradiobutton=maleRadiobutton.isSelected();
		assertFalse(checkMaleradiobutton, "Male radio button is selected");
		//femaleRadiobutton.click();
		boolean checkFemaleradiobutton=femaleRadiobutton.isSelected();
		assertFalse(checkFemaleradiobutton, "Female radio button is selected");
		if((checkMaleradiobutton||checkFemaleradiobutton)==false)
		{
			femaleRadiobutton.click();
			if(femaleRadiobutton.isEnabled())
			{
				WebElement showSelectedValueButton=driver.findElement(By.xpath("//button[@id='button-one']"));
				showSelectedValueButton.click();
			}
			else
			{
				assertFalse(femaleRadiobutton.isEnabled()==false, "Female radio button is not enabled and not go to Show Selected value button");
			}
		}
		else if((checkMaleradiobutton||checkFemaleradiobutton)==true)
		{
			assertTrue((checkMaleradiobutton||checkFemaleradiobutton)==true, "Male or Female radio button is selected by default so not go to Show Selected value button");
		}
		displayResult.isDisplayed();
		String actualOutput=displayResult.getText();
		assertEquals(actualOutput, expectedOutput, "Actual output and expected output are not same for display result");	
	}
	@Test
	public void verifyGroupRadiobutton()
	{
		SelectCategory obj=new SelectCategory(driver);
		obj.selectCategory("Radio Buttons Demo");
		String expectedOutput="Gender : Male\n"+"Age group: 45 to 60";
		System.out.println(expectedOutput);		
		WebElement maleRadiobutton=driver.findElement(By.cssSelector("input#inlineRadio11"));
		WebElement ageGroup45to60=driver.findElement(By.cssSelector("input#inlineRadio24"));
		WebElement getResults=driver.findElement(By.cssSelector("button#button-two"));
		WebElement resultMsg=driver.findElement(By.cssSelector("div#message-two"));
		maleRadiobutton.click();
		ageGroup45to60.click();
		if(maleRadiobutton.isEnabled()&&ageGroup45to60.isEnabled())
		{
			getResults.click();
			String actualOutput=resultMsg.getText();
			assertEquals(actualOutput, expectedOutput, "Expected result and actual result are not same");
			 
		}
	}
	

}
