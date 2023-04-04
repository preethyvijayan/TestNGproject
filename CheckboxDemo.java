package com.obsqura.TestNGproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CheckboxDemo extends Base {
	@Test
	public void checkBoxdemo()
	{
		SelectCategory obj=new SelectCategory(driver);
		obj.selectCategory("Checkbox Demo");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='form-check-input']")));
		WebElement clickCheckbox=driver.findElement(By.xpath("//input[@class='form-check-input']"));
		clickCheckbox.click();
	}

}
