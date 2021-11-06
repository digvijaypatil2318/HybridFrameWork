package com.TestLayer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.UtilsLayer.ExcelReader;

public class ExcelReaderTest {
	WebDriver driver;

	@Test(dataProvider = "Instagram")
	public void setUp(String username1, String password) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys(username1);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@DataProvider(name = "Instagram")
	public Object[][] testData() throws Throwable {
		ExcelReader obj = new ExcelReader(
				System.getProperty("user.dir") + "\\src\\main\\java\\com\\TestDataLayer\\Instagramsheet.xlsx");
		int row = obj.rowCount(0);
		Object[][] data = new Object[row][2];

		for (int i = 0; i < row; i++) {
			data[i][0] = obj.getData(0, i, 0);
			data[i][1] = obj.getData(1, i, 1);
		}

		return data;

	}

}
