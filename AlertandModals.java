package com.obsqura.TestNGproject;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AlertandModals extends Base {
	@Test
	public void alertAccept()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/javascript-alert.php");
		WebElement clickme=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		clickme.click();
		driver.switchTo().alert().accept();
	}
	@Test
	public void alertDismiss()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/javascript-alert.php");
		WebElement clickmeforDismiss=driver.findElement(By.cssSelector("button[onclick='jsConfirm()']"));
		clickmeforDismiss.click();
		driver.switchTo().alert().dismiss();
	}
	@Test
	public void alertGettextinClickme()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/javascript-alert.php");
		WebElement clickmeforGettext=driver.findElement(By.cssSelector("button[onclick='jsAlert()']"));
		clickmeforGettext.click();
		driver.switchTo().alert().getText();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
	}
	@Test
	public void alertSendKeys() throws InterruptedException
	{
		String input="preethy";
		String expected="You have entered '"+input+"' !";
		driver.navigate().to("https://selenium.obsqurazone.com/javascript-alert.php");
		WebElement clickforPrombtboxButton=driver.findElement(By.cssSelector("button[onclick='jsPrompt()']"));
		clickforPrombtboxButton.click();
		driver.switchTo().alert().sendKeys(input);
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		WebElement displayText=driver.findElement(By.xpath("//p[@id='prompt-demo']"));
		System.out.println(displayText.getText());
		String actual=displayText.getText();
		assertEquals(actual, expected, "Actual and expecetd are not same");
		
	}
	

	
	

}
