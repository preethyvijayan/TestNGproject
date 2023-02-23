package com.obsqura.TestNGproject;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LocatorsbyCssXpath extends Base {
	@Test
	public void cssSelector()
	{
		driver.findElement(By.cssSelector("a#nav-orders"));
		driver.findElement(By.cssSelector("div#a-popover-root"));
		driver.findElement(By.cssSelector("form#nav-search-bar-form"));
		driver.findElement(By.cssSelector("input#nav-search-submit-button"));
		driver.findElement(By.cssSelector("span#nav-search-submit-text"));
		driver.findElement(By.cssSelector("a.a-button-text"));
		driver.findElement(By.cssSelector("div.nav-search-facade"));
		driver.findElement(By.cssSelector("input.a-carousel-firstvisibleitem"));
		driver.findElement(By.cssSelector("span.nav-logo-locale"));
		driver.findElement(By.cssSelector("label.nav-progressive-attribute"));
		driver.findElement(By.cssSelector("i.nav-icon"));
		driver.findElement(By.cssSelector("form[method=GET]"));
		driver.findElement(By.cssSelector("input[name=glow-validation-token]"));
		driver.findElement(By.cssSelector("meta[name=description]"));
		driver.findElement(By.cssSelector("label[for=twotabsearchtextbox]"));
		driver.findElement(By.cssSelector("input[name=ue_back]"));	
		driver.findElement(By.cssSelector("div.nav-progressive-content[id=nav-global-location-toaster-script-container]"));
		driver.findElement(By.cssSelector("div.layoutToolbarPadding[id=nav-tools]"));
		driver.findElement(By.cssSelector("div.layoutToolbarPadding[id=nav-tools]"));
		driver.findElement(By.cssSelector("label.nav-progressive-attribute[id=searchDropdownDescription]"));
		driver.findElement(By.cssSelector("div.nav-title[id=nav-al-title]"));					
	}
	@Test
	public void xpath()
	{
		driver.findElement(By.xpath("//header[@id='navbar-main']"));
		driver.findElement(By.xpath("//div[@id='anonCarousel1']"));
		driver.findElement(By.xpath("//span[@id='logo-ext']"));
		driver.findElement(By.xpath("//input[@id='unifiedLocation1ClickAddress']"));
		driver.findElement(By.xpath("//a[@id='nav-top']"));
		driver.findElement(By.xpath("//form[@id='nav-search-bar-form']"));
		driver.findElement(By.xpath("//input[@id='glowValidationToken']"));
		driver.findElement(By.xpath("//span[@id='nav-global-location-data-modal-action']"));
		driver.findElement(By.xpath("//a[@id='nav-global-location-popover-link']"));
		driver.findElement(By.xpath("//input[@class='a-carousel-firstvisibleitem']"));
		driver.findElement(By.xpath("//ol[@class='a-carousel']"));
		driver.findElement(By.xpath("//input[@name='dropdown-selection-ubb']"));	
	}
	

}
