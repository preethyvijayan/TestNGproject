package com.obsqura.TestNGproject;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Locators extends Base {
	@Test
	public void locatingById()
	{
		driver.findElement(By.id("twotabsearchtextbox"));
		driver.findElement(By.id("nav-global-location-popover-link"));
	}
	@Test
	public void locatingByClassname()
	{
		driver.findElement(By.className("hm-icon-label"));
		driver.findElement(By.name("dropdown-selection-ubb"));
		driver.findElement(By.linkText("Careers"));
		driver.findElement(By.partialLinkText("Gift"));
		driver.findElement(By.tagName("img"));//locators by tagname
		driver.findElement(By.cssSelector("span#glow-ingress-line1"));//combination of tag and id by css selector
		driver.findElement(By.cssSelector("a.skip-link"));//combination of tag and class by css selector
		driver.findElement(By.cssSelector("input[type=submit]"));//combination of tag and attribute
		driver.findElement(By.cssSelector("a.skip-link[id=skiplink]"));//combination of tag,class and attribute
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));//locating by Xpath
	}

}
