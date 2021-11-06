package com.UtilsLayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ExcelReader {
	public static WebDriver driver;
	public static FileInputStream fis;
	public static XSSFWorkbook wb;

	public ExcelReader(String excelpath) throws Throwable {

		File f = new File(excelpath);
		try {
			fis = new FileInputStream(f);
			wb = new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	public String getData(int sheetIndex, int row, int coloumn) {
		XSSFSheet sheet = wb.getSheetAt(0);
		String data = sheet.getRow(row).getCell(coloumn).getStringCellValue();
		return data;
	}

	public int rowCount(int sheetIndex) {
		int rows = wb.getSheetAt(sheetIndex).getLastRowNum();
		rows = rows + 1;
		return rows;
	}

}
