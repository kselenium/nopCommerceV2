package com.nopcommerce.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SearchCustomer
{

	public WebDriver ldriver;
	
	public SearchCustomer(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	By txtEmail = By.xpath("//input[@id='SearchEmail']");
	By txtFname = By.xpath("//input[@id='SearchFirstName']");
	By txtLname = 	By.xpath("//input[@id='SearchLastName']");
	
	
	
	
}
