package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class Page_Locator extends BaseClass{
	public static WebElement oneway() {
	    return driver.findElement(By.xpath("(//span[@class='tgl-btn'])[2]")); 
		}
	public static WebElement enter_from() {
	    return driver.findElement(By.xpath("//input[@name='from1']")); 
		}
	public static WebElement enter_to() {
	    return driver.findElement(By.xpath("//input[@name='to1']")); 
		}
}
