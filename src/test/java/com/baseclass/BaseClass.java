package com.baseclass;

import java.util.concurrent.TimeoutException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseClass {
public static  WebDriver driver = null;

public static void input_text(WebElement element, String data ) {
	try {
element.sendKeys(data);
	}
	catch(Exception e ) {
		throw new RuntimeException ();
	}
	
}
}
