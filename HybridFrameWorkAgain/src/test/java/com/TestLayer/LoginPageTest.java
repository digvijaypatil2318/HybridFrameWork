package com.TestLayer;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.LoginPage;
import com.UtilsLayer.TakesScreenshot1;

public class LoginPageTest extends BaseClass {
	LoginPage abc;

	@BeforeClass
	public void setUp() {
		BaseClass.initilization();
	}

	@Test(priority=5)
	public void validateLoginFunctionality() throws Throwable {
		 abc = new LoginPage();
		 abc.typeUserName(prop.getProperty("username"));
		 abc.typePassword(prop.getProperty("password"));
		 //abc.clickOnButton();
		 abc.click();
		 
		 
		 TakesScreenshot1 abc = new TakesScreenshot1();
		 abc.takesScreenShot();
		 
	}
	/*
	@AfterClass
	public void tearDown() {
		driver.close();
	}
*/
}
