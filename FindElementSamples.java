package com.obsqura.TestNGproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FindElementSamples extends Base {
	@Test
	public void selectCategory(String input)
	{
		List<WebElement> categories=driver.findElements(By.xpath("//li[@class='list-group-item']//a"));
		for(WebElement category:categories)//Type: from  categories
		{
			String categoryName=category.getText();
			if(categoryName.equals(input))
			{
				category.click();
				break;
			}
		}
	}
	@Test
	public void selectCategory1()
	{
		String input="Checkbox Demo";
		List<WebElement> categories=driver.findElements(By.xpath("//li[@class='list-group-item']//a"));
		for(WebElement category:categories)//Type: from  categories
		{
			String categoryName=category.getText();
			if(categoryName.equals(input))
			{
				category.click();
				break;
			}
		}
	}
	@Test
	public void navigateToMainMenu()
	{
		String input="HOME";
		List<WebElement> categories=driver.findElements(By.xpath("//a[@class='nav-link']"));
		for(WebElement category:categories)
		{
			String categoryName=category.getText();
			if(categoryName.equals(input))
			{
				category.click();
				break;
			}
		}
	}

}
