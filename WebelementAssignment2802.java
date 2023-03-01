package com.obsqura.TestNGproject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertEqualsNoOrder;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;

public class WebelementAssignment2802 extends Base {
	@Test
	public void fontWeightofShowmessagebtn()
	{
		String expectedFontweight="400";
		WebElement showmessageButton=driver.findElement(By.cssSelector("button#button-one"));
		showmessageButton.isDisplayed();
		String actualFontweight=showmessageButton.getCssValue("font-weight");
		assertEquals(actualFontweight, actualFontweight, " Font weight of show message button are not same ");	
	}
	@Test
	public void textofShowmessageButton()
	{
		String expectedText="Show Message";
		WebElement showmessageButton=driver.findElement(By.cssSelector("button#button-one"));
		boolean show=showmessageButton.isDisplayed();
		String actualText=showmessageButton.getText();
		assertEquals(actualText, expectedText, "The text are not same");	
	}
	@Test
	public void allignmentofTextShowmessageButton()
	{
		String expectedTextAllign="center";
		WebElement showmessageButton=driver.findElement(By.cssSelector("button#button-one"));
		boolean show=showmessageButton.isDisplayed();
		String actualTextAllign=showmessageButton.getCssValue("text-align");
		assertEquals(actualTextAllign, expectedTextAllign, "The allignment of text is not same");
	}
	@Test
	public void textcolorofShowmessageButton()
	{
		String color="#fff";
		String expectedTextcolor=Color.fromString(color).asRgba();
		WebElement showmessageButton=driver.findElement(By.cssSelector("button#button-one"));
		boolean show=showmessageButton.isDisplayed();
		String actualTextcolor=showmessageButton.getCssValue("color");
		assertEquals(actualTextcolor, expectedTextcolor, "Text color is not same");
		
	}
	@Test
	public void shapeofShowmessageButton()
	{
		int x=(int) (.25*16);
		String expectedShape=x+"px";
		WebElement showmessageButton=driver.findElement(By.cssSelector("button#button-one"));
		boolean shape=showmessageButton.isDisplayed();
		String actualShape=showmessageButton.getCssValue("border-radius");
		assertEquals(actualShape, expectedShape, "Shape of biutton is not oval");	
	}
	@Test
	public void lineheightofShowmessage()
	{
		int x=(int) (1.5*16);
		String expectedLineheight=x+"px";
		WebElement showmessageButton=driver.findElement(By.cssSelector("button#button-one"));
		boolean lineHeight=showmessageButton.isDisplayed();
		String actualLineheight=showmessageButton.getCssValue("line-height");
		assertEquals(actualLineheight, expectedLineheight, "Line height of show message button is not same");
	}
	@Test
	public void allignementofGettotalbutton()
	{
		//int expectedbuttonallign=677;
		WebElement getTotalbutton=driver.findElement(By.cssSelector("button#button-two"));
		int buttonLocationX=getTotalbutton.getLocation().getX();
		int actualButtonAllignY=getTotalbutton.getLocation().getY();
		WebElement textfielValueB=driver.findElement(By.cssSelector("input#value-b"));
		int textfieldValueBX=textfielValueB.getLocation().getX();
		int textfieldValueBY=textfielValueB.getLocation().getY();
		if(buttonLocationX==textfieldValueBX)
		{
			assertTrue(actualButtonAllignY>textfieldValueBY, "Allignment of button is not below the B value text filed");
			//assertNotEquals(actualButtonAllignY, textfieldValueBY, "Allignment of button is not below the B value text filed");
		}
	}
	@Test
	public void heightweightofGettotalbutton()
	{
		int expectedHeight=38;
		int expectedWidth=93;
		WebElement getTotalbutton=driver.findElement(By.cssSelector("button#button-two"));
		int actualHeight=getTotalbutton.getSize().getHeight();
		assertEquals(actualHeight, expectedHeight, "Height is not same");
		int actualWidth=getTotalbutton.getSize().getWidth();
		assertEquals(actualWidth, expectedWidth, "width is not same");
	}

}
