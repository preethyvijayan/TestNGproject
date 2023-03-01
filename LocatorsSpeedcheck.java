package com.obsqura.TestNGproject;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LocatorsSpeedcheck extends Base{
	@Test
	public void locatingId()
	{
		driver.findElement(By.id("skiplink"));
	}
	@Test
	public void locatingName()
	{
		driver.findElement(By.name("field-keywords"));
	}
	//@Test
	public void locatingClassname()
	{
		driver.findElement(By.className("nav-input nav-progressive-attribute"));
	}
	@Test
	public void locatingCssTagId()
	{
		driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
	}	
	//@Test
	public void locatingCssTagClassname()
	{
		driver.findElement(By.cssSelector("input.nav-input nav-progressive-attribute"));
	}
	//@Test
	public void locatingCssTagClassnameAttribute()
	{
		driver.findElement(By.cssSelector("input.nav-input nav-progressive-attribute[id=twotabsearchtextbox]"));
	}
	@Test
	public void locatingXpath()
	{
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	}
	
}
