package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.BeforeClass;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
public static  WebDriver driver = null;

public static void browser(String url) {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
}
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
public static void select_value(WebElement element, String data) {
	Select s = new Select(element);
	s.selectByValue(data);
}
public static String excelRead(int a, int b) {
	String value = null;
	try {
		FileInputStream fis = new FileInputStream(new File("C:\\Ec\\Hotel\\src\\test\\resources\\TestData\\Excel1.xlsx"));
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		Row row = sheet.getRow(a);
		Cell cell = row.getCell(b);
		CellType cellType = cell.getCellType();
		if (cellType ==CellType.STRING) {
			value = cell.getStringCellValue();
		}else if (cellType ==CellType.NUMERIC) {
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
				value = sf.format(dateCellValue);
			}else {
			double numericCellValue = cell.getNumericCellValue();
			long numericValue = (long) numericCellValue;
			value = String.valueOf(numericValue);
			}
		}
     }
	    catch(FileNotFoundException e ) {
	    e.printStackTrace();
       }
	    catch(IOException e) {
	    	e.printStackTrace();
	    }
	return value;
}
public static void dropDown_Value(WebElement element,String value) {
	
	try {
		Select s = new Select(element);
		s.selectByValue(value);
	} catch (Exception e) {
		throw new RuntimeException("");
	}
	
}
public static void dropDown_VisbleText(WebElement element,String value) {
	Select s = new Select(element);
	s.selectByVisibleText(value);
	
}

public static void dropDown_Index(WebElement element,int value) {
	Select s = new Select(element);
	s.deselectByIndex(value);
	
}
public static String prop_reuse(String data) {
	String value = null;

	try {
		FileReader read = new FileReader("C:\\Ec\\Hotel\\src\\test\\resources\\TestData\\configure.properties");
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
public static void excelWrite(String data) {

	try {
		File file = new File("C:\\Ec\\Hotel\\src\\test\\resources\\TestData\\Excel1.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wk = new XSSFWorkbook(fis);
		Sheet createSheet = wk.createSheet("Sheet2");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue(data);
		FileOutputStream fw=new FileOutputStream(file);
		wk.write(fw);
		fw.close();
		System.out.println("Written Successfully");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
}

public static void get_values(WebElement element, String data) {
	
	wait1();
	String data1 = element.getAttribute(data);
	
	excelWrite(data1);
	
}

public static void wait1 () {
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
}

}
