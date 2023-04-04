package com.obsqura.TestNGproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClassSample extends Base{
	@Test
	public void actionClick()
	{
		WebElement singleInputfield=driver.findElement(By.xpath("//input[@id='single-input-field']"));//to locate the element
		WebElement showMessagebutton=driver.findElement(By.xpath("//button[@id='button-one']"));
		singleInputfield.sendKeys("ABC");
		Actions action = new Actions(driver);
		action.moveToElement(showMessagebutton).click().perform();
	}
	@Test
	public void mouseHover()
	{
		WebElement simplformDemo=driver.findElement(By.xpath("//a[text()='Simple Form Demo']"));
		Actions action=new Actions(driver);
		action.moveToElement(simplformDemo).build().perform();
	}
	@Test
	public void doubleClick()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement selectAllButon=driver.findElement(By.xpath("//input[@id='button-two']"));
		Actions action=new Actions(driver);
		action.doubleClick(selectAllButon).perform();
	}
	@Test
	public void clickAndHold()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement selectAllButon=driver.findElement(By.xpath("//input[@id='button-two']"));
		Actions action=new Actions(driver);
		action.clickAndHold(selectAllButon).perform();
	}
	@Test
	public void rightClick()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement selectAllButon=driver.findElement(By.xpath("//input[@id='button-two']"));
		Actions action=new Actions(driver);
		action.contextClick(selectAllButon).perform();
	}
	@Test
	public void dragAnddrop()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");
		WebElement dragableItem=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement dropItem=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions action=new Actions(driver);
		//action.dragAndDrop(dragableItem, dropItem).build().perform();
		action.clickAndHold(dragableItem).moveToElement(dropItem).release(dropItem).build().perform();//we can use this syntax aswell
	}
	}
