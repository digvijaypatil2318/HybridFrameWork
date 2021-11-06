package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;
import com.UtilsLayer.Actionsclass;
import com.UtilsLayer.HandleDropDown;

public class HomePage extends BaseClass{
	
	

	@FindBy(id = "menu_pim_viewPimModule")
	WebElement PimButton;

	@FindBy(xpath = "//*[@id=\"empsearch_employee_name_empName\"]")
	WebElement EmpName;

	@FindBy(xpath = "//*[@id=\"empsearch_id\"]")
	WebElement EmpId;
	
	
	@FindBy(xpath = "//*[@id=\"empsearch_supervisor_name\"]")
	WebElement SupName;
	
	@FindBy(xpath="//*[@id=\"empsearch_employee_status\"]")
	WebElement EmpStatus;
	
	@FindBy(xpath="//*[@id=\"empsearch_termination\"]")
	WebElement EmpInclude;
	
	@FindBy(xpath="//*[@id=\"empsearch_job_title\"]")
	WebElement EmpTitle;

	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnPimButton() {
		PimButton.click();
	}
	
	public void typeEmpname(String empname) {
		EmpName.sendKeys(empname);
	}
	
	public void typeEmpId(String empid) {
		EmpId.sendKeys(empid);
	}
	public void typesupName(String supname) {
		SupName.sendKeys(supname);
	}
	
	public void selectEmpStatus() {
		HandleDropDown hd=new HandleDropDown();
		hd.seleByVisibleText(EmpStatus, "Freelance");
	}
	
	public void getOptionsEmpstatus() {
		HandleDropDown hd=new HandleDropDown();
		hd.getAllOptions(EmpStatus);
	}
	
	public void rightClickOnLogin() {
		Actionsclass act=new Actionsclass();
		act.contectClick(PimButton);
	}
	
	public void selectEmpInclude() {
		HandleDropDown hd=new  HandleDropDown();
		hd.selectByIndex(EmpInclude, 0);
	}
	public void selectOptuionsInclude() {
		HandleDropDown hd= new HandleDropDown();
		hd.getAllOptions(EmpInclude);
	}
}
