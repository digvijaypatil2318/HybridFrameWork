package com.BaseLayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static Properties prop;
	public static WebDriver driver;
	public static FileInputStream fis;

	public BaseClass()  {
		prop = new Properties();
				
		try {
			 fis = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\HybridFrameWorkAgain\\src\\main\\java\\com\\ConfigLayer\\config.properties");
			try {
				prop.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void initilization() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}
}
