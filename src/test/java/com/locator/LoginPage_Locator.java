package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.base.BaseClass;

public class LoginPage_Locator extends BaseClass{
	
public static WebElement clickLogin() {
	return driver.findElement(By.xpath("//a[text()='Log in']"));
	
	}
public static WebElement getUserName() {
	return driver.findElement(By.xpath("//input[@name='email']"));
    }
public static WebElement getPassWord() {
	return driver.findElement(By.xpath("//input[@name='password']"));
    }
public static WebElement getLogin() {
	return driver.findElement(By.xpath("//button[text()='LOGIN']"));
    }
}
