package com.TestLayer;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.HomePage;
import com.UtilsLayer.Actionsclass;
import com.UtilsLayer.TakesScreenshot1;

public class HomePageTest extends LoginPageTest{
	
	HomePage abc;
	WebDriver driver;
	/*
	@BeforeClass
	public void setUp() {
		BaseClass.initilization();
	}
	*/
	
	@Test(priority=6)
	public void validateHomePageFunctionality() throws Throwable  {
		 abc = new  HomePage();
		 abc.clickOnPimButton();
		 abc.typeEmpname("ganesh");
		 abc.typeEmpId("102");
		 abc.typesupName("ramesh");
		 
		 Thread.sleep(3000);
		 Actionsclass act=new Actionsclass();
		 act.scrollDown();
		 
		abc.selectEmpStatus();
		abc.getOptionsEmpstatus();
		
		abc.rightClickOnLogin();
		
		abc.selectEmpInclude();
		
		abc.selectOptuionsInclude();
		
		
		 
		
	}
	/*
	public void tearDown() {
		driver.close();
	}
	*/

}
