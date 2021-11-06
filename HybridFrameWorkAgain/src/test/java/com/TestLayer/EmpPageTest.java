package com.TestLayer;

import javax.net.ssl.ExtendedSSLSession;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.EmpPage;

public class EmpPageTest extends HomePageTest {
	EmpPage lmn;
	
	/*@BeforeClass
	public void setUp() {
		BaseClass.initilization();
	}
	*/	
	@Test(priority=7)
	public void validateEmpPage() {
		 lmn = new EmpPage();
		 lmn.clickAddButton();
		 lmn.typeFirstName("Digvijay");
		 lmn.typeMiddleName("Ranveer");
		 lmn.typeLstName("patil");
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}

}
