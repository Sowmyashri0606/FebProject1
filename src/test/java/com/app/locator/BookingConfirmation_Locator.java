package com.app.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BookingConfirmation_Locator extends BookHotel_Locator {
	
	public static WebElement getOrderNo() {
		return driver.findElement(By.xpath("//input[@id='order_no']"));	
    }
}
