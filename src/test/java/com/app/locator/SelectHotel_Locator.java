package com.app.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SelectHotel_Locator extends SearchHotel_Locator{
	
	public static WebElement clickRadiobtn() {
		return driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
    }
	public static WebElement clickContinue() {
		return driver.findElement(By.xpath("//input[@id='continue']"));
    }
	
}
