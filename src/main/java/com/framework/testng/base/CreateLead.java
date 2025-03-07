package com.framework.testng.base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class CreateLead  extends BaseClass
{
	@Test()
	public  void runCreate()

{
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("udai");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("k");
		driver.findElement(By.name("submitButton")).click();
}
}






