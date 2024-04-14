package com.app.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BookHotel_Locator extends SelectHotel_Locator {
	
	public static WebElement getName1() {
		return driver.findElement(By.xpath("//input[@id='first_name']"));
    }
	public static WebElement getName2() {
		return driver.findElement(By.xpath("//input[@id='last_name']"));	
    }
	public static WebElement getAddress() {
		return driver.findElement(By.xpath("//textarea[@id='address']"));	
    }
	public static WebElement getCCNum() {
		return driver.findElement(By.xpath("//input[@id='cc_num']"));	
    }
	public static WebElement getCCType() {
		return driver.findElement(By.xpath("//select[@id='cc_type']"));	
    }
	public static WebElement getexpMnt() {
		return driver.findElement(By.xpath("//select[@id='cc_exp_month']"));	
    }
	public static WebElement getexpYr() {
		return driver.findElement(By.xpath("//select[@id='cc_exp_year']"));	
    }
	public static WebElement getCVV() {
		return driver.findElement(By.xpath("//input[@id='cc_cvv']"));	
    }
	public static WebElement clickBook() {
		return driver.findElement(By.xpath("//input[@id='book_now']"));	
    }


}
