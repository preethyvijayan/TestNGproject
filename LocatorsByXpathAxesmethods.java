package com.obsqura.TestNGproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorsByXpathAxesmethods extends Base {
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
	@Test
	public void dynamicLocators()
	{
			driver.findElement(By.xpath("//a[contains(@href,'bootstrap-alert')]"));//xpath contains method
			driver.findElement(By.xpath("//button[@id='button-one'or text()='Show Message']"));//xpath or method
			driver.findElement(By.xpath("//input[@class='form-control' and @id='single-input-field']"));//xpath and method
			driver.findElement(By.xpath("//a[starts-with(text(),'Ajax Form Submit')]"));//xpath starts with
			//using xpath contains
			driver.findElement(By.xpath("//a[contains(@href,'date-picker')]"));
			driver.findElement(By.xpath("//ul[contains(@class,'list-group-flush')]"));
			driver.findElement(By.xpath("//div[contains(@id,'collapsibleNavbar')]"));
			driver.findElement(By.xpath("//a[text()='Ajax Form Submit']"));
			driver.navigate().to("https://www.flipkart.com/");
			driver.findElement(By.xpath("//img[contains(@alt,'Mobiles & Tablets')]"));
			driver.findElement(By.xpath("//img[contains(@title,'Flipkart')]"));
			//using xpath or
			driver.navigate().back();
			driver.findElement(By.xpath("//input[@id='value-a' or placeholder='Enter Value' ]"));
			driver.findElement(By.xpath("//a[@href='ajax-form-submit.php' or text()='Ajax Form Submit' ]"));
			driver.findElement(By.xpath("//button[@id='button-two' or text()='Get Total']"));
			driver.findElement(By.xpath("//input[@id='single-input-field' or @placeholder='Message']"));
			driver.findElement(By.xpath("//a[text()='Radio Buttons Demo' or @href='radio-button-demo.php']"));
			//using xpath  and
			driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
			driver.findElement(By.xpath("//input[@class='form-check-input' and @id='gridCheck']"));
			driver.findElement(By.xpath("//div[@id='message-one' and @class='my-2']"));
			driver.findElement(By.xpath("//input[@id='check-box-one' and @type='checkbox']"));
			driver.findElement(By.xpath("//input[@id='button-two' and @value='Select All']"));
			driver.findElement(By.xpath("//a[text()='Home' and @class='nav-link']"));
			//using xpath starts-with
			driver.findElement(By.xpath("//a[starts-with(@href,'drag-drop')]"));
			driver.findElement(By.xpath("//a[starts-with(@href,'radio-button-demo')]"));
			driver.findElement(By.xpath("//a[starts-with(@href,'jquery-progress-bar')]"));
			driver.findElement(By.xpath("//a[starts-with(@href,'ajax-form-submit')]"));
			driver.findElement(By.xpath("//a[starts-with(@href,'drag-drop')]"));
			
			
	}
	

@Test
public void axesMethod()
{
	driver.findElement(By.xpath("//label[@for='inputEmail4']//parent::div[@class='form-group']"));//parent
	driver.findElement(By.xpath("//div[@class='form-group']//child::label[@for='inputEmail4']"));//child
	driver.findElement(By.xpath("//div[@class='form-group']//following::button[@id='button-one']"));//following
	driver.findElement(By.xpath("//div[@class='form-group']//preceding::label[@for='inputEmail4']"));//preceding
	driver.findElement(By.xpath("//div[@class='form-group']//ancestor::section[@class='clearfix']"));//ancestor
	driver.findElement(By.xpath("//div[@class='form-group']//descendant::input[@id='value-a']"));//descendant same locator
	driver.findElement(By.xpath("//input[@id='value-a']//parent::div[@class='form-group']//descendant::input[@id='value-a']"));//descendant same locator
	driver.findElement(By.xpath("//button[@id='button-one']//self::button"));//self
}
@Test
public void axesMethod1()
{
	//using parent
	driver.findElement(By.xpath("//div[@class='container']//parent::div[@class='header-top']"));
	driver.findElement(By.xpath("//li[@class='nav-item']//parent::ul[@class='navbar-nav']"));
	driver.navigate().to("https://selenium.obsqurazone.com/bootstrap-dual-list.php");
	driver.findElement(By.xpath("//select[@multiple='multiple']//parent::div[@class='box1 col-md-6']"));
	driver.findElement(By.xpath("//span[@class='info-container']//parent::div[@class='box1 col-md-6']"));
	driver.findElement(By.xpath("//div[@class='container']//parent::div[@class='header-top']"));
	//using child
	driver.findElement(By.xpath("//div[@class='row']//child::a[@class='navbar-brand']"));
	driver.findElement(By.xpath("//div[@class='container']//child::div[@class='top-logo']"));
	driver.findElement(By.xpath("//div[@class='row']//child::ul[@class='navbar-nav']"));
	driver.findElement(By.xpath("//div[@class='container']//child::button[@class='navbar-toggler']"));
	driver.findElement(By.xpath("//div[@class='example my-3']//child::a[starts-with(text(),'Bootstrap')]"));
	//using following
	driver.findElement(By.xpath("//div[@class='example my-3']//following::span[text()='Showing all 8']"));
	driver.findElement(By.xpath("//div[@class='btn-group buttons']//following::button[@title='Move all']"));
	driver.findElement(By.xpath("//div[@class='card-header']//following::a[starts-with(text(),'Jquery')]"));
	driver.findElement(By.xpath("//div[@class='card']//following::form[@id='demoform']"));
	driver.findElement(By.xpath("//span[@class='info-container']//following::span[text()='Showing all 8']"));
	//using preceding
	driver.navigate().back();
	driver.findElement(By.xpath("//input[@class='form-control']//preceding::div[contains(text(),'Two Input')]"));
	driver.findElement(By.xpath("//button[@type='button']//preceding::label[text()='Enter value A']"));
	driver.findElement(By.xpath("//input[@type='text']//preceding::div[contains(text(),'Two Input')]"));
	driver.findElement(By.xpath("//div[@class='my-2']//preceding::label[@for='inputEmail4']"));
	driver.findElement(By.xpath("//div[@class='my-2']//preceding::input[@id='value-a']"));
	//using ancestors
	driver.findElement(By.xpath("//a[@class='nav-link']//ancestor::div[@class='mb-sec']"));
	driver.findElement(By.xpath("//div[@class='row']//ancestor::div[@class='header-top']"));
	driver.findElement(By.xpath("//img[@src='images/logo.png']//ancestor::div[@class='header-top']"));
	driver.findElement(By.xpath("//li[@class='list-group-item']//ancestor::section[@class='clearfix']"));//clearfix is a grandparent 
	driver.findElement(By.xpath("//div[contains(text(),'Menu')]//ancestor::div[@class='row']"));
	//using descendant
	driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
	driver.findElement(By.xpath("//button[@type='button']//parent::form[@method='POST']//descendant::div[@id='message-two']"));
	driver.findElement(By.xpath("//select[@class='form-control']//descendant::option[contains(text(),'Select')]"));
	driver.findElement(By.xpath("//select[@id='multi-select-field']//descendant::option[@value='Red']"));
	driver.findElement(By.xpath("//li[@class='list-group-item']//descendant::a[text()='Simple Form Demo']"));
	driver.findElement(By.xpath("//a[@href='index.php']//descendant::img[@alt='logo']"));
	//using self
	driver.findElement(By.xpath("//div[@class='mb-sec']//self::div[@class='mb-sec']"));
	driver.findElement(By.xpath("//button[@id='button-first']//self::button"));
	
	
	
	
	
	
}
}
