package com.UtilsLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.BaseLayer.BaseClass;

public class Actionsclass  extends BaseClass{
	
	
	public void scrollDown() {
	Actions act = new Actions(driver);
	act.keyDown(Keys.CONTROL).sendKeys(Keys.END).keyUp(Keys.CONTROL).build().perform();
	}
	
	public void clickOnButton(WebElement wb) {
		
		Actions act = new Actions(driver);
		act.click(wb).build().perform();
	}
	
	public void contectClick(WebElement wb) {
		
		Actions act = new Actions(driver);
		act.contextClick(wb).build().perform();
		
	}

}
