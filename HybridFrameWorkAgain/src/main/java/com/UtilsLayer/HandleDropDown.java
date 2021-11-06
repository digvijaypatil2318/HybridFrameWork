package com.UtilsLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	

	

	public void seleByVisibleText(WebElement wb,String visibleText) {
		Select sel=new Select(wb);
		sel.selectByVisibleText(visibleText);
	}

	public void selectByValue(WebElement wb,String value) {
		Select sel=new Select(wb);
		sel.selectByValue(value);
	}

	public void selectByIndex(WebElement wb,int index) {
		Select sel=new Select(wb);
		sel.selectByIndex(index);
	}

	public void getAllOptions(WebElement wb) {
		Select sel=new Select(wb);
		List<WebElement> ls = sel.getOptions();
		for (WebElement abc : ls) {
			String a = abc.getText();
			System.out.println(a);
		}

	
	}
	public void selectedOptions(WebElement wb) {
		Select sel=new Select(wb);

		WebElement wx=sel.getFirstSelectedOption();
		System.out.println(wx);

	}
	
	
	}



