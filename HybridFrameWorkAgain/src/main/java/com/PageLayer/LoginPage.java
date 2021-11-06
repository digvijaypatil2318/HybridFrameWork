package com.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;
import com.UtilsLayer.Actionsclass;

public class LoginPage extends BaseClass {
	
	@FindBy(id="txtUsername")
	WebElement username;
	
	@FindBy(id="txtPassword")
	WebElement password;

	@FindBy(id="btnLogin")
	WebElement btnLog;



	public  LoginPage() {
		PageFactory.initElements(driver, this);
		
	
	}
	
	public void typeUserName(String uname) {
		username.sendKeys(uname);
	}
	
	public void typePassword(String pass) {
		password.sendKeys(pass);
	}
	
	//public void clickOnButton() {
		//btnLog.click();
	//}
	
	public void click() {
		Actionsclass act = new Actionsclass();
		act.clickOnButton(btnLog);
		
	}
	
}

