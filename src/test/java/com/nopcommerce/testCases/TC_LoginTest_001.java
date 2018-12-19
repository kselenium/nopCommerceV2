package com.nopcommerce.testCases;


import java.io.IOException;

import org.testng.Assert;

import org.testng.annotations.Test;

import com.nopcommerce.pageObjects.LoginPage;

public class TC_LoginTest_001 extends Baseclass
{

	
	@Test
	public void loginTest() throws InterruptedException, IOException
	{
		driver.get(baseURL);
			
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(username);
	logger.info("Username is provided.......");
		
		lp.setPassword(password);
		logger.info("Password provided.................");
		
		lp.clickLogin();
		logger.info("Login Clicked........");
		
		Thread.sleep(5000);
		
		if (driver.getTitle().equals("Dashboard / nopCommerce administration"))
		{
			lp.Logout();
	       Assert.assertTrue(true);
	       logger.info("Login Passed .................");
			
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login Failed..........");
		}
		
		
		
	}

	
}


