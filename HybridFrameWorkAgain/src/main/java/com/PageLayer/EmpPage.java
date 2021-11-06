package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;

public class EmpPage extends BaseClass {

	@FindBy(xpath = "//*[@id=\"btnAdd\"]")
	WebElement addbutton;

	@FindBy(xpath = "//*[@id=\"firstName\"]")
	WebElement firstname;

	@FindBy(xpath = "//*[@id=\"middleName\"]")
	WebElement middlename;

	@FindBy(xpath = "//*[@id=\"lastName\"]")
	WebElement lastname;

	public EmpPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickAddButton() {
		addbutton.click();
	}
	
	public void typeFirstName( String fname) {
		firstname.sendKeys(fname);
	}
	
	public void typeMiddleName(String mname) {
		middlename.sendKeys(mname);
	}
	
	public void typeLstName(String lname) {
		lastname.sendKeys(lname);
		
	}
	
	
	

}
