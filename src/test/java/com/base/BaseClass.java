package com.base;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.junit.BeforeClass;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
public static WebDriver driver = null;
@BeforeClass
public static void  browser () {
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get(prop_reuse("Url"));
}
public static void clear_value(WebElement element) {
	element.clear();
}
public static void click_value(WebElement element) {
	element.click();
}
public static void input_text (WebElement element, String data) {
	try{
		element.sendKeys(data);
	}catch(TimeoutException e) {
		throw new RuntimeException ("Unable to load the browser");
	}
	catch(NoSuchElementException e) {
	    throw new RuntimeException ("Unable to locate the element");
    }
}
public static String prop_reuse(String data) {
	String value =null;
	try {
		FileReader fr = new FileReader("C:\\Ec\\Letcode\\src\\test\\resources\\Data\\Credentials.properties");
		Properties prop = new Properties();
			prop.load(fr);
			value = prop.getProperty(data);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return value; 
}


}
