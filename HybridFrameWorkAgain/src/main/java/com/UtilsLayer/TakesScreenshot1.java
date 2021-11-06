package com.UtilsLayer;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.BaseLayer.BaseClass;

public class TakesScreenshot1  extends BaseClass{
	
	//public static WebDriver driver;
	
	public  void  takesScreenShot () throws IOException {
		
		TakesScreenshot ts = ( TakesScreenshot)driver;
		File f = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\DELL\\eclipse-workspace\\HybridFrameWorkAgain\\screenshot\\abc.png"));
		
	}

		

	

}
