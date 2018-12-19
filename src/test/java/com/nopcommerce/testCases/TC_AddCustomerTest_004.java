package com.nopcommerce.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.nopcommerce.pageObjects.AddcustomerPage;
import com.nopcommerce.pageObjects.LoginPage;

public class TC_AddCustomerTest_004 extends Baseclass
{
	

	@Test
	public void  addNewCustomer() throws IOException, InterruptedException
	{
		driver.get(baseURL);
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(username);
	logger.info("Username is provided.......");
		
		lp.setPassword(password);
		logger.info("Password provided.................");
		
		lp.clickLogin();
		logger.info("Login Clicked........");
		
		
		logger.info("Providing customer Details.....");
		
		
		AddcustomerPage addcust = new AddcustomerPage(driver);
		
		addcust.clickOnCustomersMenu();
		addcust.ClickOnCustomersMenuItem();
		addcust.ClickOnAddnew();
		
		String email = randomestring() +"@gmail.com";
		addcust.setEmail(email);
		
		addcust.setPasword("test123");
		
		addcust.setCustomerRoles("Guests");
		
		//addcust.setCustomerRoles("Administrators");
		addcust.setManagerOfVendor("Vendor 2");
		addcust.setGender("male");
		addcust.setFirstName("smith");
		addcust.setLastName("bin");
		addcust.setDob("7/09/1987");
		addcust.setCompanyName("BusyQa");
		addcust.setAdminContent("Selenium Testing");
		addcust.clickOnSave();
		
		logger.info("Validation Started.....");
		
		String msg = driver.findElement(By.tagName("body")).getText();
		
		if(msg.contains("The new customer has been added successfully"))
		{
			Assert.assertTrue(true);
			logger.info("Test case passed..");
		}
		
		else
		{
			captureScreen(driver,"addNewCustomer");
			Assert.assertTrue(false);
		}
	}
}
