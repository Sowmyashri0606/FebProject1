package com.base;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	import java.text.SimpleDateFormat;
	import java.util.Date;
	import java.util.Properties;

	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.CellType;
	import org.apache.poi.ss.usermodel.DateUtil;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.NoSuchElementException;
	import org.openqa.selenium.TimeoutException;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;


	public class BaseClass {
	public static WebDriver driver =null;

	public static void input_Text(WebElement element, String data) {
		try {
		element.sendKeys(data);
		}
		catch(TimeoutException e) {
	    throw new RuntimeException("unable to load the browser"); 
		}
	    catch (NoSuchElementException e) {
		throw new RuntimeException("Unable to locate the element");
	}	
	}
	public static void click_value(WebElement element) {
		element.click();
	}
	public static void clear_value(WebElement element) {
		element.clear();
	}
	public static String prop(String data){
		String value = null;
		try {
			FileReader read = new FileReader("C:\\Ec\\Task\\src\\test\\resources\\TestData\\input.properties");
			Properties prop = new Properties();
			prop.load(read);
			value = prop.getProperty(data);
			System.out.println(value);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;			
	}
	public static String excelRead(int a, int b) {
		String value = null;
		try {
			FileInputStream fis = new FileInputStream(
					new File("C:\\Ec\\Task\\src\\test\\resources\\TestData\\Book1.xlsx"));
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("Sheet1");
			Row row = sheet.getRow(a);
			Cell cell = row.getCell(b);
			int cellType = cell.getCellType();
			if (cellType == 1) {
				value = cell.getStringCellValue();
			} else if (cellType == 0) {
				if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
					value = sf.format(dateCellValue);
				} else {
					double numericCellValue = cell.getNumericCellValue();
					long numericValue = (long) numericCellValue;
					value = String.valueOf(numericValue);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}
	public static void dropDown_Value(WebElement element,String value) {

			Select s = new Select(element);
			s.selectByValue(value);

	}
	}

