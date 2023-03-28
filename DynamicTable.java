package com.obsqura.TestNGproject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.util.Strings;

public class DynamicTable extends Base {
	@Test
	public void table()
	{
		String actual;
		driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");
		List <String> expected=new ArrayList<String>();
		expected.add("Name");
		expected.add("Position");
		expected.add("Office");
		expected.add("Age");
		expected.add("Start date");
		expected.add("Salary");
		System.out.println(expected);
		List<WebElement> header=driver.findElements(By.xpath("//tr[@role='row']//child::th"));
		for(WebElement heading:header)
		{
			actual= heading.getText();
			System.out.println(actual);	
			assertTrue(expected.contains(actual), "Expected and actual are not same");
		}
	}
	@Test
	public void countOfRowsIntable()
	{
		int actualCount=0;
		int expectedCount=10;
		driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");
		List<WebElement> rowData=driver.findElements(By.xpath("//table[@id='dtBasicExample']//parent::tbody//child::tr"));
		for(WebElement data:rowData)
		{
			String rows=data.getText();
			System.out.println(rows);
			actualCount++;
		}
		System.out.println(actualCount);
		assertEquals(actualCount, expectedCount, "Actual and expected count of rows in table is same");
	}

	@Test
	public void verifyDataInListfromTable()
	{
		String expectedData="Ashton Cox Junior Technical Author San Francisco 66 2009/01/12 $86,000";
		driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");
		List<WebElement> table=driver.findElements(By.xpath("//table[@id='dtBasicExample']"));
		for(WebElement data:table)
		{
			String actualData=data.getText();
			System.out.println(actualData);
			assertTrue(actualData.contains(expectedData), "Expected data is not in table");
		}
	}
	@Test
	public void verifyDatainTablefilter()
	{
		String actualData = null;
		String expectedData="Ashton Cox";
		driver.navigate().to("https://selenium.obsqurazone.com/table-filter.php");
		WebElement input=driver.findElement(By.xpath("//label[text()='Search:']//child::input"));
		input.sendKeys(expectedData);
		List<WebElement> resultTable=driver.findElements(By.xpath("//tr[@class='odd']"));
		for(WebElement data:resultTable)
		{
			actualData=data.getText();
			System.out.println(actualData);
			assertTrue(actualData.contains(expectedData), "Data is not same");
		}
		
	}
	@Test
	public void verifyDataInListfromTable1()
	{
		String expectedData="Ashton Cox Junior Technical Author San Francisco 66 2009/01/12 $86,000";
		driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");
		List<WebElement> table=driver.findElements(By.xpath("//table[@id='dtBasicExample']"));
		for(WebElement data:table)
		{
			ArrayList <String> al=new ArrayList<String>();
			String actualData=data.getText();
			al.add(actualData);
			System.out.println(al);
			for(String a:al)
			{
				System.out.println(a);
				assertTrue(a.contains(expectedData), "Expected data is not in table");
			}
		}
	}

}
