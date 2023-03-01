package com.obsqura.TestNGproject;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LocatorsSample extends Base {
	@Test
	public void locationId1()
	{
		driver.findElement(By.id("nav-hamburger-menu"));
		driver.findElement(By.id("nav-swmslot"));
		driver.findElement(By.id("desktop-banner-stripe"));
		driver.findElement(By.id("desktop-grid-2"));
		driver.findElement(By.id("nav-flyout-anchor"));		
	}
	@Test
	public void locationClassname()
	{
		driver.findElement(By.className("skip-link"));
		driver.findElement(By.className("two-pane-results-container"));
		driver.findElement(By.className("left-pane-results-container"));
		driver.findElement(By.className("nav-logo-link nav-progressive-attribute"));
		driver.findElement(By.className("autocomplete-results-container"));	
	}
	@Test
	public void navigationPageId()
	{
		driver.navigate().to("https://www.amazon.com/gp/goldbox?ref_=nav_cs_gb");
		driver.findElement(By.id("nav-belt"));
		driver.findElement(By.id("nav-flyout-iss-anchor"));
		driver.findElement(By.id("nav-flyout-anchor"));
		driver.findElement(By.id("nav-flyout-prime"));
		driver.findElement(By.id("nav-flyout-searchAjax"));
	}
	@Test
	public void navigationClassName()
	{
		driver.navigate().to("https://www.amazon.com/gp/goldbox?ref_=nav_cs_gb");
		driver.findElement(By.className("autocomplete-results-container"));
		driver.findElement(By.className("two-pane-results-container"));
		driver.findElement(By.className("autocomplete-results-container"));
		driver.findElement(By.className("two-pane-results-container"));
		driver.findElement(By.className("left-pane-results-container"));
	}
	@Test
	public void navigationName()
	{
		driver.navigate().to("https://www.firstcry.com/");
		driver.findElement(By.name("svscheme"));
		driver.findElement(By.name("googlefcPresent"));
		driver.findElement(By.name("googlefcInactive"));
		driver.findElement(By.name("googlefcLoaded"));
		driver.findElement(By.name("imgb_4"));	
	}
	@Test
	public void navigationLinktest()
	{
		driver.navigate().to("https://www.firstcry.com/");
		driver.findElement(By.linkText("Moms & Maternity"));
		driver.findElement(By.linkText("Baby Diapering"));
		driver.findElement(By.linkText("Birthday Party Supplies"));
		driver.findElement(By.linkText("Bath & Skin Care"));
		driver.findElement(By.linkText("Books & CDs"));
	}
	@Test
	public void navigationPartialLinkText()
	{
		driver.navigate().to("https://www.firstcry.com/");
		driver.findElement(By.partialLinkText("Moms"));
		driver.findElement(By.partialLinkText("GlobalBees"));
		driver.findElement(By.partialLinkText("Responsible"));
		driver.findElement(By.partialLinkText("Birthday Party"));
		driver.findElement(By.partialLinkText("Bath & Skin"));
		
		
	}
	

	
}
