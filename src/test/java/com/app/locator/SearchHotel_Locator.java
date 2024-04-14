package com.app.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchHotel_Locator extends LoginPage_Locator {
	
	public static WebElement getLocation() {
		return driver.findElement(By.id("location"));		
	}	
	public static WebElement getHotel() {
		return driver.findElement(By.id("hotels"));		
	}
	public static WebElement getRoom() {
		return driver.findElement(By.xpath("//select[@id='room_type']"));
    }
	public static WebElement getNoOfRoom() {
		return driver.findElement(By.xpath("//select[@id='room_nos']"));		
    }
		public static WebElement getCheckinDate() {
		return driver.findElement(By.xpath("//input[@id='datepick_in']"));
    }
	public static WebElement getCheckoutDate() {
		return driver.findElement(By.xpath("//input[@id='datepick_out']"));
    }
	public static WebElement getAdults() {
		return driver.findElement(By.xpath("//select[@id='adult_room']"));
    }
	public static WebElement getChildren() {
		return driver.findElement(By.xpath("//select[@id='child_room']"));
    }
	public static WebElement clickSearch() {
		return driver.findElement(By.xpath("//input[@id='Submit']"));
    }
	}